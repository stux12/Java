package Main.Baksa.p_Lover;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.main.MainPage;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class Lover_00 extends JFrame {

	private JPanel contentPane;
	ImageIcon img;
	protected static int count1;

	
	public Lover_00() {
		JLabel lbl = new JLabel(new ImageIcon(Lover_00.class.getResource("/p_image/heart.png")));
		lbl.setBounds(112, 182, 503, 326);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setToolTipText("");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.PINK);
		contentPane.add(lbl);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
	
		
		JLabel lblNewLabel = new JLabel("\uC5F0\uC560\uB2A5\uB825 \uD14C\uC2A4\uD2B8");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 70));
		lblNewLabel.setBounds(39, 36, 659, 124);
		contentPane.add(lblNewLabel);
		
		JButton start = new JButton("S T A R T");
		start.setForeground(new Color(255, 102, 102));
		start.setBackground(Color.PINK);
		start.setBorderPainted(false); // 외곽선 삭제
		//start.setContentAreaFilled(false); 내용영역 채우기 안 함.
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				count1++;
				dispose();
				setVisible(false); 
				new Q01().setVisible(true); 
				
			}
		});
		
		start.setFont(new Font("휴먼매직체", Font.BOLD, 50));
		start.setBounds(214, 536, 308, 56);
		contentPane.add(start);
		
		JButton button = new JButton("메인으로");
		button.setBorderPainted(false);
		button.setForeground(new Color(255, 102, 102));
		button.setFont(new Font("휴먼매직체", Font.BOLD, 35));
		button.setBackground(Color.PINK);
		button.setBounds(214, 615, 308, 56);
		contentPane.add(button);

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false); 
				new MainPage().setVisible(true); 
				
			}
		});
		
	}
}
