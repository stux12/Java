package Day07;

class Boomo2{
	protected int diamond=0;
	protected void move() {
		System.out.println("나 잘움직여");
	}
}

class seo extends Boomo2{
	public void sing() {
		System.out.println("노래 엄청 잘해");
	}
}

class moolgo extends Boomo2{
	public void swim(){
		System.out.println("수영은 내가 잘해");
	}
}




public class Extend02{

	public static void main(String[] args) {
		
		/*
		 animal 부모는 move() 하는 행동이 있다 새는 노래 잘하고 물고기는 수영을 잘한다
		 상속특성을 사용하여 다음과 같이 출력하도록 만드시오
		 나 잘움직여 = 부모
		 나 잘움직여
		 노래엄청잘해 sing() = 새
		 나 잘움직여
		 수영은 내가잘해 swim() = 물고기
		 */
		
		Boomo2 ani = new Boomo2();
		seo bi = new seo();
		moolgo fi  = new moolgo();
		
		ani.move();  
	
		bi.move();
		bi.sing();
		
		fi.move();
		fi.swim();
		
		
		
		
	}// main_end
}// Extend02_end
