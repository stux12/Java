package Main.main;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Main.Baksa.p_Lover.Lover_00;
import Main.Java.A_Main.JavaTestList;
import Main.nangjanggo.MyngoMain;
import Main.nonsense.project.Main;

public class MainPage extends JFrame {

	private JPanel contentPane;
	
		
		
	public MainPage() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("심심해닷컴");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/image/simsimcom.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 20, 250, 50);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아재력 TEST");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(271, 177, 200, 50);
		contentPane.add(lblNewLabel_1);

		JLabel lblCJava = new JLabel("C언어가 아닌 JAVA TEST");
		lblCJava.setHorizontalAlignment(SwingConstants.LEFT);
		lblCJava.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblCJava.setBounds(235, 333, 236, 50);
		contentPane.add(lblCJava);

		JLabel label_1 = new JLabel("나의 냉장고를 부탁해");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_1.setBounds(250, 487, 200, 50);
		contentPane.add(label_1);

		JLabel lblTest = new JLabel("연애 능력 TEST");
		lblTest.setHorizontalAlignment(SwingConstants.LEFT);
		lblTest.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblTest.setBounds(271, 633, 200, 50);
		contentPane.add(lblTest);

		JLabel back = new JLabel("Log Out");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new LoginPage().setVisible(true);
				dispose();
				setVisible(false);
			}
		});
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		back.setBounds(10, 678, 65, 21);
		contentPane.add(back);

		JLabel Baksa = new JLabel("");
		Baksa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Lover_00().setVisible(true);
			}
		});
		Baksa.setIcon(new ImageIcon(MainPage.class.getResource("/image/yune.jpg")));
		Baksa.setBounds(150, 547, 400, 100);
		contentPane.add(Baksa);

		JLabel naeng = new JLabel("");
		naeng.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MyngoMain().setVisible(true);
			}
		});
		naeng.setIcon(new ImageIcon(MainPage.class.getResource("/image/myneng.png")));
		naeng.setBounds(150, 401, 400, 100);
		contentPane.add(naeng);

		JLabel java = new JLabel("");
		java.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTestList().setVisible(true);
			}
		});
		java.setIcon(new ImageIcon(MainPage.class.getResource("/image/javamain.png")));
		java.setBounds(150, 248, 400, 100);
		contentPane.add(java);

		JLabel ajae = new JLabel("");
		ajae.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new Main().setVisible(true);
			}
		});
		ajae.setIcon(new ImageIcon(MainPage.class.getResource("/image/ajae.jpg")));
		ajae.setBounds(150, 92, 400, 100);
		contentPane.add(ajae);

		JLabel label = new JLabel("종료 하기");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		label.setBounds(657, 680, 65, 21);
		contentPane.add(label);

		JLabel mainpicture = new JLabel("");
		mainpicture.setIcon(new ImageIcon(MainPage.class.getResource("/image/mainbae1.jpg")));
		mainpicture.setBounds(0, 0, 734, 711);
		contentPane.add(mainpicture);
		
		
	}
}
