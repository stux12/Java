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

public class Q06 extends Q05 {

	private JPanel contentPane;
	
	public Q06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q6");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 58));
		lblNewLabel.setBounds(60, 60, 84, 52);
		contentPane.add(lblNewLabel);
		 
		JLabel lblNewLabel_1 = new JLabel("<html>오늘 본 영화를 궁금해하는 <br> 연인에게 나는?</html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 40));
		lblNewLabel_1.setBounds(32, 124, 667, 250);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uC880\uBE44\uBC14\uC774\uB7EC\uC2A4\uB97C \uCE58\uB8CC\uD558\uAE30 \uC704\uD55C \uC774\uC57C\uAE30\uC57C.");
		btnNewButton.setForeground(new Color(255, 0, 102));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				count1++;
				Q01.count += 1;
				dispose();
				setVisible(false); 
				new Q07().setVisible(true); 
				//System.out.println(Q01.count);
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton.setBounds(128, 518, 474, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC880\uBE44\uB791 \uC2F8\uC6B0\uB294\uB370 \uC8FC\uC778\uACF5\uC774 \uB108\uBB34\uBA4B\uC838!!");
		btnNewButton_1.setForeground(new Color(255, 0, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 2;
				dispose();
				setVisible(false); 
				new Q07().setVisible(true); 
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
