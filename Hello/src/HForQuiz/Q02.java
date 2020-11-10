package HForQuiz;

public class Q02 {

	public static void main(String[] args) {

		int num=0; // 홀수
		int num2=0; // 짝수
		for(int i=0; i<100; i++) {
			if((i+1)%2==0) {
				num+=i+1;
			}else {
				num2+=i+1;
			}
		}
		System.out.println("짝수합 : " + num);
		System.out.println("홀수합 : " + num2);
		
		
		
		
		
		
		
		
		
		
	}

}
