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

public class Fc10 extends JFrame {

	private JPanel contentPane;

	
	public Fc10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사랑을 쫓는 피터팬");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#애정으로지구폭발 #충동 3000% #취향존중<br>" + 
				"<br>개성을 존중하고 자유를 사랑하는 나에게 구속하는 연애란 있을 수 없죠. 어떤 옷, 어떤 헤어스타일이든 간섭 제로, 취향 존중. "
				+ "연인이 갑자기 일을 그만두고 여행을 떠나겠다고 하면 묻지도 따지지도 않고 응원해 줄 스타일이에요. 한 번 빠지면 화끈하게 올인하기 때문에 "
				+ "헌신적인 연애를 할 가능성이 높아요. 어느 정도의 보답을 원하기도 해서 상대가 너무 받기만 하면 혼자 꿍해서 토라질 때도 있을 거예요. "
				+ "나의 헌신과 응원에 진심으로 감사할 줄 알고 내 모습을 있는 그대로 존중해줄 수 있는 사람을 만난다면 오랫동안 행복한 연애를 할 수 있을 거예요.</html>");
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
