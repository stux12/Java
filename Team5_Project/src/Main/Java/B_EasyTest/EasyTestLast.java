package Main.Java.B_EasyTest;

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

public class EasyTestLast extends JavaTestList {

	private JPanel Pane;
	private String last = "당신의 점수는 ";
	static String num; 
	int count;
	public EasyTestLast() {

		// 창 설정
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		Pane = new JPanel();
		Pane.setBackground(Color.YELLOW);
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);


		// 버튼 설정
		JButton button_1 = new JButton("메인으로 돌아가기");
		button_1.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/Yhome.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount = 0;
				EasytleCount=0;
				dispose();
				setVisible(false);
				new MainPage().setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(new Color(255, 255, 0));
		button_1.setBounds(262, 615, 213, 52);
		Pane.add(button_1);

		JButton button_2 = new JButton("종료하시겠어요?");
		button_2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/exitY.png")));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(new Color(255, 255, 0));
		button_2.setBounds(498, 615, 224, 52);
		Pane.add(button_2);

		JButton button = new JButton("틀린문제 확인하기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				num = "<html> 틀린 문제들은 <br/>";
				
				for(int i=0; i<Easytle.length; i++) {
					
					if(Easytle[i]!=0) {
						num += Easytle[i]+"번문제   ";
						count++;
					}
					if(count>3) {
						num += "<br/>";
						count=0;
					}
				}
				EasyTestCheck check = new EasyTestCheck();
				check.setVisible(true);

			}
		});
		button.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/TleY.png")));
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.YELLOW);
		button.setBounds(12, 615, 213, 52);
		Pane.add(button);

		// 라벨 설정
		last += String.valueOf(EasyCount * 10) + "점 입니다!!!!"; // 마지막 점수 다르게 주기위해
		JLabel lblNewLabel = new JLabel(last);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setBounds(70, 20, 571, 198);
		Pane.add(lblNewLabel);
		
		// 정답 출력
		switch (EasyCount) {// 점수에 따라 다른값이 나오게
		case 10:
			JLabel lblNewLabela2 = new JLabel("");
			lblNewLabela2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/fireworks.jpg")));
			lblNewLabela2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabela2.setBackground(Color.YELLOW);
			lblNewLabela2.setOpaque(true);
			lblNewLabela2.setBounds(50, 250, 300, 250);
			Pane.add(lblNewLabela2);
			JLabel lblNewLabela = new JLabel("<html>만점입니다!!! <br/>당신은 여기에 있을 <br/>실력이 아니네요!!");
			lblNewLabela.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabela.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabela.setBounds(400, 250, 300, 250);
			Pane.add(lblNewLabela);
			break;
		case 9:
		case 8:
		case 7:
		case 6:
			JLabel lblNewLabelb2 = new JLabel("");
			lblNewLabelb2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/good.png")));
			lblNewLabelb2.setBackground(Color.YELLOW);
			lblNewLabelb2.setOpaque(true);
			lblNewLabelb2.setBounds(50, 250, 300, 250);
			lblNewLabelb2.setBackground(Color.YELLOW);
			Pane.add(lblNewLabelb2);

			JLabel lblNewLabelb = new JLabel("<html>병아리 탈출~~!! <br/>다음단계에 <br/>도전하세요!!");
			lblNewLabelb.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabelb.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabelb.setBounds(400, 250, 300, 250);
			Pane.add(lblNewLabelb);
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			JLabel lblNewLabelc2 = new JLabel("");
			lblNewLabelc2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/bad.png")));
			lblNewLabelc2.setBackground(Color.YELLOW);
			lblNewLabelc2.setOpaque(true);
			lblNewLabelc2.setBackground(Color.YELLOW);
			lblNewLabelc2.setBounds(50, 250, 300, 250);
			Pane.add(lblNewLabelc2);
			JLabel lblNewLabelc = new JLabel("<html>많이 부족하네요~~!! <br/>다시한번 복습하고<br/> 도전하세요!!");
			lblNewLabelc.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabelc.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabelc.setBounds(400, 250, 300, 250);
			Pane.add(lblNewLabelc);
			break;
		case 0:
			JLabel lblNewLabeld2 = new JLabel("");
			lblNewLabeld2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/0.png")));
			lblNewLabeld2.setBackground(Color.YELLOW);
			lblNewLabeld2.setOpaque(true);
			lblNewLabeld2.setBackground(Color.YELLOW);
			lblNewLabeld2.setBounds(50, 250, 300, 250);
			Pane.add(lblNewLabeld2);
			JLabel lblNewLabeld = new JLabel("<html>0점이에요 0점!!!!! <br/>말이 안되는 점수!! <br/>다시 공부하세요!!");
			lblNewLabeld.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabeld.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabeld.setBounds(400, 250, 300, 250);
			Pane.add(lblNewLabeld);
			break;
		}
	}
}
