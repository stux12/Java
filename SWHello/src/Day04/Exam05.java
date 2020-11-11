package Day04;

public class Exam05 {

	public static void main(String[] args) {

		int [][] num = new int [3][3];
		
		int a=0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				a++;
				num[i][j] = a;
				System.out.print(num[i][j] + "\t");		
			}System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
