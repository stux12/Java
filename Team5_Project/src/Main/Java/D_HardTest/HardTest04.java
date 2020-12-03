package Main.Java.D_HardTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Main.Java.A_Main.JavaTestList;
import Main.main.MainPage;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HardTest04 extends HardRandom {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JButton button;
	JButton btnNewButton;
	JButton button_1;
	JButton button_2;

	
	
	public HardTest04() {
		setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/image/simsimcom.png")));
		setTitle("심심해닷컴\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHell = new JLabel("난이도 HELL");
		lblHell.setIcon(new ImageIcon(HardTest01.class.getResource("/image/Devil.png")));
		lblHell.setForeground(Color.RED);
		lblHell.setOpaque(true);
		lblHell.setHorizontalAlignment(SwingConstants.LEFT);
		lblHell.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblHell.setBackground(Color.BLACK);
		lblHell.setBounds(12, 10, 119, 35);
		contentPane.add(lblHell);
		
	
		JLabel label_1 = new JLabel(num+"/5");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_1.setBounds(675, 10, 47, 34);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setForeground(Color.RED);
		label.setBackground(Color.RED);
		label.setBounds(0, 55, 734, 1);
		contentPane.add(label);
		
		JLabel lblqMain = new JLabel("<html>Q"+num+". 스트림의 특징으로 옳지 않은것은??");
		lblqMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblqMain.setForeground(Color.RED);
		lblqMain.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblqMain.setBounds(68, 100, 600, 53);
		contentPane.add(lblqMain);
		
		JLabel label_2 = new JLabel("남은시간 : "+timer4+"초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(430, 160, 238, 70);
		contentPane.add(label_2);
		
		
		time4= new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer4>=0) {
				label_2.setText("남은시간 : "+timer4+"초 입니다.");
				timer4--;
				}
				else if(timer4<0){
					Hard[num-1]=num;
					HardtleCount++;
					dispose();
					setVisible(false);
					new HardTestTimeOut().setVisible(true);
					time4.stop();
			
					
				}
			}
		});
		time4.start();
		
		JLabel lblNewLabel = new JLabel("시간제한문제");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(68, 160, 238, 70);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("스트림은 데이터 소스를 변경하지 않는다.");
		btnNewButton.setEnabled(true);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setEnabled(false);
				button.setEnabled(true);
				button_1.setEnabled(true);
				button_2.setEnabled(true);
			}
		});
		buttonGroup.add(btnNewButton);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBounds(68, 250, 600, 80);
		contentPane.add(btnNewButton);
		
		button = new JButton("스트림은 일회용이다.");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setEnabled(true);
				button.setEnabled(false);
				button_1.setEnabled(true);
				button_2.setEnabled(true);
			}
		});
		buttonGroup.add(button);
		button.setForeground(Color.RED);
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(68, 350, 600, 80);
		contentPane.add(button);
		
		button_1 = new JButton("원본 데이터를 변경한다.");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setEnabled(true);
				button.setEnabled(true);
				button_1.setEnabled(false);
				button_2.setEnabled(true);
			}
		});
		buttonGroup.add(button_1);
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(68, 450, 600, 80);
		contentPane.add(button_1);
		
		button_2 = new JButton("스트림은 작업을 내부 반복으로 처리한다.");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setEnabled(true);
				button.setEnabled(true);
				button_1.setEnabled(true);
				button_2.setEnabled(false);
			}
		});
		buttonGroup.add(button_2);
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(68, 550, 600, 80);
		contentPane.add(button_2);
		
		JLabel label_3 = new JLabel("확 인");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(button_1.isSelected()) {
					HardCount++;
					dispose();
					setVisible(false);
					turned();
					time4.stop();
			
				}else {
					Hard[num-1]=num;
					HardtleCount++;
					dispose();
					setVisible(false);
					turned();
					time4.stop();
				
				}
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_3.setBounds(249, 640, 238, 70);
		contentPane.add(label_3);
	}

}
