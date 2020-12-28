package Day11_17;

/*
super - 부모클래스 멤버에 접근하고자 할 때 사용 super.parent7() 형태
super() - 부모클래스의 생성자를 요구 할 때 사용 ==> 반드시 첫번째 문장에 와야 한다 Super() 형태
*/

class parent7 {
	int don; // 속성 필드

	public parent7(int don) { // 인자있는 생성자
		this.don = don;
		System.out.println("투");
	}

	public parent7() { // 인자없는 생성자
		System.out.println("나 돈 없어!!");
	}

}// class_end

class child7 extends parent7 {

	public child7() {
		System.out.println("나는 엄청나게 많아");
	}

	public child7(int don) { // 인자있는 생성자
		super(don); // don이라는 인자가 있는 부모쪽으로감
//		super(); // () 인자가 없는 부모쪽으로감 아무것도안쓰면 이게 생략된 형태

//		this.don=don;
		System.out.println(don);
		System.out.println(super.don);
	}

}// class_end

public class SuperEx01 {

	public static void main(String[] args) {

//		child7 c7 = new child7();
		child7 c8 = new child7(1000);
		// 부모의 디폴트생성자와 자녀의 디폴트 생성자가 둘다 나옴
		// 자녀는 부모를 상속하기때문에 부모를 무조건 한번 찾아가고나서 자기쪽으로옴!!!! 중요!!
		// 상속에 있어서 자녀쪽에 생성자를 찾아갈땐 먼저 부모부터 가도록 해놨음!!

	}// main_end
}// class_end
