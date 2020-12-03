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

public class Q10 extends Q09 {

	private JPanel contentPane;
	
	public Q10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q10");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 58));
		lblNewLabel.setBounds(60, 60, 125, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC5F0\uC778\uC5D0\uAC8C \uC904 \uC120\uBB3C\uC744 \uACE0\uB974\uAC8C \uB41C \uB098\uB294?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 31));
		lblNewLabel_1.setBounds(90, 124, 550, 250);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uC2E4\uC6A9\uC131\uC740 \uC5C6\uC5B4\uB3C4 \uC608\uC058\uACE0 \uAE30\uC5B5\uC5D0 \uB0A8\uC744 \uC120\uBB3C");
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
				new Q11().setVisible(true); 
				//System.out.println(Q01.count);
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton.setBounds(128, 518, 474, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC5F0\uC778\uC5D0\uAC8C \uC694\uC998 \uAC00\uC7A5 \uD544\uC694\uD560 \uAC83 \uAC19\uC740 \uC120\uBB3C");
		btnNewButton_1.setForeground(new Color(255, 0, 102));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 1;
				dispose();
				setVisible(false); 
				new Q11().setVisible(true); 
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
