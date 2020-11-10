package HSwitchQuiz;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요>");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		System.out.print("연산자를 입력하세요 >");
		String yun = sc.next();
		
		
		
		switch(yun){
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
		}
		
		
		
		
		
		
		
		
	}
	
	
}
