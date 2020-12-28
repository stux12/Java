package Day11_09;

public class ArrayEx05 {

	public static void main(String[] args) {

		int[][] soo = { { 10, 20, 30 }, { 40, 50, 60, 70, 80 }, { 90, 100, 110, 120 } };

//		System.out.println(soo.length); // ==> 세로줄 길이라고 보면 됨
//		System.out.println(soo[1].length); // ==> 세로줄 첫번째에 해당하는 가로줄 길이라고 보면 됨

		for (int i = 0; i < soo.length; i++) {
			for (int j = 0; j < soo[i].length; j++) {
				System.out.print(soo[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
