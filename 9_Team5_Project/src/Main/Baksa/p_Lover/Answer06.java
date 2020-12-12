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

public class Answer06 extends JFrame {

	private JPanel contentPane;

	
	public Answer06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("겉차속따 연애꿈나무");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.PLAIN, 45));        
		lblNewLabel.setBounds(75, 72, 573, 91);
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
		
		JLabel lblNewLabel_1 = new JLabel("<html>#속앓이원탑 #짝사랑매니아 #표정관리고수<br>" + 
				"<br>좋아하는 사람이 다가오면 속으론 행복해해도 겉으론 차갑게 반응하는 연기파예요. 이상형은 확실하지만, "
				+ "표현이 서툴러서 짝사랑과 속앓이를 가장 많이 하는 스타일이기도 해요. 하지만 일단 시작하면 삶의 1순위가 연애로 바뀌기 때문에 "
				+ "연애를 방해하는 모든 장애물을 다 부수며 상대에게 올인해요. 표정 관리를 너무 잘해서 상대가 내 마음을 전혀 눈치채지 못할 때도 많을 거예요. "
				+ "남의 눈치를 보는 데에 너무 많은 시간을 쓰지 말고 내 감정을 조금 더 솔직하게 표현해 보세요. 그동안 꿈꿔왔던 연애가 시작될 거예요.</html>");
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
				new Fc12().setVisible(true); 
			}
		});
		button.setForeground(new Color(204, 102, 0));
		button.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		button.setBounds(62, 599, 283, 33);
		contentPane.add(button);
	
	}
}
