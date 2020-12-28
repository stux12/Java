package Day11_21;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class aaa extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	public JTextField txtID;
	public JTextField twtPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aaa frame = new aaa();
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
	public aaa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(72, 130, 288, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(72, 180, 288, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel label = new JLabel("니 아디");
		label.setBounds(3, 137, 57, 15);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("니 비번");
		lblNewLabel.setBounds(3, 190, 57, 15);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("누르지마라");
		btnNewButton.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				dispose(); // 지금 창 해제 -프레임을 닫는것
				setVisible(false); // 지금 창 안보이게
				String id = txtID.getText();
				String pw = twtPW.getText();
				new fff(id, pw).setVisible(true);

			}
		});
		btnNewButton.setBounds(92, 52, 228, 44);
		contentPane.add(btnNewButton);
	}

}
