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

public class Fc11 extends JFrame {

	private JPanel contentPane;

	
	public Fc11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("밀당 1도 없는 갓선비");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#호불호확실 #뒷담극혐 #연애도학습함<br>" + 
				"<br>밀당이라곤 일절 모르는 솔직담백 스타일이에요. 꼿꼿하고 체계적인 성향 덕분에 마치 21세기를 사는 선비 같아요. "
				+ "당신의 가식 없고 쿨한 매력에 많은 이성이 호감을 느낄 거예요. 책임감이 강해서 약속을 반드시 지키기 때문에 "
				+ "연인에게 금방 신뢰를 얻는 편이기도 해요. 연애 초반엔 감정 표현이 서툴러도 연애도 사랑도 열심히 학습하는 "
				+ "노력파이기 때문에 시간이 갈수록 연애 표현력은 점점 좋아질 거예요. 다만 명확한 호불호와 냉철한 성향 때문에 "
				+ "의도치 않게 연인에게 상처를 줄 수 있어요. '역지사지'를 마음에 품고 상대의 마음을 헤아려 보는 노력을 해보세요.</html>");
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
