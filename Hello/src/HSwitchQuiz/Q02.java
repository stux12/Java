package HSwitchQuiz;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sy=0;
		int sw=0;
		while(sw==0) {
		System.out.println("가위바위보게임~!!");
		System.out.println("1.시작");
		System.out.println("0.게임종료");
		int num = Integer.parseInt(sc.next());

		
		switch(num) {
		case 1 : 
			System.out.println("1.가위");
			System.out.println("2.바위");
			System.out.println("3.보");
			System.out.println("진환의 선택");
			int jh = Integer.parseInt(sc.next());
			switch(jh) {
			case 1:
				System.out.println("수연의 선택");
				sy = Integer.parseInt(sc.next());
				if(jh==sy) {
					System.out.println("무승부");
				}
				else if(sy==2) {
					System.out.println("진환 패");
					System.out.println("수연 승");
				}
				else if(sy==3) {
					System.out.println("수연 패");
					System.out.println("진환 승");
				}
				break;
			case 2:
				System.out.println("수연의 선택");
				sy = Integer.parseInt(sc.next());
				if(jh==sy) {
					System.out.println("무승부");
				}
				else if(sy==1) {
					System.out.println("수연 패");
					System.out.println("진환 승");
				}
				else if(sy==3) {
					System.out.println("진환 패");
					System.out.println("수연 승");
				}
				break;
			case 3:
				System.out.println("수연의 선택");
				sy = Integer.parseInt(sc.next());
				if(jh==sy) {
					System.out.println("무승부");
				}
				else if(sy==1) {
					System.out.println("진환 패");
					System.out.println("수연 승");
				}
				else if(sy==2) {
					System.out.println("수연 패");
					System.out.println("진환 승");
				}
				break;
			default:
				System.out.println("다시선택하세요");
			}
			break;
		case 0 :
			sw=1;
			break;
		default :
			System.out.println("다시선택하세요~");
		}
		
		
		
		}
		
		
		
	}

}
