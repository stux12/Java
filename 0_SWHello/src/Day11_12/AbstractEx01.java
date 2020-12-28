package Day11_12;

// 일반클래스 -> 추상클래스 // 다중상속 X
abstract class Kwail { // 추상 메소드를 썻으면 클래스도 추상 클래스로 해줘야함!!
						// 구현 O 선언O
	public void good() {
		System.out.println("먹으면 좋아");
	}// method_end

	public abstract void mukja(); // 추상 메소드 구현 X 선언 O
}// class_end

// 사과 클래스 만들기          //Kwail을 상속
class Sakwa extends Kwail {
	public void mukja() { // 상속받은 클래스에서 추상 메소드를 구현을 안해서 구현을 해야함
		System.out.println("사과를 사각사각먹자");
	}
}// class_end

class Bae extends Kwail {
	public void mukja() {
		System.out.println("배를 사각사각먹자");
	}
}

class Gam extends Kwail {
	public void mukja() {
		System.out.println("감을 부셔버려서 먹자");
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {

		Kwail k1 = new Sakwa(); // 추상화를 썻기때문에 부모에 자식것을 넣어도 에러가 안남 + 객체의 형변환
		Kwail k2 = new Bae();
		Kwail k3 = new Gam();

//		Kwail k4 = new good(); // 추상클래스가 되면서 구현을 할수없기 때문에 에러남
		Kwail k4 = new Bae(); // 배 객체를 선언 배객체는 과일을 상속
		k4.good(); // 상속되었기 때문에 good메서드 사용가능!!

		k1.mukja(); // 다형성
		k2.mukja();
		k3.mukja();

	}// main_end
}// class_end
