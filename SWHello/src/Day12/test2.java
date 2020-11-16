package Day12;
class Boomo4{
	protected int diamond;
	protected void move() { //이거는 상속을 안해도 바로 가능해요?????????
		System.out.println("오늘 복습 다했다");
	}
}

class child extends Boomo4{
	
//		int diamond = 3;
	public int babo() {
		return diamond = 3;
	}
	
}


public class test2 {

	public static void main(String[] args) {
		Boomo4 b1 = new Boomo4();
		child c1 = new child();
		
		System.out.println(c1.babo());
		
		
		
//		b1.diamond; // error이유는 아무것도 하지 않았기 때문에
		System.out.println(b1.diamond); //
		b1.move(); // 나오는 이유 : 부모4라는 객체를 직접 만들었기 때문에 부모는 자기의 메소드를 사용가능하다.
		
		
	}
}
