package Quiz_For;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("두수를 입력하세요 >");
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		
		int hap = 0;
		
		for(int i=num1; i<=num2; i++) {
			hap += i;
		}
		
		System.out.println(hap);
		
		
		
		
		
		
		
		
		
	}

}
