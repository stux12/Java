package Main.Java.C_MiddleTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.Java.B_EasyTest.EasyTest02;
import Main.main.MainPage;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class MiddleTest07 extends JavaTestList {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public MiddleTest07() {
		// 창 설정
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 버튼 설정
		rdbtnNewRadioButton = new JRadioButton("순서가 있는 데이터의 집합이다.");
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(true);
		rdbtnNewRadioButton.setBounds(80, 200, 550, 50);
		contentPane.add(rdbtnNewRadioButton);

		radioButton = new JRadioButton("데이터의 중복을 허용하지 않는다");
		radioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton.setBackground(Color.GREEN);
		buttonGroup.add(radioButton);
		radioButton.setEnabled(true);
		radioButton.setBounds(80, 300, 550, 50);
		contentPane.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("키와 값의 한 쌍으로 이루어지는 데이터의 집합이다.");
		radioButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_1.setBackground(Color.GREEN);
		buttonGroup.add(radioButton_1);
		radioButton_1.setEnabled(true);
		radioButton_1.setBounds(80, 400, 550, 50);
		contentPane.add(radioButton_1);

		JRadioButton rdbtnCollections = new JRadioButton("Collections를 상속받는다.");
		rdbtnCollections.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnCollections.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnCollections);
		rdbtnCollections.setEnabled(true);
		rdbtnCollections.setBounds(80, 500, 550, 50);
		contentPane.add(rdbtnCollections);

		JButton button = new JButton("이전으로");
		button.setIcon(new ImageIcon(MiddleTest07.class.getResource("/image/left2.png")));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Middle[5] == 0) {
					MiddleCount--;
				} else {
					MiddletleCount--;
				}
				dispose();
				setVisible(false);
				new MiddleTest06().setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.setBounds(50, 620, 174, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("포기해요?");
		button_1.setIcon(new ImageIcon(MiddleTest07.class.getResource("/image/X.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MiddleTestLast().setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(520, 620, 174, 52);
		contentPane.add(button_1);

		JButton button_2 = new JButton("다음 문제");
		button_2.setIcon(new ImageIcon(MiddleTest07.class.getResource("/image/Right.png")));

		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton.isSelected() || radioButton.isSelected() || radioButton_1.isSelected()
						|| rdbtnCollections.isSelected()) {
					if (rdbtnNewRadioButton.isSelected()) {
						MiddleCount++;
						Middle[6] = 0;
						dispose();
						setVisible(false);
						new MiddleTest08().setVisible(true);
					} else {
						MiddletleCount++;
						Middle[6] = 7;
						dispose();
						setVisible(false);
						new MiddleTest08().setVisible(true);
					}
				} else {
					new Check().setVisible(true);
				}
			}
		});

		buttonGroup.add(button_2);
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(284, 620, 174, 52);
		contentPane.add(button_2);

		// 라벨 설정
		JLabel lblNewLabel = new JLabel("Q 7. List 인터페이스에대한 설명으로 옳은것은??");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 80, 600, 100);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setForeground(Color.RED);
		label.setBackground(Color.BLACK);
		label.setBounds(0, 56, 734, 1);
		contentPane.add(label);

		JLabel label_1 = new JLabel("난이도 中");
		label_1.setIcon(new ImageIcon(MiddleTest01.class.getResource("/image/middle.png")));
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		label_1.setBackground(Color.GREEN);
		label_1.setBounds(12, 12, 108, 35);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("7/10");
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(675, 12, 47, 34);
		contentPane.add(label_2);

	}
}