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

public class Q07 extends Q06 {

	private JPanel contentPane;
	
	
	public Q07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q7");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 58));
		lblNewLabel.setBounds(60, 60, 84, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC5F0\uC778\uACFC \uC0AC\uC18C\uD55C \uC77C\uB85C \uB2E4\uD25C\uC744 \uB54C \uB098\uB294?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 35));
		lblNewLabel_1.setBounds(60, 124, 615, 250);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uB098!! \uC9C4\uC9DC!!! \uB108\uBB34!!! \uD654\uB0AC\uC5B4!!!");
		btnNewButton.setForeground(new Color(255, 0, 102));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 1;
				dispose();
				setVisible(false); 
				new Q08().setVisible(true); 
				//System.out.println(Q01.count);
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton.setBounds(128, 518, 474, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("oo\uC810\uC740 \uAF2D \uACE0\uCCE4\uC73C\uBA74 \uC88B\uACA0\uC5B4.");
		btnNewButton_1.setForeground(new Color(255, 0, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 2;
				dispose();
				setVisible(false); 
				new Q08().setVisible(true); 
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
