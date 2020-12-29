package Day12_29_MultiChat;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KajaClientGUI extends JFrame implements Runnable, ActionListener {

	
	
	DataInputStream inputStream;
	DataOutputStream outputStream;
	String nickname;
	
	JLabel jLabel = new JLabel("우리반 채팅");
	JTextArea jTextArea = new JTextArea();
	JTextField jTextField = new JTextField();
	JScrollPane jScrollPane = new JScrollPane(jTextArea);
	
	public KajaClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.inputStream = inputStream;
		this.nickname = nickname;
		this.outputStream = outputStream;
		
		setLayout(new BorderLayout());
		// North, South, West, East, Center
		
		jLabel.setFont(new Font("굴림", Font.BOLD, 22));
		add("North", jLabel); //우리반 채팅
		
		// chat문자열이 출력되는곳
		jTextArea.setBackground(Color.BLACK);
		jTextArea.setForeground(Color.WHITE);
		jTextArea.setFont(new Font("굴림", Font.BOLD, 22));
		jTextArea.setEditable(false); // 편집 X
		add("Center", jScrollPane);// 위에 pane에 area선언되어있으니 쓰면됨
		
		// chat  입력
		jTextField.setBackground(Color.BLACK);
		jTextField.setForeground(Color.WHITE);
		jTextField.setFont(new Font("굴림", Font.BOLD, 25));
		add("South", jTextField);
		jTextField.addActionListener(this);//이벤트등록
		
		setSize(800,800); //채팅창 크기
		setVisible(true); //항상 보여주기
		
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jTextField) {
			try {
				outputStream.writeUTF(nickname + "-->" + jTextField.getText());
			} catch (IOException e1) {
//				e1.printStackTrace();
			}
			jTextField.setText(""); //서버로 보내고 해당 칸을 클리어
		}
	}
	
	//chat올때마다 비프음 주기위해
	// OS를 제어할수있는 클래스
	Toolkit tk1 = Toolkit.getDefaultToolkit();
	@Override
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
	
	
	public static void main(String[] args) {

	}

	
	

}
