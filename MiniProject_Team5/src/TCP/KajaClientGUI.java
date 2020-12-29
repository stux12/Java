package TCP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class KajaClientGUI extends JFrame implements Runnable, ActionListener  {

	private JPanel contentPane;
	DataOutputStream outputStream;
	DataInputStream inputStream;
	String name;
	
	JLabel jLabel = new JLabel("5조 채팅방이다");
	JTextArea jTextArea = new JTextArea();
	JTextField jTextField = new JTextField();
	JScrollPane jScrollPane = new JScrollPane(jTextArea);
	
	public KajaClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String name) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.name = name;
//	}
	
//		public KajaClientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("여기에는 그림파일선택 하는공간");
			}
		});
		
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(3, 710, 60, 42);
		contentPane.add(lblNewLabel_1);
		lblNewLabel.setBounds(83, 724, 45, 18);
		lblNewLabel.setForeground(Color.WHITE);
		
		contentPane.add(lblNewLabel);
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setBounds(5, 5, 472, 44);
		jLabel.setForeground(Color.WHITE);
		
		jLabel.setFont(new Font("굴림", Font.BOLD, 22));
		getContentPane().add(jLabel); //우리반 채팅
		
		// chat문자열이 출력되는곳
		jTextArea.setBackground(Color.BLACK);
		jTextArea.setForeground(Color.WHITE);
		jTextArea.setFont(new Font("굴림", Font.BOLD, 22));
		jTextArea.setEditable(false);
		jScrollPane.setBounds(0, 96, 482, 616);
		getContentPane().add(jScrollPane);
		jTextField.setBounds(63, 710, 418, 44);
		
		// chat  입력
		jTextField.setBackground(Color.BLACK);
		jTextField.setForeground(Color.WHITE);
		jTextField.setFont(new Font("굴림", Font.BOLD, 25));
		getContentPane().add(jTextField);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(9, 48, 85, 42);
		
		contentPane.add(lblNewLabel_2);
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(319, 52, 157, 36);
		
		contentPane.add(lblNewLabel_3);
		jTextField.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0); // 이걸 해줘야 퇴장메세지가 나옴
								// 단 1명 접속은 보낼 사람이 없으니 안나오고
								// 2명이상일때 나옴
				setVisible(false);
			}
		});
		// 서버로 부터 받아 textarea에 뿌려주는 쓰레드
		Thread th1 = new Thread(this);
		th1.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jTextField) {
			try {
				outputStream.writeUTF(name + "-->" + jTextField.getText());
			} catch (IOException e1) {
//				e1.printStackTrace();
			}
			jTextField.setText(""); //서버로 보내고 해당 칸을 클리어
		}
	}
	//chat올때마다 비프음 주기위해
	Toolkit tk1 = Toolkit.getDefaultToolkit();
	private final JLabel lblNewLabel = new JLabel(">>>>");
	private final JLabel lblNewLabel_2 = new JLabel("설정");
	private final JLabel lblNewLabel_3 = new JLabel("누구들어왔는지?");
	// OS를 제어할수있는 클래스
	public void run() {
		try {
		while(true) {
			String strServer1 = inputStream.readUTF(); //서버로
			if(strServer1 == null) {
				jTextArea.append("\n"+"종료");
				return;
			}
			jTextArea.append("\n"+strServer1); // 서버에소 온것 textarea에 추가
			
			//이아래를 해야 스크롤바가 생긴후 맨 마지막 내용이 잘보임
			int kkeut = jTextArea.getText().length();
			jTextArea.setCaretPosition(kkeut);//커서를 맨뒤로
//			jTextArea.setCaretPosition(0);//커서를 맨처음으로
			tk1.beep(); //chat이 올때마다 beep음
		
		}
		}catch(Exception e) {
			jTextArea.append("\n"+e);
		}
	}
}
