package Day20;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MEMO extends JFrame {

	/*
	 * 자바 <------------> db 드라이버 프로그램(ojdbc6.jar) jdk에넣음
	 */

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea1;
	private JButton btnNewButton;

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

		btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					try {
						kaja();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}

			}

			private void kaja() throws ClassNotFoundException, SQLException {
				textArea1.setText("");
				textField_1.setText("");
				Connection con = null;

				// JDBC
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection // DB접속 URL
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
				textField_1.setText("db에 접속되었습니다");

				String sql = "select first_name, last_name, phone_number" + " from employees" + " where first_name = ?";

				PreparedStatement st = con.prepareStatement(sql);

				st.setString(1, textField.getText());

				ResultSet rs = st.executeQuery();

				String str1 = String.format("%20s\t%25s\n\n", "[이 름]", "[전 화 번 호]");
				if (rs.next()) {
					do {
						String fname = rs.getString(1);
						String lname = rs.getString(2);
						String phone = rs.getString(3);

						str1 += String.format("%-20s%-20s%-20s\n", fname, lname, phone);
					} while (rs.next());
					textArea1.setText(str1);
				} else {
					textArea1.setText("그런 이름은 없습니다.");
					con.close();
				}
			}
		});
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
