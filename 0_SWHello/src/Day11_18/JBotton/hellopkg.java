package Day11_18.JBotton;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class hellopkg extends JFrame {

	private JPanel contentPane;
	private JButton btnJiwoong;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hellopkg frame = new hellopkg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hellopkg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnJiwoong = new JButton("JiWoong");
		btnJiwoong.setBackground(Color.PINK);
		btnJiwoong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 이벤트할 내용이 들어가는 자리
				lblNewLabel.setText("Jiwoong is BaBo");
			}
		});
		btnJiwoong.setFont(new Font("나눔고딕", Font.PLAIN, 22));
		btnJiwoong.setBounds(279, 175, 282, 104);
		contentPane.add(btnJiwoong);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel.setBounds(139, 68, 207, 66);
		contentPane.add(lblNewLabel);
	}
}
