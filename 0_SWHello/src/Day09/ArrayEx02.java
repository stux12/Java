package Day09;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*
		 * 
		 * Q) 한학생의 국어 영어 수학 사회 과학 5과목점수를 각각
		 * 		변수에 넣은 후 총점 및 평균을 구하는 프로그램을 작성하시오
		 * 	단, 점수는 키보드 입력없이 초기치로 넣으시오 배열은 사용X
		 * 
		 * 
		 */
		
		
//		int kor = 100;
//		int eng = 96;
//		int mat = 66;
//		int sah = 88;
//		int sic = 35; 
//		
//		int hap = kor + eng + mat + sah + sic;
//		double avg = hap / 5.0;
//		
//		위의 방법을 똑같이 배열을 사용해 아래로 바꿈
		
//		int [] jum;
//		jum = new int[5];
//		
//		jum[0] = 100;
//		jum[1] = 96;
//		jum[2] = 66;
//		jum[3] = 88;
//		jum[4] = 35;
//		
//		int hap2 = 0;
//		for(int i=0; i<5; i++) {
//			hap2 += jum[i];
//		}
//		
//		System.out.println(hap2 + " " + hap2/5.0);
//		
//		 초기치를 일일이 선언 하는게 아닌 하나씩 입력받아 넣으려면
		
		
		int [] jum2 = {100,45,78,90,56};  // 초기치 바로넣는방법
		for(int i=0; i<5; i++) {
			System.out.print(jum2[i]+"\t");
		}
		System.out.println();
		
	}

}
