package Day18.JBotton;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutMainClass extends Frame {

	public GridLayoutMainClass() //생성자
	{ // 자동주문기계에서 화면구성하기 //Grid : 격자
		this.setLayout(new GridLayout(2,3)); //2행 3열
		//this.setLayout(new GridLayout(2,3,10,10));
		//GridLayout(2,3,30,30) 2행 3열이면서 (좌우,상하), 간격은(30,30)
		//setLayout(null) 은 개발자 임의대로 (absolute layout)
		
		this.add(new Button("눌러봐"));
		this.add(new Button("너싫어"));
		this.add(new Button("어쩌라고"));
		this.add(new Button("아무거나"));
		this.add(new Button("그만해"));
		this.add(new Button("함지웅"));
		
		this.setSize(300,300);
		this.setVisible(true);
		//x 버튼 활성화			// 어뎁터는 다적을필요없어 하나만적어 내가 해결해줄게 이런뜻???
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
	
	}
	
	
	public static void main(String[] args) {
	
		//GrodLayoutMainClass flc1 = new GridLayoutMainClass();
		new GridLayoutMainClass();//생성자 (인자가없는 디폴트 생성자)
	
	}
	
	
}
