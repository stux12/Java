package A_Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import B_EasyTest.EasyTest01;
import C_MiddleTest.MiddleTest01;
import D_HardTest.HardRandom;
import D_HardTest.HardTest01;

import javax.swing.ImageIcon;
import javax.swing.JSpinner;

public class JavaTestList extends JFrame {

	private JPanel Pane;
	protected int EasyCount; // 정답 카운트
	protected int EasytleCount; // 오답 카운트
	protected int[] Easytle = new int[10]; // 오답 뭔지 확인
	protected int MiddleCount;
	protected int MiddletleCount;
	protected int[] Middle = new int[10];
	protected int HardCount;
	protected int HardtleCount;
	protected int[] Hard = new int[10];
	protected int turn;
	protected int[] test = new int[10];
	protected int num;	
	protected Timer time;
	protected int timer;

	public JavaTestList() {

		// 창 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		Pane = new JPanel();
		Pane.setBackground(new Color(255, 255, 255));
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
		EasyStart.setBounds(118, 236, 519, 74);
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
		MiddleStart.setBounds(118, 358, 519, 74);
		Pane.add(MiddleStart);

		JButton HardStart = new JButton("당신은 자바의 신?? \r\n입력받는 값도 있고 문제도 랜덤으로 나오게끔 하기 시간타이머도 넣기");
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
		HardStart.setBounds(118, 479, 519, 74);
		Pane.add(HardStart);

		JButton Back = new JButton("이전으로 돌아가기");
		Back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTestMain().setVisible(true);
			}
		});
		Back.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		Back.setBounds(39, 620, 174, 52);
		Pane.add(Back);

		JButton Exit = new JButton("종료 하기");
		Exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		Exit.setBounds(529, 620, 174, 52);
		Pane.add(Exit);

		// 라벨 설정
		JLabel lblNewLabel = new JLabel("자신있어서 들어온 당신 한번 골라보시게나~");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 50, 658, 122);
		Pane.add(lblNewLabel);
	}
}
