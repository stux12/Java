package A_Main;
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
	private JPanel Pane;
	
	
	//메인 화면
	public JavaTestMain() {
		// 창 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		Pane = new JPanel();
		Pane.setBackground(new Color(255, 255, 255));
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);
		
		
		// 버튼 설정
		JButton Start = new JButton("자신있으면 드루와~");
		Start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTestList().setVisible(true);
			}
		});
		Start.setForeground(Color.BLACK);
		Start.setBackground(new Color(255, 255, 255));
		Start.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Start.setBounds(398, 535, 268, 92);
		Pane.add(Start);
		
		JButton Back = new JButton("이전으로 돌아가기");
		Back.setForeground(Color.BLACK);
		Back.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Back.setBackground(Color.WHITE);
		Back.setBounds(66, 535, 268, 92);
		Pane.add(Back);
		
		
		// 라벨 설정
		JLabel png = new JLabel("");
		png.setIcon(new ImageIcon(JavaTestMain.class.getResource("/image/java2.png")));
		png.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		png.setHorizontalAlignment(SwingConstants.CENTER);
		png.setBounds(66, 47, 600, 300);
		Pane.add(png);
		
		JLabel Test = new JLabel("자바 TEST");
		Test.setHorizontalAlignment(SwingConstants.CENTER);
		Test.setFont(new Font("돋움", Font.PLAIN, 30));
		Test.setBounds(218, 388, 268, 70);
		Pane.add(Test);
		
		
		
	}
}
