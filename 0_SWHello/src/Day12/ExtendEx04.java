package Day12;

import java.util.Scanner;

class Boo2 {
	public void car() {
		System.out.println("부모차타고 드라이브가자");
	}
}// Boo class_end

class Ja2 extends Boo2{ // Boo를 상속
	public void car() { // car()를 overriding 1. 상속이며 메소드 이름 같고, 2. 기존것에 비해 업그레이드 됨
		System.out.println("자녀차타고 폼나게 여행가자");
	}
}// Ja class_end

public class ExtendEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어느차를 타시렵니까  (부모차=1 자녀차=2) >");
		String a = sc.next();
		
		Boo2 boo = new Boo2();
		Boo2 boo2= (Boo2)new Ja2();
		
		if(a.equals("1")) {
			boo.car();
		}
		else if(a.equals("2")) {
			boo2.car();
		}
		else {
			System.out.println("오류입니다");
		}
//		
//		switch (b) {
//		case 1 : boo.car(); break;
//		case 2 : boo2.car(); break;
//		default : System.out.println("오류입니다.");
//		}
		
		
	}// main_end
}// Extend class_end