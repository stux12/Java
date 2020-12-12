package Main.nangjanggo;

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
import javax.swing.border.EmptyBorder;

import Main.main.MainPage;

public class MyngoQ1 extends MyngoMain {

	private JPanel contentPane;
	static String MainJ2;
	
	public MyngoQ1() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("두번째 재료를 선택해주세요\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(213, 195, 259, 79);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "다음 재료를 골라주세요");
				dispose();
				setVisible(false);
				new MyngoQ2().setVisible(true);
				MainJ2 = (String)comboBox.getSelectedItem();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"양파", "대파","버터"}));
		comboBox.setBounds(186, 286, 314, 95);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("두번째 재료     :");
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