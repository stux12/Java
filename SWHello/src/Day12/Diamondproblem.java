package Day12;


// 대충그린 설계도
interface car{
	
}
interface car2{
	
}

							//extends와 동일한의미 interface를 불러올때 사용 extends는 class 하나만 불러올수 있지만 implements는 interface를 여러개 가져올 수 있음
public class Diamondproblem implements car, car2 {

	
	public static void main(String[] args) {
		
		
		
		/*
		 다중 상속 - 여러군데서 상속받는것 (불가능) ※ diamond problem
			interface 역할
			class 	: 완벽한 설계도
			interface : 대충그린 설계도
				(1) 다중상속해결 (implements)
				(2) 함수의 원형
				(3) 협업 (메소드는 선언만, 상부구조)
		 */
		
		
		
	}
}
