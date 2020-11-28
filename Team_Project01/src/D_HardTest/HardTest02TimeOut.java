package D_HardTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import A_Main.JavaTestList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HardTest02TimeOut extends HardRandom {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardTest02TimeOut frame = new HardTest02TimeOut();
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
	public HardTest02TimeOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton button = new JButton("다음 문제로");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				turn = (int)Math.ceil(10*Math.random());
				switch (turn) {
				case 5:
					if(test[4]!=1) {
						test[4] = 1;
						num++;
						dispose();
						setVisible(false);
						new HardTest05().setVisible(true);
						break;
						}
				case 4:
					if(test[3]!=1) {
						test[3] = 1;
						num++;
						dispose();
						setVisible(false);
						new HardTest04().setVisible(true);
						break;
						}
				case 3:
					if(test[2]!=1) {
						test[2] = 1;
						num++;
						dispose();
						setVisible(false);
						new HardTest03().setVisible(true);
						break;
						}
				case 2:
					if(test[1]!=1) {
					test[1] = 1;
					num++;
					dispose();
					setVisible(false);
					new HardTest02().setVisible(true);
					break;
					}
				case 1:
					if(test[0]!=1) {
					test[0] = 1;
					num++;
					dispose();
					setVisible(false);
					new HardTest01().setVisible(true);
					break;
					}
				}
			}
			});
		button.setForeground(Color.RED);
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		button.setBackground(Color.BLACK);
		button.setBounds(140, 191, 154, 45);
		contentPane.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("Time");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(12, 37, 135, 83);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOut = new JLabel("Out");
		lblOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblOut.setForeground(Color.RED);
		lblOut.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblOut.setBounds(269, 37, 135, 83);
		contentPane.add(lblOut);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HardRandom.class.getResource("/image/Jigso.png")));
		lblNewLabel.setBounds(22, 21, 380, 150);
		contentPane.add(lblNewLabel);
		
		
	}

}
