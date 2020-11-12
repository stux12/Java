package Day07;


class Boomo{				// 부모의 재산
	protected int diamond;
	public void don() {
		System.out.println("나 재산 많아~~~~");
	}
}
				//Boomo를 상속한다
class janyo extends Boomo{		// 자식의 재산 = 부모재산 + 자기꺼
	public void car() {
		diamond=3;
		System.out.println("중형차 있음 ~~~~~");
	}
}
					
public class Extend {
				// 설계도에는 객체를 만들수 없어서 메인에서 만들어야함
	public static void main(String[] args) {
		
		// 객체 생성
		Boomo b1 = new Boomo();
		b1.don();
//		b1.diamond; // 상속된사람만 접근가능함
		
		janyo j1 = new janyo();
		j1.don();
		
		j1.car();
		
//		b1.car(); // 부모는 자식 car()에 접근을 못해서 그럼
		
		System.out.println(j1.diamond); // 객체.속성
	}// main_end
}// Extend_end
