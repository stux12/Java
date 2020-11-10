package mybang3;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		/*
		메소드 3형식을 사용하요 윤년인지 알아내시오
			단, 년도입력은 main() 에서 윤년 평년계산은 정의문에서
				윤년 평년 출력은 main에서 하시오
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 >");
		int i = Integer.valueOf(sc.next());
//		String bada = yun(i);
//		System.out.println(i+"년은 "+bada+"이다");
		System.out.println(yun(i));
		
	}
					// 반환형 (return type)
	private static String yun(int i) {
		if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
			return "윤년";
		}
		else {
			return "평년";
		}
	}
}
