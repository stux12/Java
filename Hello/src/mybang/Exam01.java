package mybang;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		// Q) i해가 윤년이냐?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇년인가요? >");
		int year = Integer.parseInt(sc.next());
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("평년입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
