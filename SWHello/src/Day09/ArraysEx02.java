package Day09;

public class ArraysEx02 {

	public static void main(String[] args) {
		/*
		1	4	7
		2	5	8
		3	6	9
		*/
		
		int [][] num = new int [3][3];
		
		int soo = 0;
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<1; j++) {
				soo++;
				num [i][j] = soo;
				System.out.print(num[i][j]);
			}
			for(int j=1; j<2; j++) {
				num[i][j] = soo+3;
				System.out.print(num[i][j]);
			}
			for(int j=2; j<3; j++) {
				num[i][j] = soo+6;
				System.out.print(num[i][j]);
			}
			System.out.println();
		}

	}

}
