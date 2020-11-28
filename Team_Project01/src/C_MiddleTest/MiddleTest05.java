package C_MiddleTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import A_Main.JavaTestList;
import B_EasyTest.EasyTest02;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class MiddleTest05 extends MiddleTest04 {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnDate;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiddleTest05 frame = new MiddleTest05(MiddleCount);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MiddleTest05(int middleCount) {
		super(middleCount);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("<String>은 String만 사용하겠다라는 의미다.");
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(true);

		rdbtnNewRadioButton.setBounds(80, 200, 550, 50);
		contentPane.add(rdbtnNewRadioButton);
	
		
		rdbtnDate = new JRadioButton("<Date>는 Date만 사용하겠다는 의미이다.");
		rdbtnDate.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnDate.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnDate);
		rdbtnDate.setEnabled(true);

		rdbtnDate.setBounds(80, 300, 550, 50);
		contentPane.add(rdbtnDate);
		
		JRadioButton rdbtnLongString = new JRadioButton("<Long, String> Long하고 String만 사용하겠다는 의미이다.");
		rdbtnLongString.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnLongString.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnLongString);
		rdbtnLongString.setEnabled(true);

		rdbtnLongString.setBounds(80, 400, 550, 50);
		contentPane.add(rdbtnLongString);
		
		JRadioButton rdbtnChar = new JRadioButton("<Char> Char만 사용하겠다는 의미이다.");
		rdbtnChar.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		rdbtnChar.setBackground(Color.GREEN);
		buttonGroup.add(rdbtnChar);
		rdbtnChar.setEnabled(true);

		rdbtnChar.setBounds(80, 500, 550, 50);
		contentPane.add(rdbtnChar);
		
		JLabel lblNewLabel = new JLabel("Q 5. Generic에 대한 설명으로 틀린것은??");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 80, 600, 100);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("처음으로");
		button.setIcon(new ImageIcon(MiddleTest05.class.getResource("/image/Ghome.png")));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MiddleCount=0;
				dispose();
				setVisible(false);
				new MiddleTest01(MiddleCount).setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.setBounds(50, 620, 174, 52);
		contentPane.add(button);
		
		JButton button_1 = new JButton("포기해요?");
		button_1.setIcon(new ImageIcon(MiddleTest05.class.getResource("/image/X.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new MiddleTestLast(MiddleCount).setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(520, 620, 174, 52);
		contentPane.add(button_1);
		
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
		
		JLabel label_2 = new JLabel("5/10");
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(675, 12, 47, 34);
		contentPane.add(label_2);
		
		JButton button_2 = new JButton("다음 문제");
		button_2.setIcon(new ImageIcon(MiddleTest05.class.getResource("/image/Right.png")));

		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnNewRadioButton.isSelected() || rdbtnDate.isSelected() || rdbtnLongString.isSelected()
						|| rdbtnChar.isSelected()) {
					if (rdbtnChar.isSelected()) {
						MiddleCount++;
						dispose();
						setVisible(false);
						new MiddleTest06(MiddleCount).setVisible(true);
					} else {
						dispose();
						setVisible(false);
						new MiddleTest06(MiddleCount).setVisible(true);
					}
				}else {
					new Check().setVisible(true);
				}
			}
		});

		buttonGroup.add(button_2);
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(284, 620, 174, 52);
		contentPane.add(button_2);
		
		
		
		
	}
}