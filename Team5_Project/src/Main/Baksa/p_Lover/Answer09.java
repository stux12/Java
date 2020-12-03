package Main.Baksa.p_Lover;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Answer09 extends JFrame {

	private JPanel contentPane;

	
	public Answer09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("단호박 먹은 연애불도저");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB2E4\uC2DC\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false); 
				new Lover_00().setVisible(true); 
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		btnNewButton.setBounds(389, 563, 259, 68);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#호불호확실 #일단들이대는편 #나도몰라종착지<br>" + 
				"<br>썸 추진력 상위 1%, 좋으면 앞뒤 안 재고 돌진하며 썸도 연애도 빠르게 시작하는 금사빠! 말발이 타고나서 격렬한 토론도 좋아해요. "
				+ "관심 있는 주제로 밤새 떠들 수 있는 상대라면 운명적인 연애를 시작할 수 있을 거예요. 호불호 확실하고 싫증을 빨리 내는 "
				+ "편이라 새로운 핫플이나 액티비티를 함께 찾아다닐 수 있는 사람을 만나면 지루할 틈 없이 다이나믹한 연애를 즐길 수 있어요. "
				+ "하지만 개인의 시간도 중시해서 모든 시간을 상대와 공유하고 싶진 않을 거예요. 자기 계발을 위한 시간도 필요하다는 걸 연인에게 잘 설명한다면 갈등 없이 연애할 수 있을 거예요.</html>");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 23));
		lblNewLabel_1.setBounds(52, 146, 624, 424);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("환상의 케미 보러가기");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(true); 
				new Fc04().setVisible(true); 
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 102));
		btnNewButton_1.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		btnNewButton_1.setBounds(62, 563, 283, 33);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("환장의 케미 보러가기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(true); 
				new Fc02().setVisible(true); 
			}
		});
		button.setForeground(new Color(204, 102, 0));
		button.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		button.setBounds(62, 599, 283, 33);
		contentPane.add(button);
		
	
	}
}
