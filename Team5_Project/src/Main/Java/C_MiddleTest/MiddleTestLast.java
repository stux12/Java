package Main.Java.C_MiddleTest;

import java.awt.Color;
import java.awt.Font;
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

import Main.Java.A_Main.JavaTestList;
import Main.main.MainPage;

public class MiddleTestLast extends JavaTestList {

	private JPanel contentPane;
	private String last = "당신의 점수는 ";
	static String num;
	int count;

	public MiddleTestLast() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		last += String.valueOf(MiddleCount * 10) + "점 입니다!!!!";
		JLabel lblNewLabel = new JLabel(last);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setBounds(70, 20, 571, 198);
		contentPane.add(lblNewLabel);

		switch (MiddleCount) {
		case 10:
			JLabel lblNewLabela2 = new JLabel("");
			lblNewLabela2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/omg.png")));
			lblNewLabela2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabela2.setBackground(Color.GREEN);
			lblNewLabela2.setOpaque(true);
			lblNewLabela2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabela2);
			JLabel lblNewLabela = new JLabel("<html>만점입니다!!! <br/>자바언어에 있어서 <br/>기본이 엄청나네요!!!");
			lblNewLabela.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabela.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabela.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabela);
			break;
		case 9:
		case 8:
		case 7:
		case 6:
			JLabel lblNewLabelb2 = new JLabel("");
			lblNewLabelb2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/smiley2.png")));
			lblNewLabelb2.setBackground(Color.GREEN);
			lblNewLabelb2.setOpaque(true);
			lblNewLabelb2.setBounds(50, 250, 300, 250);
			lblNewLabelb2.setBackground(Color.GREEN);
			contentPane.add(lblNewLabelb2);

			JLabel lblNewLabelb = new JLabel("<html>자바에 대해 잘 알고 계시군요~~!! <br/>다음단계에 <br/>도전하세요!!");
			lblNewLabelb.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabelb.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabelb.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabelb);
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			JLabel lblNewLabelc2 = new JLabel("");
			lblNewLabelc2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/bad2.png")));
			lblNewLabelc2.setBackground(Color.GREEN);
			lblNewLabelc2.setOpaque(true);
			lblNewLabelc2.setBackground(Color.GREEN);
			lblNewLabelc2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabelc2);
			JLabel lblNewLabelc = new JLabel("<html>많이 부족하네요~~!! <br/>다시한번 복습하고<br/> 도전하세요!!");
			lblNewLabelc.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabelc.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabelc.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabelc);
			break;
		case 0:
			JLabel lblNewLabeld2 = new JLabel("");
			lblNewLabeld2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/02.png")));
			lblNewLabeld2.setBackground(Color.GREEN);
			lblNewLabeld2.setOpaque(true);
			lblNewLabeld2.setBackground(Color.GREEN);
			lblNewLabeld2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabeld2);
			JLabel lblNewLabeld = new JLabel("<html>지금 장난해요!!!!! <br/>기초부터 <br/>다시 공부하세요!!");
			lblNewLabeld.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabeld.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabeld.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabeld);
			break;
		}

		JButton button_1 = new JButton("메인으로 돌아가기");
		button_1.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/Ghome.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MiddleCount = 0;
				MiddletleCount = 0;
				dispose();
				setVisible(false);
				new MainPage().setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(278, 615, 218, 52);
		contentPane.add(button_1);

		JButton button_2 = new JButton("종료하시겠어요?");
		button_2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/exitG.png")));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(520, 615, 202, 52);
		contentPane.add(button_2);

		num = "<html> 틀린 문제들은 <br/>";

		for (int i = 0; i < Middle.length; i++) {

			if (Middle[i] != 0) {
				num += Middle[i] + "번문제   ";
				count++;
			}
			if (count > 3) {
				num += "<br/>";
				count = 0;
			}
		}
		JButton button = new JButton("틀린문제 확인하기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MiddleTestCheck check = new MiddleTestCheck();
				check.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/TleG.png")));
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.setBounds(23, 615, 213, 52);
		contentPane.add(button);
	}
}
