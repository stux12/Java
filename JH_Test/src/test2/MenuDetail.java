package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class MenuDetail extends JFrame {
	public static JButton sButton = new JButton();
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDetail frame = new MenuDetail();
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
	public MenuDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 850);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("부위 - 운동종류");
		lblNewLabel.setFont(new Font("안상수2006굵은", Font.PLAIN, 45));
		lblNewLabel.setBounds(540, 123, 188, 68);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("뒤로가기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				MenuSelect MS1 = new MenuSelect();
				MS1.setVisible(true);
			}
		});
		
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(73, 60, 80, 40);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
			contentPane.add(btnNewButton);
			
			
			sButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
					setVisible(false);
//					PopUp pp = new PopUp();
//					pp.setVisible(true);
				}
			});
			sButton.setBounds(110, 267, 317, 191);
			contentPane.add(sButton);
			
			JButton button = new JButton("New button");
			button.setBounds(662, 267, 317, 191);
			contentPane.add(button);
			
			JButton button_1 = new JButton("New button");
			button_1.setBounds(110, 543, 317, 191);
			contentPane.add(button_1);
			
			JButton button_2 = new JButton("New button");
			button_2.setBounds(662, 543, 317, 191);
			contentPane.add(button_2);
			
			JLabel label = new JLabel("운동 1");
			label.setBounds(464, 293, 57, 15);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("운동 3");
			label_1.setBounds(464, 570, 57, 15);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("운동 2");
			label_2.setBounds(1020, 293, 57, 15);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel("운동 4");
			label_3.setBounds(1020, 570, 57, 15);
			contentPane.add(label_3);
			
			JPanel panel = new JPanel();
			panel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//					PopUp pp = new PopUp();
//					pp.setVisible(true);
				}
			});
			panel.setBounds(71, 142, 46, 31);
			contentPane.add(panel);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(272, 68, 195, 105);
			contentPane.add(comboBox);
	}
}
