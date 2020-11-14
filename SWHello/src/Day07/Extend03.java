package Day07;

class Boo {
	public void car() {
		System.out.println("부모차타고 드라이브가자");
	}
}// Boo class_end

class Ja extends Boo{ // Boo를 상속
	public void car() { // car()를 overriding 1. 상속이며 메소드 이름 같고, 2. 기존것에 비해 업그레이드 됨
		System.out.println("자녀차타고 폼나게 여행가자");
	}
}// Ja class_end

public class Extend03 {

	public static void main(String[] args) {
		
		Boo b1 = new Boo();
		Ja j1 = new Ja();
		
		b1.car(); // 부모 차
		j1.car(); // 자녀 차
		
		
		// 객체의 형변환
		Boo b2 = j1; // 부모가 자녀의 값을 받아옴, 재산문제 부모 <= 자녀
		Boo b3 = new Ja(); // 위에거랑 같은것
		
//		ja j2 = b1; // 자녀가 부모의 값을 받아오지는 못함, 재산문제  부모 <= 자녀
//		ja j3 = new Boo(); // 위에거랑 같은것
		
		Ja j2 = (Ja)b3; // b3는 new Ja()에서 나왔으니 Boo객체를 -> Ja로 만들어서 저장
		
//		Ja j3 = (Ja)b1; // 처음 Boo객체라도 Ja객체로 형변환해서 저장도 가능 하지만 에러남 재산이 다르기 때문에 손해볼짓을 안함!!!
//		ja j3 = new Boo(); 
//		compiler까지는 맞지만 실행시키면 틀림
		
		// 객체의 형변환이 되어서 이치에는 맞지않지만 부모는 자식차를 타게됨!!!!
		Boo b5 = new Ja();
		b5.car();
		
		b2.car(); // 자녀꺼가 부모에 넘어가서 부모가 자녀의 값을 가짐
		
//		j3.car(); // 강제형변환으로 속여가지고 에러는 안나지만 찾아갔을때는 맞지않게되서 에러남!!!!
		
		
	}// main_end
}// Extend class_end
