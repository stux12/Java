package Main;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import EasyTest.EasyTest01;

public class JavaTest01 extends JFrame {

	private JPanel contentPane;
	public static int EasyCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTest01 frame = new JavaTest01();
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
	public JavaTest01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("자바 병아리 전용(병아리사진넣기)");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest01(EasyCount).setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBounds(118, 236, 519, 74);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("자바를 좀 안다면 드루와~(드루와 사진 넣기)\r\n");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		
		btnNewButton_1.setBounds(118, 358, 519, 74);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("상위 클라스~ 당신은 자바마스터? ( 선생님? 교수님?사진 넣기)\r\nj라디오버튼 사용\r\n");
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton_2.setBounds(118, 479, 519, 74);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("이전으로 돌아가기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTestMain().setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBounds(39, 620, 174, 52);
		contentPane.add(button);
		
		JButton btnNewButton_3 = new JButton("포기하시나요?(무시하는이모티콘)");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton_3.setBounds(529, 620, 174, 52);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("자신있어서 들어온 당신 한번 골라보시게나~");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 50, 658, 122);
		contentPane.add(lblNewLabel);
	}
}
