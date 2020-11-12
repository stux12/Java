package Day07;
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
		
		
		
//		b1.diamond; // error가 잘나오는데??
		System.out.println(b1.diamond);
		b1.move(); // 얜 error가 왜 안나오고 값이 나오지??
		
		
	}
}
