package Main.Java.D_HardTest;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.main.MainPage;


public class HardRandom extends JavaTestList {

	private JPanel contentPane;
	
	
	// 랜덤으로 문제를 생성하기 위한 생성자
	public void turned() {
		
		c:for(int i=0; i<1; i++) {
		turn = (int)Math.ceil(5*Math.random());
		
		switch (turn) {
		case 5:
			if(test[4]!=5) {
				test[4] = 5;
				num++;
				dispose();
				setVisible(false);
				new HardTest05().setVisible(true);
				break;
				}
			else {
				i--;
				continue c;
			}
		case 4:
			if(test[3]!=4) {
				test[3] = 4;
				num++;
				dispose();
				setVisible(false);
				new HardTest04().setVisible(true);
				break;
				}
			else {
				i--;
				continue c;
			}
		case 3:
			if(test[2]!=3) {
				test[2] = 3;
				num++;
				dispose();
				setVisible(false);
				new HardTest03().setVisible(true);
				break;
				}
			else {
				i--;
				continue c;
			}
		case 2:
			if(test[1]!=2) {
			test[1] = 2;
			num++;
			dispose();
			setVisible(false);
			new HardTest02().setVisible(true);
			break;
			}
			else {
				i--;
				continue c;
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
			else {
				if((HardCount+HardtleCount)==5) {
					new HardTestLast().setVisible(true);
					dispose();
					setVisible(false);
					}
				else {
				i--;
				continue c;
				}
			}
		}
		}
	}

	
	public HardRandom() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("긴장하세요!!");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				turned();
				}
		});
		button.setBackground(Color.BLACK);
		button.setForeground(Color.RED);
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		button.setBounds(253, 185, 154, 45);
		contentPane.add(button);
		
		JButton button_1 = new JButton("돌아갈 마지막기회");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTestList().setVisible(true);
			}
		});
		button_1.setBackground(Color.BLACK);
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		button_1.setBounds(27, 185, 154, 45);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HardRandom.class.getResource("/image/Jigso.png")));
		lblNewLabel.setBounds(27, 25, 380, 150);
		contentPane.add(lblNewLabel);
	}
}

