package Day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		int jum;
		int count =0;
		int total =0;
		int max;
		System.out.print("점수 : "); // two-read 중 one-read
		Scanner sc = new Scanner(System.in);
		jum = sc.nextInt();
		max = jum; //1st 점수를 무조건 max로
		
		while(jum != -1) {
			count++ ; // 과목수
			
			total = total + jum; // 평균, 총점/과목수
			if(jum > max) {  // max 구함
				max = jum;
			}
			System.out.println("점수 : "); // two-read 중 two-read
			jum = sc.nextInt();
		}
		
		double avg = (double)total / count;
		System.out.println("점수 최고점 = " + max);
		System.out.println("과목수 = " + count);
		System.out.println("점수 평균 = " + avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
