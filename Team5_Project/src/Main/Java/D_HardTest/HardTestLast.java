package Main.Java.D_HardTest;

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

import Main.Java.C_MiddleTest.MiddleTestLast;
import Main.main.MainPage;

public class HardTestLast extends HardRandom {

	private JPanel contentPane;
	private String last = "당신의 점수는 ";
	int count;
	String num;

	public HardTestLast() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		last += String.valueOf(HardCount * 20) + "점 입니다!!!!";
		JLabel lblNewLabel = new JLabel(last);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setBounds(70, 20, 571, 198);
		contentPane.add(lblNewLabel);

		switch (HardCount) {
		case 5:
			JLabel lblNewLabela2 = new JLabel("");
			lblNewLabela2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/god1.png")));
			lblNewLabela2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabela2.setBackground(Color.BLACK);
			lblNewLabela2.setForeground(Color.RED);
			lblNewLabela2.setOpaque(true);
			lblNewLabela2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabela2);

			JLabel lblNewLabela = new JLabel("<html>만점입니다!!! <br/>당신은 정말로 신이십니까??");
			lblNewLabela.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabela.setBackground(Color.BLACK);
			lblNewLabela.setForeground(Color.RED);
			lblNewLabela.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabela.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabela);
			break;
		case 4:
		case 3:
			JLabel lblNewLabelc2 = new JLabel("");
			lblNewLabelc2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/good3.png")));
			lblNewLabelc2.setBackground(Color.BLACK);
			lblNewLabelc2.setForeground(Color.RED);
			lblNewLabelc2.setOpaque(true);
			lblNewLabelc2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabelc2);
			JLabel lblNewLabelc = new JLabel("<html>잘하셨네요!!! <br/>당신은 이미 공부가 충분합니다!!");
			lblNewLabelc.setBackground(Color.BLACK);
			lblNewLabelc.setForeground(Color.RED);
			lblNewLabelc.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabelc.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabelc.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabelc);
			break;
		case 2:
		case 1:
			JLabel lblNewLabele2 = new JLabel("");
			lblNewLabele2.setBackground(Color.BLACK);
			lblNewLabele2.setForeground(Color.RED);
			lblNewLabele2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/bad3.png")));
			lblNewLabele2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabele2.setOpaque(true);
			lblNewLabele2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabele2);

			JLabel lblNewLabele = new JLabel("<html>조금더 공부를 하신다면 <br/>분명히 성공할거에요!!");
			lblNewLabele.setBackground(Color.BLACK);
			lblNewLabele.setForeground(Color.RED);
			lblNewLabele.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabele.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabele.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabele);
			break;
		case 0:
			JLabel lblNewLabelf2 = new JLabel("");
			lblNewLabelf2.setBackground(Color.BLACK);
			lblNewLabelf2.setForeground(Color.RED);
			lblNewLabelf2.setIcon(new ImageIcon(MiddleTestLast.class.getResource("/image/jigso2.png")));
			lblNewLabelf2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabelf2.setOpaque(true);
			lblNewLabelf2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabelf2);

			JLabel lblNewLabelf = new JLabel("<html>아직 여기에 올 실력이 아니에요!! <br/>다시 공부해서 도전하세요!!");
			lblNewLabelf.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabelf.setBackground(Color.BLACK);
			lblNewLabelf.setForeground(Color.RED);
			lblNewLabelf.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabelf.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabelf);
			break;
		}

		JButton button_1 = new JButton("메인으로 돌아가기");
		button_1.setForeground(Color.RED);
		button_1.setIcon(new ImageIcon(HardTestLast.class.getResource("/image/Rhome.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HardCount = 0;
				HardtleCount = 0;
				dispose();
				setVisible(false);
				new MainPage().setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(278, 615, 218, 52);
		contentPane.add(button_1);

		JButton button_2 = new JButton("종료하시겠어요?");
		button_2.setForeground(Color.RED);
		button_2.setIcon(new ImageIcon(HardTestLast.class.getResource("/image/exitB.png")));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(520, 615, 202, 52);
		contentPane.add(button_2);

		num = "<html> 틀린 문제들은 <br/>";

		for (int i = 0; i < Hard.length; i++) {

			if (Hard[i] != 0) {
				num += Hard[i] + "번문제   ";
				count++;
			}
			if (count > 3) {
				num += "<br/>";
				count = 0;
			}
		}

		JButton button = new JButton("틀린문제 확인하기");
		button.setForeground(Color.RED);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HardTestCheck check = new HardTestCheck();
				check.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(HardTestLast.class.getResource("/image/1.png")));
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(23, 615, 213, 52);
		contentPane.add(button);

	}

}
