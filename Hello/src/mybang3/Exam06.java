package mybang3;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
/*		
		Q 메소드 2형식을 사용하여 윤년인지 알아내시오
			이때 윤년 알아내기하는 비서에게 교통비 10000원도 전달하시오
				단, 이때 인자는 2개 사용, 년도입력은 main에서 함
		
		ex)
			차비 10000원 받았음
			2020년은 윤년
*/		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 > ");
		int i = Integer.parseInt(sc.next());
		yun(i,10000); //메소드 호출문 - 2형식 // 인자,인수  //왜 에러일까요??
		
		
	}
							//매개변수, parameter = 
	private static void yun(int i,int chabi) {       // 이때 위 int i 랑 아래 int i 랑 아애 다르게 저장
		
		if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("평년입니다");
		}
		System.out.println(chabi+"원 받았습니다.");
		
	}

	
		
		
		
		

		
	}

