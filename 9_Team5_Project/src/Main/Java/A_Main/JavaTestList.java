package Main.Java.A_Main;

import java.awt.Color;
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
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Main.Java.B_EasyTest.EasyTest01;
import Main.Java.C_MiddleTest.MiddleTest01;
import Main.Java.D_HardTest.HardRandom;
import Main.main.MainPage;

public class JavaTestList extends JFrame {

	private JPanel Pane;
	protected static int EasyCount; // 정답 카운트
	protected static int EasytleCount; // 오답 카운트
	protected static int[] Easytle = new int[10]; // 오답 뭔지 확인
	protected static int MiddleCount;
	protected static int MiddletleCount;
	protected static int[] Middle = new int[10];
	protected static int HardCount;
	protected static int HardtleCount;
	protected static int[] Hard = new int[5];
	protected static int turn;
	protected static int[] test = new int[10];
	protected static int num;	
	protected Timer time1;
	protected Timer time2;
	protected Timer time3;
	protected Timer time4;
	protected Timer time5;
	protected int timer1=30;
	protected int timer2=25;
	protected int timer3=10;
	protected int timer4=20;
	protected int timer5=15;
	

	public JavaTestList() {

		// 창 설정
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		Pane = new JPanel();
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);

		// 버튼 설정
		JButton EasyStart = new JButton("나는 초보에용~~");
		EasyStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EasyStart.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/chick2.png")));
		EasyStart.setBackground(Color.YELLOW);
		EasyStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest01().setVisible(true);
			}
		});
		EasyStart.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		EasyStart.setBounds(118, 270, 519, 74);
		Pane.add(EasyStart);

		JButton MiddleStart = new JButton("자바를 좀 안다면 드루와~");
		MiddleStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MiddleTest01().setVisible(true);
			}
		});
		MiddleStart.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/드루와.png")));
		MiddleStart.setBackground(Color.GREEN);
		MiddleStart.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		MiddleStart.setBounds(118, 412, 519, 74);
		Pane.add(MiddleStart);

		JButton HardStart = new JButton("당신은 자바의 신??");
		HardStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new HardRandom().setVisible(true);
			}
		});
		HardStart.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/god.png")));
		HardStart.setBackground(Color.BLACK);
		HardStart.setForeground(Color.RED);
		HardStart.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		HardStart.setBounds(118, 549, 519, 74);
		Pane.add(HardStart);



		// 라벨 설정
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/java2.png")));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(67, 26, 600, 200);
		Pane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("이전으로 돌아가기");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MainPage().setVisible(true);
				
			}
		});
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(12, 680, 125, 21);
		Pane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("종료 하기");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(657, 680, 65, 21);
		Pane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/mainbae1.jpg")));
		lblNewLabel_1.setBounds(0, 0, 734, 711);
		Pane.add(lblNewLabel_1);
	
}


}
