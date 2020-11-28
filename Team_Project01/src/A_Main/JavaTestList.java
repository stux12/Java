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
import javax.swing.border.EmptyBorder;

import B_EasyTest.EasyTest01;
import C_MiddleTest.MiddleTest01;
import D_HardTest.HardTest01;

import javax.swing.ImageIcon;
import javax.swing.JSpinner;

public class JavaTestList extends JFrame {

	private JPanel contentPane;
	protected static int EasyCount;
	protected static int MiddleCount;
	protected static int HardCount;
	protected static int HardCountTle ; //틀린 문제 수
	protected static int HardCountTle1; //틀린문제 번호
	protected static int HardCountTle2; 
	protected static int HardCountTle3; 
	protected static int HardCountTle4; 
	protected static int HardCountTle5; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTestList frame = new JavaTestList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param middleCount 
	 */
	public JavaTestList() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("나는 초보에용~~");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/chick2.png")));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest01(EasyCount).setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton.setBounds(118, 236, 519, 74);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("자바를 좀 안다면 드루와~");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MiddleTest01(MiddleCount).setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/드루와.png")));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));

		btnNewButton_1.setBounds(118, 358, 519, 74);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton(
				"당신은 자바의 신?? \r\n입력받는 값도 있고 문제도 랜덤으로 나오게끔 하기 시간타이머도 넣기");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new HardTest01().setVisible(true);
			}
		});

		btnNewButton_2.setIcon(new ImageIcon(JavaTestList.class.getResource("/image/god.png")));
	
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton_2.setBounds(118, 479, 519, 74);
		contentPane.add(btnNewButton_2);

		JButton button = new JButton("이전으로 돌아가기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTestMain().setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBounds(39, 620, 174, 52);
		contentPane.add(button);

		JButton btnNewButton_3 = new JButton("종료 하기");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton_3.setBounds(529, 620, 174, 52);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("자신있어서 들어온 당신 한번 골라보시게나~");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 50, 658, 122);
		contentPane.add(lblNewLabel);
	}
}
