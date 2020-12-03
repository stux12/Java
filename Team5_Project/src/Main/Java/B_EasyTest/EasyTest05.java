package Main.Java.B_EasyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.main.MainPage;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EasyTest05 extends JavaTestList {

	private JPanel Pane;

	public EasyTest05() {
		// 창 설정
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		Pane = new JPanel();
		Pane.setBackground(Color.YELLOW);
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);

		// 버튼 설정
		JButton btnNewButton = new JButton("//");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[4] = 5;
				EasytleCount++;
				dispose();
				setVisible(false);
				new EasyTest06().setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 252, 659, 50);
		Pane.add(btnNewButton);

		JButton button = new JButton("/** **/");
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(new Color(255, 255, 0));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[4] = 0;
				EasyCount++;
				dispose();
				setVisible(false);
				new EasyTest06().setVisible(true);
			}
		});
		button.setBounds(35, 348, 659, 50);
		Pane.add(button);

		JButton button_1 = new JButton("/* */");
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(new Color(255, 255, 0));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[4] = 5;
				EasytleCount++;
				dispose();
				setVisible(false);
				new EasyTest06().setVisible(true);
			}
		});
		button_1.setBounds(35, 435, 659, 50);
		Pane.add(button_1);

		JButton button_2 = new JButton("/** */");
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(new Color(255, 255, 0));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Easytle[4] = 5;
				EasytleCount++;
				dispose();
				setVisible(false);
				new EasyTest06().setVisible(true);
			}
		});
		button_2.setBounds(35, 523, 659, 50);
		Pane.add(button_2);

		JButton button_5 = new JButton("이전문제로");
		button_5.setIcon(new ImageIcon(EasyTest05.class.getResource("/image/left.png")));
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Easytle[3] == 0) {
					EasyCount--;
				}
				else {
					EasytleCount--;
				}
				dispose();
				setVisible(false);
				new EasyTest04().setVisible(true);
			}
		});
		button_5.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_5.setBackground(new Color(255, 255, 0));
		button_5.setBounds(35, 615, 174, 52);
		Pane.add(button_5);

		JButton button_4 = new JButton("포기해요?");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setIcon(new ImageIcon(EasyTest01.class.getResource("/image/smiley.png")));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTestLast().setVisible(true);
			}
		});
		button_4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_4.setBackground(new Color(255, 255, 0));
		button_4.setBounds(520, 615, 174, 52);
		Pane.add(button_4);

		// 라벨 설정
		JLabel lblNewLabel = new JLabel("난이도 下");
		lblNewLabel.setIcon(new ImageIcon(EasyTest01.class.getResource("/image/chick.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 10, 94, 34);
		Pane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(0, 55, 734, 1);
		Pane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("5/10");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(681, 11, 41, 27);
		Pane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Q 05 다음 중 주석에 해당하지 않는것은??");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(35, 83, 659, 111);
		Pane.add(lblNewLabel_3);
	}
}
