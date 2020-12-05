package java_23_API.Scanner;

import java.util.Scanner;

public class MainClass{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next(); // AAA란 값을넣고 \n값이 남아있음
		System.out.println(str1);
		
		String str2 = scanner.nextLine();// \n을만나면 끝냄
		System.out.println(str2);
		
		System.out.println("End");
	}

}
