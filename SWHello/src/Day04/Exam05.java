package Day04;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		do {
			System.out.println("1. 짜장");
			System.out.println("2. 짬뽕");
			System.out.print("선택하세요 >");
			a = Integer.valueOf(sc.next());
	
		} while(a!=1 && a!=2);//(a > 2 || a <= 0); 도 가능
		System.out.println("맛있게드세요");
//		
//		
//		String b;
//		do {
//			System.out.println("1. 짜장");
//			System.out.println("2. 짬뽕");
//			System.out.print("선택하세요 >");
//			b = sc.next();
//		} while(!b.equals("1") && !b.equals("2"));
//		System.out.println("맛있게드세요");
		
		// 집에가서 문장받았을때도 범위로 설정하는 방법 생각해보기
//		String b;
//		int c=0;
//		
//		do {
//			System.out.println("1. 짜장");
//			System.out.println("2. 짬뽕");
//			System.out.print("선택하세요 >");
//			b = sc.next();
//			if(b.equals("1") && b.equals("2")) {
//			c = Integer.valueOf(b.equals(b));
//			}
//		} while(c > 2 || c <= 0);
//		System.out.println("맛있게드세요");
		
		
		
		
		
		
		
		
	}
}
