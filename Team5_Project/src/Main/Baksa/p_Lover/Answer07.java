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

public class Answer07 extends JFrame {

	private JPanel contentPane;

	
	public Answer07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("리액션 버튼 고장난 연애봇");
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
		
		JLabel lblNewLabel_1 = new JLabel("<html>#내적사랑꾼 #플래너성애자 #연애원칙주의자<br>" + 
				"<br>꼼꼼하고 철두철미한 성향에 리액션 버튼이 고장 난 것처럼 감정 표현은 서툴지만, 마음속으론 "
				+ "'사랑해~ 고마워~'를 외치는 내적 사랑 가득한 연애봇이에요. 연애도 나만의 원칙에 맞게 계획적으로 차근차근 진행하기 때문에 시작이 다소 느릴 수 있어요. "
				+ "하지만 눈치가 빨라 상대의 생각을 잘 읽고 맞춰 줘서 한번 시작하면 갈등 없이 가장 안정적으로 연애를 하는 스타일이기도 해요. "
				+ "나의 계획성과 꼼꼼함을 존중해주고 인정해주는 사람을 만나면 더없이 행복한 연애가 가능할 거예요.</html>");
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
				new Fc02().setVisible(true); 
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
				new Fc06().setVisible(true); 
			}
		});
		button.setForeground(new Color(204, 102, 0));
		button.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		button.setBounds(62, 599, 283, 33);
		contentPane.add(button);
		

	}
}
