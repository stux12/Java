package B_EasyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import A_Main.JavaTestList;
import A_Main.JavaTestMain;

import javax.swing.SwingConstants;

public class EasyTestLast extends EasyTest10 {

	private JPanel contentPane;
	private String last = "당신의 점수는 ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyTestLast frame = new EasyTestLast(EasyCount);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param easyCount 
	 * 
	 * @param easyCount
	 */
	public EasyTestLast(int easyCount) {
		super(easyCount);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		last += String.valueOf(EasyCount * 10) + "점 입니다!!!!";
		JLabel lblNewLabel = new JLabel(last);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setBounds(70, 20, 571, 198);
		contentPane.add(lblNewLabel);
		
		switch (EasyCount) {
		case 10:
			JLabel lblNewLabela2 = new JLabel("");
			lblNewLabela2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/fireworks.jpg")));
			lblNewLabela2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabela2.setBackground(Color.YELLOW);
			lblNewLabela2.setOpaque(true);
			lblNewLabela2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabela2);
			JLabel lblNewLabela = new JLabel("<html>만점입니다!!! <br/>당신은 여기에 있을 <br/>실력이 아니네요!!");
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
			lblNewLabelb2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/good.png")));
			lblNewLabelb2.setBackground(Color.YELLOW);
			lblNewLabelb2.setOpaque(true);
			lblNewLabelb2.setBounds(50, 250, 300, 250);
			lblNewLabelb2.setBackground(Color.YELLOW);
			contentPane.add(lblNewLabelb2);
			
			JLabel lblNewLabelb = new JLabel("<html>병아리 탈출~~!! <br/>다음단계에 <br/>도전하세요!!");
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
			lblNewLabelc2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/bad.png")));
			lblNewLabelc2.setBackground(Color.YELLOW);
			lblNewLabelc2.setOpaque(true);
			lblNewLabelc2.setBackground(Color.YELLOW);
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
			lblNewLabeld2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/0.png")));
			lblNewLabeld2.setBackground(Color.YELLOW);
			lblNewLabeld2.setOpaque(true);
			lblNewLabeld2.setBackground(Color.YELLOW);
			lblNewLabeld2.setBounds(50, 250, 300, 250);
			contentPane.add(lblNewLabeld2);
			JLabel lblNewLabeld = new JLabel("<html>0점이에요 0점!!!!! <br/>말이 안되는 점수!! <br/>다시 공부하세요!!");
			lblNewLabeld.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			lblNewLabeld.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabeld.setBounds(400, 250, 300, 250);
			contentPane.add(lblNewLabeld);
			break;
		}

		JButton button = new JButton("처음문제로 돌아가기");
		button.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/left.png")));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount = 0;
				dispose();
				setVisible(false);
				new EasyTest01(EasyCount).setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(new Color(255, 255, 0));
		button.setBounds(35, 615, 174, 52);
		contentPane.add(button);

		JButton button_1 = new JButton("메인으로 돌아가기");
		button_1.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/Yhome.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount=0;
				dispose();
				setVisible(false);
				new JavaTestMain().setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(new Color(255, 255, 0));
		button_1.setBounds(278, 615, 174, 52);
		contentPane.add(button_1);

		JButton button_2 = new JButton("종료하시겠어요?");
		button_2.setIcon(new ImageIcon(EasyTestLast.class.getResource("/image/Right1.png")));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});

		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(new Color(255, 255, 0));
		button_2.setBounds(520, 615, 187, 52);
		contentPane.add(button_2);

	}
}
