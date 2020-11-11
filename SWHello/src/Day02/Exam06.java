package Day02;

public class Exam06 {

	public static void main(String[] args) {
		
		
		/*STARWARS
		
		*****
		*****
		*****
		
		*/
		
		
		//패턴 : 먼저 변하는것이 행/열 따져야함 (열부터찍힘) 가로 행 세로 열
		//				시작점 / 끝점
		
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=4; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=5; j++) {
//				if(i<=j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println("");
//				
//		}
/*					i		j	5-i=j
					1		4
					2		3
					3		2
					4		1
					5		0
												*/
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		
		
		
		
		}
		
		
		
		
		
	}
}
