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

public class MiddleTest09 extends JavaTestList {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnParallelstream;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public MiddleTest09() {
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
		rdbtnNewRadioButton = new JRadioButton("원본 데이터를 변경하지 않습니다.");
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(true);
		rdbtnNewRadioButton.setBounds(80, 200, 550, 50);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnParallelstream = new JRadioButton("parallelStream()를 통한 손쉬운 병렬 처리를 지원합니다.");
		rdbtnParallelstream.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnParallelstream.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnParallelstream);
		rdbtnParallelstream.setEnabled(true);
		rdbtnParallelstream.setBounds(80, 300, 550, 50);
		contentPane.add(rdbtnParallelstream);

		JRadioButton radioButton_1 = new JRadioButton("재사용이 가능해 여러번 사용할 수 있습니다.");
		radioButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_1.setBackground(Color.GREEN);
		buttonGroup.add(radioButton_1);
		radioButton_1.setEnabled(true);
		radioButton_1.setBounds(80, 400, 550, 50);
		contentPane.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("내부 반복을 통해 작업을 수행합니다.");
		radioButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		radioButton_2.setBackground(Color.GREEN);
		buttonGroup.add(radioButton_2);
		radioButton_2.setEnabled(true);
		radioButton_2.setBounds(80, 500, 550, 50);
		contentPane.add(radioButton_2);

		JButton button = new JButton("이전으로");
		button.setIcon(new ImageIcon(MiddleTest09.class.getResource("/image/left2.png")));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Middle[7] == 0) {
					MiddleCount--;
				} else {
					MiddletleCount--;
				}
				dispose();
				setVisible(false);
				new MiddleTest08().setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.setBounds(50, 620, 174, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("포기해요?");
		button_1.setIcon(new ImageIcon(MiddleTest09.class.getResource("/image/X.png")));
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
		button_2.setIcon(new ImageIcon(MiddleTest09.class.getResource("/image/Right.png")));

		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton.isSelected() || rdbtnParallelstream.isSelected() || radioButton_1.isSelected()
						|| radioButton_2.isSelected()) {
					if (radioButton_1.isSelected()) {
						MiddleCount++;
						Middle[8] = 0;
						dispose();
						setVisible(false);
						new MiddleTest10().setVisible(true);
					} else {
						MiddletleCount++;
						Middle[8] = 9;
						dispose();
						setVisible(false);
						new MiddleTest10().setVisible(true);
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
		JLabel lblNewLabel = new JLabel("Q 9. Stream API의 특징으로 틀린것은??");
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

		JLabel label_2 = new JLabel("9/10");
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(675, 12, 47, 34);
		contentPane.add(label_2);

	}
}