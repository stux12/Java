package Day11_05;

import java.util.Scanner;

public class SwGibub {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sw = 0;
		int ex;
		while (sw == 0) {
			System.out.print("숫자를 입력하세요");
			ex = sc.nextInt();
			if (ex == 1) {
				break; // sw = ex; 도 됨
			}
		}

	}
}
