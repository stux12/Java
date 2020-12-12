package Main.Java.D_HardTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.Java.D_HardTest.HardRandom;
import Main.main.MainPage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTree;

public class HardTestTimeOut extends HardRandom {

	private JPanel contentPane;

	
	public HardTestTimeOut() {
		
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
		
		
		JButton button = new JButton("다음 문제로");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				turned();
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
