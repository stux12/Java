package Day09;

public class Exam02 {

	public static void main(String[] args) {

		
//		int [] jumsoo1 = {30, 70, 100, 90, 20};
//		int tot71= 0;
//		for (int i = 0; i < jumsoo1.length; i++) {
//			tot71 = tot71 + jumsoo1[i];
//		}
//		System.out.println("총점 = " + tot71 + "평균 = " + tot71/5.0);
		
		
		/*
		 	Q) 100개 수를 메소드 2형식으로 전달하여 구하시오
		 	
		 		kaja(1,4,20,...)
		 		kaja(int i, intj, int...)
		 */
		
		int [] jumsoo3 = {30,70,100,90,20} ;
		
		kaja100(jumsoo3); //배열의 대표명 //그 배열의 시작번지
		System.out.println(jumsoo3[0]); // 아래 메서드에서 배열의 값을 바꿨기 때문에 값이 바껴서 저장됨
		
		
	}

	private static void kaja100(int[] jumsoo555) { //위 jumsoo3의 주소와 같은 주소를 받고 있음
		jumsoo555[0] = 100;
		System.out.println(jumsoo555[0]);
	}

}
