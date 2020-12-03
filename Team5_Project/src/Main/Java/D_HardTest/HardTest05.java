package Main.Java.D_HardTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.main.MainPage;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HardTest05 extends HardRandom {

	private JPanel contentPane;
	private JTextField textField;

	public HardTest05() {
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

		JLabel lblqMain = new JLabel("<html>Q"+num+". 람다표현식 작성법으로 틀린것을 모두 고르시오");
		lblqMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblqMain.setForeground(Color.RED);
		lblqMain.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblqMain.setBounds(68, 100, 600, 80);
		contentPane.add(lblqMain);

		JLabel label_2 = new JLabel("남은시간 : " + timer5 + "초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(430, 180, 238, 70);
		contentPane.add(label_2);

		time5 = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (timer5 >= 0) {
					label_2.setText("남은시간 : " + timer5 + "초 입니다.");
					timer5--;
				} else if (timer5 < 0) {
					HardtleCount++;
					Hard[num-1]=num;
					dispose();
					setVisible(false);
					new HardTestTimeOut().setVisible(true);
					time5.stop();

				}
			}
		});
		time5.start();

		JLabel lblNewLabel = new JLabel("시간제한문제");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(68, 180, 238, 70);
		contentPane.add(lblNewLabel);

		JRadioButton radioButton = new JRadioButton("return문 대신 표현식을 사용할 수 있으며, 반환값은 표현식의 결과값입니다.");
		radioButton.setBackground(Color.BLACK);
		radioButton.setForeground(Color.RED);
		radioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton.setBounds(68, 250, 600, 50);
		contentPane.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("하나의 return문으로만 이루어진 경우 중괄호를 생략할 수 없습니다.");
		radioButton_1.setForeground(Color.RED);
		radioButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_1.setBackground(Color.BLACK);
		radioButton_1.setBounds(68, 320, 600, 50);
		contentPane.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("매개변수가 하나인 경우 괄호를 생략할 수 없습니다.");
		radioButton_2.setForeground(Color.RED);
		radioButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_2.setBackground(Color.BLACK);
		radioButton_2.setBounds(68, 390, 600, 50);
		contentPane.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("매개변수의 타입을 추론할 수 있는 경우 타입 생략 가능합니다.");
		radioButton_3.setForeground(Color.RED);
		radioButton_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_3.setBackground(Color.BLACK);
		radioButton_3.setBounds(68, 460, 600, 50);
		contentPane.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("하나의 명령문만으로 이루어진 경우 중괄호 생략할 수 없습니다.");
		radioButton_4.setForeground(Color.RED);
		radioButton_4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_4.setBackground(Color.BLACK);
		radioButton_4.setBounds(68, 530, 600, 50);
		contentPane.add(radioButton_4);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent arg0) {
			if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
				if (textField.getText().equals("끝")) {
					if (radioButton_2.isSelected() && radioButton_4.isSelected()) {
						HardCount++;
						time5.stop();
						turned();
						dispose();
						setVisible(false);

					} else {
						Hard[num-1]=num;
						HardtleCount++;
						time5.stop();
						turned();
						dispose();
						setVisible(false);

					}
			}
			}
				
		}
	});
		
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.RED);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textField.setBounds(418, 608, 250, 50);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("끝내고 싶으시면 끝을 입력하시고 엔터치세요");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(68, 605, 324, 50);
		contentPane.add(lblNewLabel_1);

	}
}
