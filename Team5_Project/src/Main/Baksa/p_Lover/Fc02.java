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

public class Fc02 extends JFrame {

	private JPanel contentPane;

	
	public Fc02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("뒤끝 오지는 사랑집착꾼");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#뒤끝100스푼 #사랑확인형 #챙김마스터<br>" + 
				"<br>작은 기념일, 이벤트까지 꼼꼼하게 챙기며 연인의 행복을 확실히 서포트하는 사랑덕후에요. "
				+ "상대를 행복하게 해주는 것이 연애의 의무 중 하나라 생각하기 때문이죠. 누구보다 아낌없이 사랑을 주는 만큼 때때로 상대의 사랑을 확인하고 싶기도 할 거예요. "
				+ "감정 표현에 서툰 사람을 만나면 내가 주는 만큼 받지 못하는 것 같아 오랫동안 뒤끝이 남을 수도 있어요. 나의 노력을 존중해주고 진심으로"
				+ " 감사할 줄 아는 사람을 만나면 오랫동안 사랑 넘치는 연애를 기대해도 좋아요. 남의 눈치를 보는 데에 너무 많은 시간을 쓰지 말고 내 감정부터 "
				+ "충실하게 살피고 표현하는 것도 잊지 마세요.</html>");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 23));
		lblNewLabel_1.setBounds(52, 146, 624, 424);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("나가기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		btnNewButton.setBounds(480, 573, 173, 58);
		contentPane.add(btnNewButton);
	}

}
