package Main.nangjanggo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Main.main.MainPage;

public class MyngoMain extends JFrame {

	private JPanel contentPane;
	static String MainJ;


	public MyngoMain() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("메인 재료를 선택해주세요\r\n");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBackground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(213, 164, 259, 79);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(UIManager.getColor("Button.disabledForeground"));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "다음 재료를 골라주세요");
				dispose();
				setVisible(false);
				new MyngoQ1().setVisible(true);
				MainJ = (String)comboBox.getSelectedItem();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"돼지고기", "소고기", "닭고기","오징어","계란","소세지"}));
		comboBox.setBounds(187, 286, 314, 95);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("메인 재료     :");
		lblNewLabel_1.setBounds(63, 319, 110, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("메인으로 돌아가기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MainPage().setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(259, 485, 173, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MyngoMain.class.getResource("/main/nangjanggo/main.jpg")));
		lblNewLabel_2.setBounds(0, 0, 750, 750);
		contentPane.add(lblNewLabel_2);
	}
}
