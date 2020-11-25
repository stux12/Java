package EasyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.JavaTest01;

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

public class EasyTestLast extends EasyTest10 {

	private JPanel contentPane;

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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(76, 74, 551, 191);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("처음문제로 돌아가기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount=0;
				dispose();
				setVisible(false);
				new EasyTest01(EasyCount).setVisible(true);
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button.setBounds(35, 615, 174, 52);
		contentPane.add(button);
		
		JButton button_1 = new JButton("메인으로 돌아가기");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new JavaTest01().setVisible(true);
			}
		});
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_1.setBounds(278, 615, 174, 52);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("종료하시겠어요?");
		button_2.addMouseMotionListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent atg0) {
				dispose();
				setVisible(false);
				System.exit(0);
			}
		});
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_2.setBounds(520, 615, 174, 52);
		contentPane.add(button_2);
	}
}
