package mybang4;

public class Exam09 {

	public static void main(String[] args) {

		int [] k = {90,100}; // 배열의 두수를 맞바꾸시오
		
		 
		// zigzag기법
		int c = k [0]; // c = 임시방
		k[0] = k[1];
		k[1] = c;
		
		System.out.println(k[0]+" "+k[1]);
		
		
		
	}

}
