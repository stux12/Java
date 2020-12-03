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

import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HardTest03 extends HardRandom {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	
	
	public HardTest03() {
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
		
		JLabel lblqMain = new JLabel("<html>Q"+num+". 메소드 오버로딩에 대한 설명으로 옳지 않은것은??");
		lblqMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblqMain.setForeground(Color.RED);
		lblqMain.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblqMain.setBounds(68, 150, 616, 53);
		contentPane.add(lblqMain);
		
		JLabel label_2 = new JLabel("남은시간 : "+timer3+"초 입니다.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_2.setBounds(430, 280, 238, 70);
		contentPane.add(label_2);
		
		
		time3= new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(timer3>=0) {
				label_2.setText("남은시간 : "+timer3+"초 입니다.");
				timer3--;
				}
				else if(timer3<0){
					Hard[num-1]=num;
					HardtleCount++;
					dispose();
					setVisible(false);
					new HardTestTimeOut().setVisible(true);
					time3.stop();
			
				}
			}
		});
		time3.start();
		
		JLabel lblNewLabel = new JLabel("시간제한문제");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(68, 280, 238, 70);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.BLACK);
		comboBox.setForeground(Color.RED);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"메소드 이름이 같아야 한다.", "매개변수의 개수 또는 타입이 달라야 한다.", "반환 타입은 관계없다.", "기존에 있는 새로운 메소드를 정의하는 것이다."}));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		comboBox.setBounds(68, 389, 600, 146);
		contentPane.add(comboBox);
		
		JLabel label_3 = new JLabel("확 인");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(comboBox.getSelectedIndex()==3) {
					HardCount++;
					turned();
					time3.stop();
			
				}else {
					Hard[num-1]=num;
					HardtleCount++;
					turned();
					time3.stop();
				
				}
				
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label_3.setBounds(233, 580, 238, 70);
		contentPane.add(label_3);
		
	}
}
