package Day18.JBotton;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckboxClass extends JFrame {

	public JCheckboxClass() {
		JPanel jp1 = new JPanel(); //패널 = 나무판 //조각케익
		JCheckBox jcb1 = new JCheckBox("회원카드 보유", true);
		JCheckBox jcb2 = new JCheckBox("장기회원", true);
		JCheckBox jcb3 = new JCheckBox("해외여행신청여부", false);
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		//getContentPane().add(jcb1);
		getContentPane().add(jp1);
		//프레임의 contentpane을 알아낸후 컴포넌트 부착
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		JCheckboxClass jcb1 = new JCheckboxClass();
		jcb1.setTitle("체크박스라는~~");
		jcb1.setSize(500,500);
		jcb1.setVisible(true);
		
		
	}
}
