package Main.nangjanggo;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Main.main.MainPage;

public class MyngoResult extends MyngoQ2 {

	private JPanel contentPane;
	private JTextField textField;

	public MyngoResult() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("결과보러가기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false);
				new recipe().setVisible(true);
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(259, 485, 173, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("메인으로 돌아가기");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
					dispose();
					setVisible(false);
					new MainPage().setVisible(true);
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(259, 485, 173, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("당신의 선택은 ?");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(271, 176, 158, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("당신이 선택한 것은  "+MainJ+"  " + MainJ2+"  " + MainJ3 +" 입니다 .");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(175, 286, 368, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MyngoMain.class.getResource("/main/nangjanggo/main.jpg")));
		lblNewLabel_2.setBounds(0, 0, 750, 750);
		contentPane.add(lblNewLabel_2);
	}
}
