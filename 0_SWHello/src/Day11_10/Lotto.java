package Day11_10;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		/*
		 * 임의의수 랜덤 수 로또 프로그램 1/45 * 1/44 * 1/43 * 1/42 * 1/41 * 1/40 ... 1/860만
		 */

		int[] num = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = (int) Math.ceil(45 * Math.random());
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		Arrays.sort(num);
		for (int i = 0; i < 6; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();

//		 Math.random() -> 0.00001 ~ 0.99999
//							*45
//						  0.00005 ~ 44.77777
//		 Math.ceil() -> 무조건 소수점 올림 
//		 Math.floor() -> 무조건 소수점 내림

	}

}
