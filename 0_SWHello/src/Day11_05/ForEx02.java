package Day11_05;

public class ForEx02 {

	public static void main(String[] args) {

		/*
		 * Q 학년 - 반 1-1 1-2 2-1 2-2 3-1 3-2
		 */

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.println(i + "학년" + j + "반");
			}
		}

		// 먼저 바뀌는게 안쪽이라고 생각하면 됨

	}
}
