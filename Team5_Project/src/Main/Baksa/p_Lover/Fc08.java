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

public class Fc08 extends JFrame {

	private JPanel contentPane;

	
	public Fc08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("눈치력 만렙 연애집사");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#오지라퍼 #자발적을의연애 #첫만남에2세계획<br>" + 
				"<br>상대방의 감정을 잘 읽고 맞춰줘서 연애할 때 갈등이 적어요. 오지랖 넓고 주변을 잘 챙겨서 누구든 당신 곁에서 편안함을 느낄 거에요. "
				+ "하지만 사실은 호불호가 명확해서 연인의 행동에 간섭하고 싶지만, 갈등을 만들고 싶지 않아서 불만이 있어도 속에 쌓아두는 편이네요. "
				+ "가끔 속마음을 표현할 때에도 불편한 말이 다 필터링 된 예쁜 말만 해주려고 노력해요. "
				+ "이런 당신의 빛나는 센스 덕에 결혼까지 생각한 연인들이 많았겠어요. 하지만 갈등은 피할수록 깊어지는 법. "
				+ "더 솔직하고 편안한 연애를 위해, 어렵더라도 고민을 바로 이야기해 보는 건 어떨까요?</html>");
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
