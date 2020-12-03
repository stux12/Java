package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class MenuSelect extends MenuDetail {
	MenuDetail md;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSelect frame = new MenuSelect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 850);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
//				Profile pf = new Profile();
//				pf.setVisible(true);
						
			}
		});
		btnNewButton.setBounds(1200, 45, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("뒤로가기");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
//				Project p1 = new Project();
//				p1.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setBounds(71, 49, 57, 48);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("운동 선택하기");
		label.setFont(new Font("HY견고딕", Font.PLAIN, 33));
		label.setBounds(538, 147, 227, 65);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("기능성 및 전신 운동");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				sButton.setText("바껴라");
				//sButton
				md = new MenuDetail();
				md.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(292, 295, 227, 152);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("등");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				setVisible(false);
				
				MenuDetail md = new MenuDetail();
				md.setVisible(true);
				
			}
		});
		btnNewButton_1_1.setBounds(538, 295, 227, 152);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("어깨");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				MenuDetail md = new MenuDetail();
				md.setVisible(true);
				
			}
		});
		btnNewButton_1_2.setBounds(784, 295, 227, 152);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("팔");
		btnNewButton_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				MenuDetail md = new MenuDetail();
				md.setVisible(true);
			}
		});
		btnNewButton_1_3.setBounds(292, 474, 227, 152);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("다리");
		btnNewButton_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				MenuDetail md = new MenuDetail();
				md.setVisible(true);
			}
		});
		btnNewButton_1_4.setBounds(538, 474, 227, 152);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("유산소");
		btnNewButton_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				MenuDetail md = new MenuDetail();
				md.setVisible(true);
			}
		});
		btnNewButton_1_5.setBounds(784, 474, 227, 152);
		contentPane.add(btnNewButton_1_5);
	}
}