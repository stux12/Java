package Day11_06;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {

		kajaYoon();

	}

	private static void kajaYoon() {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇년인가요? >");
		int year = Integer.parseInt(sc.next());
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("평년입니다");
		}

	}
}
