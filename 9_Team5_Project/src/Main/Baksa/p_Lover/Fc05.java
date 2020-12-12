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

public class Fc05 extends JFrame {

	private JPanel contentPane;

	
	public Fc05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("저세상 오지랖 연애박사");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#칭찬봇 #1분에100마디 #저세상오지랖<br>" + 
				"<br>빠른 눈치로 연인의 감정을 척척 알아맞히고 연애를 위해 시간과 노력을 아끼지 않는 스타일이에요. "
				+ "장점을 알아보고 응원해 주는 데에 능숙해서 연인에게 든든한 치어리더가 되어줄 수 있어요. "
				+ "1분에 100마디씩 칭찬해 줘서 자존감 낮은 사람도 당신과 함께라면 언제나 파워당당! "
				+ "하지만 상처받기 싫은 마음에 갈등을 피하고 좋은 말만 계속한다면 문제는 해결되지 않고 깊어질 거예요. "
				+ "힘들 때 자기 생각과 감정을 솔직하게 표현하는 것도 중요해요. 애정 표현, 썸 추진력은 상위 1%이니 "
				+ "연애 성공률은 걱정할 필요가 없겠네요.</html>");
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
