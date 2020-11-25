package EasyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.JavaTest01;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EasyTest09 extends EasyTest08 {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyTest09 frame = new EasyTest09(EasyCount);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param easyCount 
	 */
	public EasyTest09(int easyCount) {
		super(easyCount);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("(병아리사진)");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 10, 119, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(0, 55, 734, 1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("9/10");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(681, 11, 41, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Q");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(35, 83, 659, 111);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest10(EasyCount).setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 252, 659, 50);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest10(EasyCount).setVisible(true);
			}
		});
		button.setBounds(35, 348, 659, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("정답");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount++;
				dispose();
				setVisible(false);
				new EasyTest10(EasyCount).setVisible(true);
			}
		});
		button_1.setBounds(35, 435, 659, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest10(EasyCount).setVisible(true);
			}
		});
		button_2.setBounds(35, 523, 659, 50);
		contentPane.add(button_2);
		
		JButton button_5 = new JButton("처음문제로 돌아가기");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount=0;
				dispose();
				setVisible(false);
				new EasyTest01(EasyCount).setVisible(true);
			}
		});
		button_5.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_5.setBounds(35, 615, 174, 52);
		contentPane.add(button_5);
		
		JButton button_4 = new JButton("포기하시나요?(무시하는이모티콘)");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTestLast(EasyCount).setVisible(true);
			}
		});
		button_4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_4.setBounds(520, 615, 174, 52);
		contentPane.add(button_4);
	}
}
