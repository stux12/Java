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

public class Q09 extends Q08 {

	private JPanel contentPane;
	
	public Q09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q9");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 58));
		lblNewLabel.setBounds(60, 60, 84, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD95 \uCC98\uC9C4 \uC5F0\uC778\uC774 \uC6B0\uC6B8\uD558\uB2E4\uACE0 \uD588\uC744\uB54C \uB098\uB294?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 32));
		lblNewLabel_1.setBounds(49, 124, 631, 250);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("5\uCD08\uB9CC\uC5D0 \uAC10\uC815\uC774\uC785 \uC644\uB8CC.. \uAC19\uC774 \uAE00\uC37D\uAC70\uB9B0\uB2E4.");
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
				new Q10().setVisible(true); 
				//System.out.println(Q01.count);
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton.setBounds(128, 518, 474, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC65C \uC6B0\uC6B8\uD574? \uBB50 \uB54C\uBB38\uC5D0 \uC6B0\uC6B8\uD55C\uAC70\uC57C?");
		btnNewButton_1.setForeground(new Color(255, 0, 102));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 1;
				dispose();
				setVisible(false); 
				new Q10().setVisible(true); 
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