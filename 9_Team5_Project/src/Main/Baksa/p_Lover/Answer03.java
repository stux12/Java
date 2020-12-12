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

public class Answer03 extends JFrame {

	private JPanel contentPane;

	
	public Answer03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("망상에 사는 철벽금사빠");
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
		
		JLabel lblNewLabel_1 = new JLabel("<html>#365일망상꾼 #내사람덕후 #연애기준5조5억개<br>" + 
				"<br>연애 시작과 동시에 앞으로 행복할 일, 싸울 일, 우울할 일을 미리 상상하고 기뻐하고 걱정하는 스타일이에요. "
				+ "상대의 감정에 잘 공감해 주지만 내 감정은 잘 표현하지 않아서 막상 좋아하는 사람이 다가와도 철벽을 칠 때가 있어요. "
				+ "하지만 속으로는 김칫국 한 사발 마시고 점 찍어 뒀던 맛집, 핫플레이스로 데이트 풀코스 계획 완료. 연애를 시작하면 "
				+ "언제 철벽을 쳤는지 기억도 안 날 정도로 애정표현도 스킨십도 적극적으로 하는 편이에요. 나만의 철두철미한 연애 기준 "
				+ "5조5억 개 중 5억 개 정도만 타협하면 더 빠르게 인연이 다가올지도 몰라요.</html>");
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
				new Fc10().setVisible(true); 
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
				new Fc11().setVisible(true); 
			}
		});
		button.setForeground(new Color(204, 102, 0));
		button.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		button.setBounds(62, 599, 283, 33);
		contentPane.add(button);

	}
}
