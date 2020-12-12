package Main.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;

	
	public LoginPage() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel1 = new JLabel("심심해닷컴");
		lblNewLabel1.setIcon(new ImageIcon(MainPage.class.getResource("/image/simsimcom.png")));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel1.setBounds(10, 20, 250, 50);
		contentPane.add(lblNewLabel1);
		
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 150, 732, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(229, 300, 91, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("비밀번호");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(229, 400, 91, 31);
		contentPane.add(label);
		
		JTextField idField = new JTextField();
		idField.setBounds(333, 300, 160, 29);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
					clickLoginButton(idField.getText(), passwordField.getText());
			}
		});
		passwordField.setColumns(10);
		passwordField.setBounds(333, 400, 160, 29);
		contentPane.add(passwordField);
		
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new SignUpPage().setVisible(true);
				dispose();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(200, 500, 128, 50);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("로그인");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				clickLoginButton(idField.getText(), passwordField.getText());
			}
		});
		button.setBounds(400, 500, 128, 50);
		contentPane.add(button);
		
		JLabel mainpicture = new JLabel("");
		mainpicture.setIcon(new ImageIcon(MainPage.class.getResource("/image/mainbae1.jpg")));
		mainpicture.setBounds(0, 0, 734, 711);
		contentPane.add(mainpicture);
		
		
	}
	
	private void clickLoginButton(String id, String password) {
		UserDAO dao = new UserDAO();
		int check = dao.login(id, password);
		if(check == 1) { //로그인 성공
			String name = dao.getName(id);
			JOptionPane.showMessageDialog(null, name+"님 환영합니다!");
			new MainPage().setVisible(true);
			dispose();
			setVisible(false);
		} else if(check==0) {
			JOptionPane.showMessageDialog(null, "해당 아이디는 없는 아이디입니다.");
		} else if(check==-1) {
			JOptionPane.showMessageDialog(null, "잘못된 비밀번호입니다.");
		} else if(check==-2) {
			JOptionPane.showMessageDialog(null, "다시 입력해주세요.");
		}
	}
}
