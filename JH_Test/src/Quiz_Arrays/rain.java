package Quiz_Arrays;

public class rain {

	public static void main(String[] args) {
		
		/* Q01 /반을 쪼갈라서 하기 빗줄기배열
		배열을 써서 값을 넣고 출력하는게 아닌 for로 값이 넣어지면서 출력되게끔
		1	2	4	7	11
		3	5	8	12	16
		6	9	13	17	20
		10	14	18	21	23
		15	19	22	24	25
		*/
		
		int[][] soo = new int [5][5];
		int num = 0;
		
		
		for(int dol=0; dol<9; dol++) {
			for(int i=0; i<soo.length; i++) {
				
				int j=dol-i;
				if(j>=0&&j<5) {
					num++;
					soo[i][j] = num;
				}
				
			}
			
		}
		
		
		for(int i=0; i<soo.length; i++) {
			for(int j=0; j<soo[i].length; j++) {
				System.out.print(soo[i][j] + "\t");
			}System.out.println();
		}
		
		
		/*
		 1	3	6	10	15
		 2	5	9	14	19
		 4	8	13	18	22
		 7	12	17	21	24
		 11	16	20	23	25
		 
		 이 문제의 경우 값을 넣을때 i랑j를 변경하면 된다
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
