package TCP;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JTextField;

public class TcpClient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		TcpClient frame = new TcpClient();
		frame.setVisible(true);
	}
	
	public TcpClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(95, 237, 247, 72);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JButton button = new JButton("입장하기");
		button.setBounds(95, 347, 247, 72);
		contentPane.add(button);
		try {
			Socket s1 = new Socket("127.0.0.1", 9000);
			DataOutputStream outputStream = new DataOutputStream(s1.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s1.getInputStream());
			
		 
		
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				KajaClientGUI gui = new KajaClientGUI(outputStream, inputStream, textField.getText());
				try {
					outputStream.writeUTF("##"+textField.getText());
				} catch (IOException e1) {
				}
				gui.setVisible(true);
				setVisible(false);
				
			}
		});
		}// try-end
		catch (IOException e1) {
			System.out.println("에러?");
		}
		JLabel label = new JLabel("가가오독");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 30));
		label.setBounds(34, 24, 380, 136);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("이름을 입력하세용~");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(147, 207, 155, 18);
		contentPane.add(lblNewLabel);
		
		
	
	}
}
