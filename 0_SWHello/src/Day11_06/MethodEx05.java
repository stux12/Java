package Day11_06;

import java.util.Scanner;

public class MethodEx05 {

	public static void main(String[] args) {
		// 키몸무게 메인에서 받고 bmi계산과 비만보통계산은 정의문에서 결과출력 메인에서

		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 >");
		int ki = Integer.valueOf(sc.next());
		System.out.print("몸무게를 입력하세요 >");
		int mom = Integer.valueOf(sc.next());

		String bmi = bm(ki, mom);

		System.out.println(bmi);
	}

	private static String bm(int ki, int mom) {

		double ki2 = ki / 100.0;
		double bmi = mom / (ki2 * 2);

		String result;
		if (bmi >= 30) {
			result = "비만";
		} else if (bmi >= 25) {
			result = "과체중";
		} else if (bmi >= 20) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;

	}

}
