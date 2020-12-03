package Main.nonsense.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Main.main.MainPage;

public class Main extends JFrame {

	private JPanel contentPane;


		public Main() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mainLabel = new JLabel("아재력 테스트");
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setFont(new Font("휴먼편지체", Font.BOLD, 55));
		mainLabel.setBounds(0, 33, 732, 72);
		contentPane.add(mainLabel);
		
		JButton startButton = new JButton("Game Start!");
		startButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				dispose();
				new GameAction(0, 0);
			}
		});
		startButton.setForeground(Color.BLACK);
		startButton.setBackground(SystemColor.info);
		startButton.setBounds(213, 602, 319, 72);
		contentPane.add(startButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/smile.jpg")));
		lblNewLabel.setBounds(158, 132, 425, 437);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uAD00\uB9AC\uC790\uD654\uBA74");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new IdCheckPage().setVisible(true);
				dispose();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(627, 676, 105, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("홈으로~");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new MainPage().setVisible(true);
				dispose();
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(0, 676, 105, 27);
		contentPane.add(btnNewButton_1);
	}
}
