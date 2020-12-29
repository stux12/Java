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
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("이름을 입력하세요");
		textField.setBounds(111, 379, 247, 72);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Socket s1;
		try {
			s1 = new Socket("172.0.0.1", 8899);
			DataOutputStream outputStream = new DataOutputStream(s1.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s1.getInputStream());
			outputStream.writeUTF("##");
		 
		
		JButton button = new JButton("입장하기");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
//				new KajaClientGUI(outputStream, inputStream, 닉네임) {
//					public void closeWork() throws IOException{
//						outputStream.close();
//						inputStream.close();
//						System.exit(0);
//				}
//				}
				
			}
		});
		
		button.setBounds(111, 556, 236, 72);
		contentPane.add(button);
		}
		catch (IOException e1) {
		}
		JLabel label = new JLabel("가가오독");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 30));
		label.setBounds(46, 55, 380, 136);
		contentPane.add(label);
		
		
		
	}
}
