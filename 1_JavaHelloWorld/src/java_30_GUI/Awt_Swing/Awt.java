package java_30_GUI.Awt_Swing;

import java.awt.Dimension;

public class Awt {

	public static void main(String[] args) {
		
		MakeBtn btn = new MakeBtn();
//		btn.pack(); //컴포넌트의 사이즈를 정함
		btn.setSize(new Dimension(200,200));//컴포넌트의 사이즈를 개발자가 정함
		btn.setVisible(true);//화면에 출력함
		
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			btn.setVisible(false);
			btn.dispose();//자원해제
		}
		
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			System.exit(0);//애플리케이션 종료
		}
		
		
		MakeFrame makeFrame = new MakeFrame();
		makeFrame.setSize(new Dimension(500,500));
		makeFrame.setVisible(true);
		
		
		
	}
}
