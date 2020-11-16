package Day09;

public class Exam03 {

	public static void main(String[] args) {
	
		/*
		 	Q 5개 수를 배열을 사용하여 전달한후 배열 역순으로 출력하시오
		 */
		
			int[] soo = {1,2,3,4,5};
			
			kaja(soo);
		
		

	}

	private static void kaja(int[] soo) {

		for(int i=soo.length-1; i>=0; i--) {
			System.out.print(soo[i] + "\t");
		}
		// c# kaja(ref int aa, ref int bb)  ==> 키만주는게아닌 물건단위로 묶어서 키를줄수있음
		
	}

}
