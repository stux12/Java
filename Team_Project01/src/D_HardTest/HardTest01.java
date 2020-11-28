package D_HardTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import A_Main.JavaTestList;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HardTest01 extends JavaTestList {

	private JPanel contentPane;
	private JTextField textField;

	
	public HardTest01() {
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
		
		JLabel lblQMain = new JLabel("<html>Q"+num+". main 메소드 전체를 입력하세요.");
		lblQMain.setForeground(Color.RED);
		lblQMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblQMain.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblQMain.setBounds(64, 118, 600, 100);
		contentPane.add(lblQMain);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textField.setBounds(64, 343, 600, 151);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("여기에 입력하세요~");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(64, 303, 136, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("다음 문제");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("public static void main(String[] args)")){
					HardCount++;
				}
				else {
					HardtleCount++;
					Hard[num-1]=num;
				}
				
				turn = (int)Math.ceil(10*Math.random());
				switch (turn) {
				case 5:
					if(test[4]!=1) {
						test[4] = 1;
						num++;
						dispose();
						setVisible(false);
						new HardTest05().setVisible(true);
						break;
						}
				case 4:
					if(test[3]!=1) {
						test[3] = 1;
						num++;
						dispose();
						setVisible(false);
						new HardTest04().setVisible(true);
						break;
						}
				case 3:
					if(test[2]!=1) {
						test[2] = 1;
						num++;
						dispose();
						setVisible(false);
						new HardTest03().setVisible(true);
						break;
						}
				case 2:
					if(test[1]!=1) {
					test[1] = 1;
					num++;
					dispose();
					setVisible(false);
					new HardTest02().setVisible(true);
					break;
					}
				case 1:
					if(test[0]!=1) {
					test[0] = 1;
					num++;
					dispose();
					setVisible(false);
					new HardTest01().setVisible(true);
					break;
					}
				
				}
				
			}
		});
		timer=30;
		JLabel label_2 = new JLabel("남은시간 : "+timer+"초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(405, 280, 238, 70);
		contentPane.add(label_2);
		
		btnNewButton.setBounds(283, 571, 136, 45);
		contentPane.add(btnNewButton);
		
		time= new Timer(1000, new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				if(timer>=0) {
				label_2.setText("남은시간 : "+timer+"초 입니다.");
				timer--;
				}
				else if(timer<0){
					HardtleCount++;
					Hard[num-1]=num;
					dispose();
					setVisible(false);
					new HardTest02TimeOut().setVisible(true);
					time.stop();
					
				}
			}
		});
		time.start();
		
	}
}
