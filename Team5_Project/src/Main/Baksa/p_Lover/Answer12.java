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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Answer12 extends JFrame {

	private JPanel contentPane;

	
	public Answer12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("브레이크 고장난 연애직진러");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(24, 72, 684, 91);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB2E4\uC2DC\uD558\uAE30");
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
		
		JLabel lblNewLabel_1 = new JLabel("<html>#쿨내진동 #19금풀게이지 #연애성공률200%<br>" + 
				"<br>모르는 사람과도 10분 만에 절친이 되는 핵인싸에게 연애는 식은 죽 먹기죠. "
				+ "이상형을 만나면 어마어마한 애정 폭발력으로 썸부터 연애까지 빠르게 직진하는 스타일이에요. "
				+ "남의 눈치를 보지 않고 애정표현이나 스킨십도 적극적으로 하는 편이라 연인에게 사랑받는 느낌을 듬뿍 주는 프로 표현러군요! "
				+ "갈등이 생겨도 피하지 않고 뒤끝도 없어서 쿨한 연애가 가능해요. 얽매이는 걸 싫어하는 자유영혼이기 때문에 "
				+ "지나치게 구속하지 않고 다양한 데이트를 즐기며 취미를 공유할 수 있는 사람을 만나는 걸 추천해요.</html>");
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
				new Fc03().setVisible(true); 
			}
		});
		button.setForeground(new Color(204, 102, 0));
		button.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		button.setBounds(62, 599, 283, 33);
		contentPane.add(button);
		
	
	}
}
