package test2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Buger extends JFrame implements ActionListener {

	JLabel jl1 = new JLabel("**굿버거 햄버거 입니다**");
	JLabel jl2 = new JLabel("드실 메뉴를 선택하세요");

	JButton jb1 = new JButton("매운 소스 햄버거 : 5000");
	JButton jb2 = new JButton("더블 비프 햄버거 : 7000");
	JButton jb3 = new JButton("야채새우 햄버거 : 4500");
	JButton jb4 = new JButton("세겹토마토햄버거 : 5500");
	JButton jb5 = new JButton("주문합니다");
	JButton jb6 = new JButton("취소합니다");
	JButton jb7 = new JButton("아니오");

	
	String[] jijum = {"종로", "종로외"};
	JComboBox jc1 = new JComboBox(jijum);
	
	

	String Check = "";
	int price;
	int count;

	public Buger() {
		setLayout(new GridLayout(0, 2, 80, 80));
		setTitle("어서오세요 굿버거입니다");
		setSize(700, 700);
		setVisible(true);

		jl1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		add(jl1);
		jl2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		add(jl2);

		jb5.setBackground(Color.orange);
		jb6.setBackground(Color.yellow);

		jb1.addActionListener(this);
		add(jb1);
		jb2.addActionListener(this);
		add(jb2);
		jb3.addActionListener(this);
		add(jb3);
		jb4.addActionListener(this);
		add(jb4);
		jb5.addActionListener(this);
		add(jb5);
		jb6.addActionListener(this);
		add(jb6);

		jc1.addActionListener(this);
		add(jc1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb1) {
			Check += jb1.getText() + "\n";
			count++;
			price = price + 5000;
		}
		if (e.getSource() == jb2) {
			Check += jb2.getText() + "\n";
			count++;
			price = price + 7000;
		}
		if (e.getSource() == jb3) {
			Check += jb3.getText() + "\n";
			count++;
			price = price + 4500;
		}
		if (e.getSource() == jb4) {
			Check += jb4.getText() + "\n";
			count++;
			price = price + 5500;
		}
		if(e.getSource()==jc1) {
			price = price - 1000;
			jc1.setEnabled(false);
		}
		if (e.getSource() == jb5) {
			Check += "총금액:" + String.valueOf(price) + "원\n" + "총주문수량:" + count + "개";
			JOptionPane.showConfirmDialog(jb5, Check, "확인하세요", 0);
			count = 0;
			price = 0;
			Check = "";
			jc1.setEnabled(true);
		}
		if (e.getSource() == jb6) {
			JOptionPane.showMessageDialog(jb6, "취소되었습니다", "메시지", JOptionPane.INFORMATION_MESSAGE, null);
			count = 0;
			price = 0;
			Check = "";
			jc1.setEnabled(true);
		}

	}

}

public class Test {
	public static void main(String[] args) {
		Buger b1 = new Buger();
	}

}
