package Day20.HAPCIGI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Day21.fff;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bbb extends JFrame {

	private JPanel contentPane;
	public JTextField txtID;
	public JTextField twtPW;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bbb frame = new bbb();
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
	
		
		

	public bbb() {
		getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(73, 150, 282, 21);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(73, 102, 282, 21);
		getContentPane().add(textPane_1);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(12, 102, 57, 15);
		getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setBounds(12, 156, 57, 15);
		getContentPane().add(lblPw);
		
		JButton btnNewButton = new JButton("인자 갖고가자");
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				dispose(); //지금 창 해제 -프레임을 닫는것
				setVisible(false); //지금 창 안보이게
				String id = txtID.getText();
				String pw = twtPW.getText();
//				new fff(id,pw).setVisible(true);
				// fff 는 textfield 하나 만들고 시작
				// aaa에서 빨간줄 나오면 change..선택
				// 이때 fff에서 textField.setText(id+","+pw)추가
				// 또한 main의 fff에 빨간줄 나오면
				// bbb인자{} 이래에 다음처럼 디폴트 하나 생성한다
				
				
			}
		});
		btnNewButton.setBounds(74, 46, 281, 31);
		getContentPane().add(btnNewButton);
		// TODO Auto-generated constructor stub
	}
}
