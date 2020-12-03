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

public class MiddleTest06 extends JavaTestList {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnLifo;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public MiddleTest06() {
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

		rdbtnNewRadioButton = new JRadioButton("FIFO 구조이다.");
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(true);
		rdbtnNewRadioButton.setBounds(80, 200, 550, 50);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnLifo = new JRadioButton("pop()를 통해 요소를 반환한다.");
		rdbtnLifo.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnLifo.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnLifo);
		rdbtnLifo.setEnabled(true);
		rdbtnLifo.setBounds(80, 300, 550, 50);
		contentPane.add(rdbtnLifo);

		JRadioButton rdbtnFilo = new JRadioButton("push()를 통해 요소를 삽입한다.");
		rdbtnFilo.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnFilo.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnFilo);
		rdbtnFilo.setEnabled(true);
		rdbtnFilo.setBounds(80, 400, 550, 50);
		contentPane.add(rdbtnFilo);

		JRadioButton rdbtnListVector = new JRadioButton("List 컬렉션의 Vector클래스를 상속받는다.");
		rdbtnListVector.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnListVector.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnListVector);
		rdbtnListVector.setEnabled(true);
		rdbtnListVector.setBounds(80, 500, 550, 50);
		contentPane.add(rdbtnListVector);

		JButton button = new JButton("이전으로");
		button.setIcon(new ImageIcon(MiddleTest06.class.getResource("/image/left2.png")));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Middle[4] == 0) {
					MiddleCount--;
				} else {
					MiddletleCount--;
				}
				dispose();
				setVisible(false);
				new MiddleTest05().setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.setBounds(50, 620, 174, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("포기해요?");
		button_1.setIcon(new ImageIcon(MiddleTest06.class.getResource("/image/X.png")));
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
		button_2.setIcon(new ImageIcon(MiddleTest06.class.getResource("/image/Right.png")));

		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton.isSelected() || rdbtnLifo.isSelected() || rdbtnFilo.isSelected()
						|| rdbtnListVector.isSelected()) {
					if (rdbtnNewRadioButton.isSelected()) {
						MiddleCount++;
						Middle[5] = 0;
						dispose();
						setVisible(false);
						new MiddleTest07().setVisible(true);
					} else {
						MiddletleCount++;
						Middle[5] = 6;
						dispose();
						setVisible(false);
						new MiddleTest07().setVisible(true);
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
		JLabel lblNewLabel = new JLabel("Q 6. Stack에 대한 설명으로 틀린것은??");
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

		JLabel label_2 = new JLabel("6/10");
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(675, 12, 47, 34);
		contentPane.add(label_2);

	}
}