package D_HardTest;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import A_Main.JavaTestList;

public class HardTest02 extends JavaTestList {

	private JPanel contentPane;
	
	public HardTest02() {
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
		
	
		JLabel label_1 = new JLabel(num+"/10");
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
		
		JLabel lblqMain = new JLabel("<html>Q"+num+". 다음 선택중 틀린것은 어떤것일까요??");
		lblqMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblqMain.setForeground(Color.RED);
		lblqMain.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblqMain.setBounds(63, 120, 600, 150);
		contentPane.add(lblqMain);
		
		JLabel label_2 = new JLabel("남은시간 : "+timer+"초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(405, 300, 238, 70);
		contentPane.add(label_2);
		
		timer=10;
		time= new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer>=0) {
				label_2.setText("남은시간 : "+timer+"초 입니다.");
				timer--;
				}
				else if(timer<0){
					HardtleCount++;
					Hard[num]=num;
					dispose();
					setVisible(false);
					new HardTest02TimeOut().setVisible(true);
					time.stop();
					
				}
			}
		});
		time.start();
		
		JLabel lblNewLabel = new JLabel("시간제한문제");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(73, 300, 238, 70);
		contentPane.add(lblNewLabel);
		
		
	}
}
