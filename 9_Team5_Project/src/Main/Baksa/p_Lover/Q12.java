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

public class Q12 extends Q11 {

	private JPanel contentPane;

	public Q12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Q12");
		lblNewLabel.setForeground(new Color(255, 0, 102));
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 58));
		lblNewLabel.setBounds(60, 60, 125, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uBCA4\uD2B8\uB97C \uC900\uBE44\uD55C \uB098\uB97C \uC2E0\uB098\uAC8C \uD560 \uC5F0\uC778\uC758 \uCE6D\uCC2C\uC740? ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 28));
		lblNewLabel_1.setBounds(37, 124, 681, 250);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\uACE0\uB9C8\uC6CC \uC694\uC998 \uBC14\uC060\uD150\uB370 \uC5B8\uC81C \uC774\uB7F0\uAC78 \uC0DD\uAC01\uD588\uC5B4?");
		btnNewButton.setForeground(new Color(255, 0, 102));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count1++;
				Q01.count += 1;
				//System.out.println(Q01.count);
				if(Q01.count == 24) {
					dispose();
					setVisible(false); 
					new Answer12().setVisible(true); 
					}
				else if(Q01.count == 23) {
					dispose();
					setVisible(false); 
					new Answer11().setVisible(true); 
				}
				else if(Q01.count == 22) {
					dispose();
					setVisible(false); 
					new Answer10().setVisible(true); 
					}
				else if(Q01.count == 21) {
					dispose();
					setVisible(false); 
					new Answer09().setVisible(true); 
					}
				else if(Q01.count == 20) {
					dispose();
					setVisible(false); 
					new Answer08().setVisible(true); 
					}
				else if(Q01.count == 19) {
					dispose();
					setVisible(false); 
					new Answer07().setVisible(true); 
					}
				else if(Q01.count == 18) {
					dispose();
					setVisible(false); 
					new Answer06().setVisible(true); 
					}
				else if(Q01.count == 17) {
					dispose();
					setVisible(false); 
					new Answer05().setVisible(true); 
					}
				else if(Q01.count == 16) {
					dispose();
					setVisible(false); 
					new Answer04().setVisible(true); 
					}
				else if(Q01.count == 15) {
					dispose();
					setVisible(false); 
					new Answer03().setVisible(true); 
					}
				else if(Q01.count == 14) {
					dispose();
					setVisible(false); 
					new Answer02().setVisible(true); 
					}
				else if(Q01.count == 13) {
					dispose();
					setVisible(false); 
					new Answer01().setVisible(true); 
					}
				else {
					dispose();
					setVisible(false); 
					new Answer01().setVisible(true); 
				}
				Q01.count = 0;
				count1 = 0;
			}
			
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton.setBounds(128, 518, 474, 52);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0AC\uB791\uD574 \uCD5C\uACE0\uC57C \uC644\uC804 \uAC10\uB3D9\uD588\uC5B4");
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
				//System.out.println(Q01.count);
				if(Q01.count == 24) {
					dispose();
					setVisible(false); 
					new Answer12().setVisible(true); 
					}
				else if(Q01.count == 23) {
					dispose();
					setVisible(false); 
					new Answer11().setVisible(true); 
				}
				else if(Q01.count == 22) {
					dispose();
					setVisible(false); 
					new Answer10().setVisible(true); 
					}
				else if(Q01.count == 21) {
					dispose();
					setVisible(false); 
					new Answer09().setVisible(true); 
					}
				else if(Q01.count == 20) {
					dispose();
					setVisible(false); 
					new Answer08().setVisible(true); 
					}
				else if(Q01.count == 19) {
					dispose();
					setVisible(false); 
					new Answer07().setVisible(true); 
					}
				else if(Q01.count == 18) {
					dispose();
					setVisible(false); 
					new Answer06().setVisible(true); 
					}
				else if(Q01.count == 17) {
					dispose();
					setVisible(false); 
					new Answer05().setVisible(true); 
					}
				else if(Q01.count == 16) {
					dispose();
					setVisible(false); 
					new Answer04().setVisible(true); 
					}
				else if(Q01.count == 15) {
					dispose();
					setVisible(false); 
					new Answer03().setVisible(true); 
					}
				else if(Q01.count == 14) {
					dispose();
					setVisible(false); 
					new Answer02().setVisible(true); 
					}
				else if(Q01.count == 13) {
					dispose();
					setVisible(false); 
					new Answer01().setVisible(true); 
					}
				else {
					dispose();
					setVisible(false); 
					new Answer01().setVisible(true); 
				}
			
				Q01.count = 0;
				count1 = 0;
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