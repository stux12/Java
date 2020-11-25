package Main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaTestMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTestMain frame = new JavaTestMain();
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
	public JavaTestMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("자신있으면 드루와~");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTest01().setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		
		btnNewButton.setBounds(218, 487, 268, 92);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("(자바사진넣을거임)");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(43, 75, 635, 124);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("자바 테스트");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("돋움", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(218, 291, 268, 70);
		contentPane.add(lblNewLabel_1);
	}
}
