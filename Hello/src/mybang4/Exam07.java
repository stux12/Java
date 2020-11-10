package mybang4;

public class Exam07 {

	public static void main(String[] args) {

		int [][] num = new int [3][3];
		
		int soo = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<1; j++) {
				soo++;
				num[i][j] = soo;
				num[i][j+1] = soo+3;
				num[i][j+2] = soo+6;
				System.out.print(num[i][j]);
				System.out.print(num[i][j+1]);
				System.out.print(num[i][j+2]);
				
			}System.out.println();
		}
		
		
	}

}
