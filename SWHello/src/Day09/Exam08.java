package Day09;

public class Exam08 {

	public static void main(String[] args) {

		int [][] num = new int[3][3];
		
		int soo = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				soo++;
				num[i][j] = soo;
				
			}
		}
		
		for(int j=0; j<num.length; j++) {
			for(int i=0; i<num[j].length; i++) {
				System.out.print(num[i][j]);
				
			}System.out.println();
		}
		
	}

}
