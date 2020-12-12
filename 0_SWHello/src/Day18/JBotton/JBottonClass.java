package Day18.JBotton;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/*			pane = 게시판같을걸 붙일때 나무판이 있어야하는데 그 나무판을 pane이라고 함
 Swing (4개의 pane)
 JFrame
 		메뉴바
 	버튼, 글상자, -> component 내용이 들어가는 곳
 	(contentpane)
 jdk 1.5 이전에는 반드시 contentpane 사용
 	이후 사용안하고 JFrame 컴포넌트를 배치해도 알아서 cotentpane 인식
 */


public class JBottonClass extends JFrame {
	
	JButton jb1 = new JButton("지웅");
	JButton jb2 = new JButton("이");
	JButton jb3 = new JButton("형");
	JButton jb4 = new JButton("을");
	JButton jb5 = new JButton("맛있게");
	JButton jb6 = new JButton("냠냠");
	
	
	public JBottonClass() { //생성자 start
		getContentPane().setBackground(Color.BLACK); //배경색
		getContentPane().setLayout(new FlowLayout()); 
						// 정렬방식		중앙정렬 - 가로로배치
		getContentPane().add(jb1);
		getContentPane().add(jb2);
		getContentPane().add(jb3);
		getContentPane().add(jb4);
		getContentPane().add(jb5);
		getContentPane().add(jb6);
	
	}
	
	public static void main(String[] args) {
		
		JBottonClass jbc1 = new JBottonClass(); //먼저 생성자로 찾아감
		
		jbc1.setTitle("버튼이야"); //객체.메소드
		jbc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//이거 안하면 x버튼으로 창문을 닫아도 프레임은 종료되었지만 실행프로그램은 종료 안됨
		//이걸 써주면 프레임 닫고 + 실행 프로그램 종료
		
		
				//	가로	세로
		jbc1.setSize(150,200); //화면의 사이즈출력
		jbc1.setVisible(true); //만든 화면을 띄운다
		
		
	}//main_end
	
	

	
	
}//class_end
