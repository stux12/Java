package Main.Java.D_HardTest;

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

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HardTest02 extends HardRandom {

	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;

	public HardTest02() {
		
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
		
		JLabel lblqMain = new JLabel("<html>Q"+num+". static을 붙여야할 상황으로 옳은것을 모두 고르시오.");
		lblqMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblqMain.setForeground(Color.RED);
		lblqMain.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblqMain.setBounds(68, 133, 600, 53);
		contentPane.add(lblqMain);
		
		JLabel label_2 = new JLabel("남은시간 : "+timer2+"초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(430, 200, 238, 70);
		contentPane.add(label_2);
		
		
		time2= new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer2>=0) {
				label_2.setText("남은시간 : "+timer2+"초 입니다.");
				timer2--;
				}
				else if(timer2<0){
					Hard[num-1]=num;
					HardtleCount++;
					dispose();
					setVisible(false);
					new HardTestTimeOut().setVisible(true);
					time2.stop();
				
					
				}
			}
		});
		time2.start();
		
		JLabel lblNewLabel = new JLabel("시간제한문제");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(68, 200, 238, 70);
		contentPane.add(lblNewLabel);
		
		chckbxNewCheckBox = new JCheckBox("클래스를 설계할때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 붙인다");
		chckbxNewCheckBox.setForeground(Color.RED);
		chckbxNewCheckBox.setBackground(Color.BLACK);
		chckbxNewCheckBox.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(68, 300, 580, 70);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("클래스 변수는 인스턴스를 생성하지 않으면 사용할 수 없다.");
		checkBox.setForeground(Color.RED);
		checkBox.setBackground(Color.BLACK);
		checkBox.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		checkBox.setBounds(68, 374, 580, 70);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("클래스 메소드는 인스턴스 변수를 사용할 수 있다.");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setBackground(Color.BLACK);
		checkBox_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		checkBox_1.setBounds(68, 449, 580, 70);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("메서드 내에서 인스턴스 변수를 사용하지 않는다면, 붙이는 것을 고려한다.");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setBackground(Color.BLACK);
		checkBox_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		checkBox_2.setBounds(68, 523, 580, 70);
		contentPane.add(checkBox_2);
		
		JButton button = new JButton("다음 문제로");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(chckbxNewCheckBox.isSelected()&&checkBox_2.isSelected()) {
					HardCount++;
					time2.stop();
					turned();
					dispose();
					setVisible(false);
					
				}else {
					HardtleCount++;
					Hard[num-1]=num;
					time2.stop();
					turned();
					dispose();
					setVisible(false);
					
				
				}
			}
		});
		button.setBackground(Color.BLACK);
		button.setForeground(Color.RED);
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		button.setBounds(209, 613, 286, 53);
		contentPane.add(button);
		
		
	}
}
