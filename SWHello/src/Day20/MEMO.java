package Day20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Color;

public class MEMO extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MEMO frame = new MEMO();
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
	public MEMO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(736, 40, 148, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("검색할 이름");
		lblNewLabel.setBounds(79, 40, 116, 42);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.PINK);
		textField.setBounds(82, 434, 802, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.GREEN);
		textField_1.setBounds(235, 46, 296, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(82, 101, 802, 278);
		contentPane.add(scrollPane);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.YELLOW);
		textField_2.setForeground(Color.WHITE);
		scrollPane.setViewportView(textField_2);
		textField_2.setColumns(10);
	}
}
