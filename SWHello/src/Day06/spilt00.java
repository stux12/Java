package Day06;

public class spilt00 {

	public static void main(String[] args) {
		
		/*
		 듀엣그룹, duetMiso, 얼굴천사 를 문자열 변수에 넣고
		 출력시 한단어를 한줄씩 출력하시오
		 단, split()사용
		 
		 */
		
		String s1 = "듀엣그룹**duetMiso**얼굴천사";
		
		String [] bae = s1.split("\\*\\*");
		
		
		for(int i=0; i<bae.length; i++) {
			System.out.println(bae[i]);
		}
		
		
	}
}
