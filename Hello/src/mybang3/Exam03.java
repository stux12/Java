package mybang3;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

//		Q 월을 입력받아 해당 월의 날짜수를 출력하는 프로그램을 작성
//			swtich문과 break생략기법사용 
		// 1월 31 2월 28 3월 31 4월30 5월 31 6월 30 7월31 8월31 9월30 10월31 11월30 12월31
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇월인가요 ? >");
		int month = sc.nextInt();
		
		switch(month){
		case 2 : System.out.println("28일입니다."); break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("30일 입니다."); break;
		default : System.out.println("31일 입니다.");
		
		
		}
		
		
	}

}
