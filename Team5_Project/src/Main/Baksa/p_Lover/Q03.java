package Main.Baksa.p_Lover;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q03 extends Q02 {

	private JPanel contentPane;
	
	public Q03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q3");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 58));
		lblNewLabel.setBounds(60, 60, 84, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("친구의 소개로 소개팅에 나온 나는?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 40));
		lblNewLabel_1.setBounds(24, 124, 686, 250);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uBA3C\uC800 \uB9D0\uC744 \uAC78\uBA74\uC11C \uBD84\uC704\uAE30\uB97C \uB744\uC6B4\uB2E4.");
		btnNewButton.setForeground(new Color(255, 0, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 2;
				dispose();
				setVisible(false); 
				new Q04().setVisible(true); 
				//System.out.println(Q01.count);
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton.setBounds(128, 518, 474, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB9D0\uC744 \uAC78\uC5B4\uC62C\uB54C\uAE4C\uC9C0 \uAE30\uB2E4\uB824 \uBCF8\uB2E4.");
		btnNewButton_1.setForeground(new Color(255, 0, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 1;
				dispose();
				setVisible(false); 
				new Q04().setVisible(true); 
				//System.out.println(Q01.count);
			}
		});
		btnNewButton_1.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton_1.setBounds(128, 442, 474, 52);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel(count1 + "/12");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 0, 102));
		lblNewLabel_2.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(629, 625, 57, 28);
		contentPane.add(lblNewLabel_2);
	}
}

