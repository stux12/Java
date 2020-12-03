package Main.Java.D_HardTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.main.MainPage;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HardTest01 extends HardRandom {

	private JPanel contentPane;
	private JTextField textField;

	public HardTest01() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHell = new JLabel("난이도 HELL");
		lblHell.setIcon(new ImageIcon(HardTest01.class.getResource("/image/Devil.png")));
		lblHell.setForeground(Color.RED);
		lblHell.setOpaque(true);
		lblHell.setHorizontalAlignment(SwingConstants.LEFT);
		lblHell.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblHell.setBackground(Color.BLACK);
		lblHell.setBounds(12, 10, 119, 35);
		contentPane.add(lblHell);

		JLabel label_1 = new JLabel(num + "/5");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_1.setBounds(675, 10, 47, 34);
		contentPane.add(label_1);

		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setForeground(Color.RED);
		label.setBackground(Color.RED);
		label.setBounds(0, 55, 734, 1);
		contentPane.add(label);

		JLabel lblQMain = new JLabel("<html>Q" + num + ". main 메소드 전체를 입력하세요.");
		lblQMain.setForeground(Color.RED);
		lblQMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblQMain.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblQMain.setBounds(64, 118, 600, 100);
		contentPane.add(lblQMain);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					if (textField.getText().equals("public static void main(String[] args)")) {
						HardCount++;
						time1.stop();
						turned();
						dispose();
						setVisible(false);
					} else {
						HardtleCount++;
						time1.stop();
						Hard[num-1]=num;
						turned();
						dispose();
						setVisible(false);
					}
				}
			}
		});
		textField.setForeground(Color.RED);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textField.setBounds(64, 343, 600, 151);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("여기에 입력하세요~");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setBounds(64, 303, 197, 30);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("다음 문제");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField.getText().equals("public static void main(String[] args)")) {
					HardCount++;
					time1.stop();
					turned();
					dispose();
					setVisible(false);
				} else {
					HardtleCount++;
					time1.stop();
					Hard[num-1]=num;
					turned();
					dispose();
					setVisible(false);
				}
			}
		});

		JLabel label_2 = new JLabel("남은시간 : " + timer1 + "초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(405, 303, 236, 35);
		contentPane.add(label_2);

		btnNewButton.setBounds(283, 571, 136, 45);
		contentPane.add(btnNewButton);

		time1 = new Timer(1000, new ActionListener() {
			@Override

			public void actionPerformed(ActionEvent e) {
				if (timer1 >= 0) {
					label_2.setText("남은시간 : " + timer1 + "초 입니다.");
					timer1--;
				} else if (timer1 < 0) {
					HardtleCount++;
					Hard[num-1]=num;
					dispose();
					setVisible(false);
					new HardTestTimeOut().setVisible(true);
					time1.stop();
				

				}
			}
		});
		time1.start();

	}
}
