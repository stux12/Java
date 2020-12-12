package Day05;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		
		/* 점수를 입력받아 max 값, 과목 수 , 평균 값 을 출력하는 프로그램 작성
		 단 과목수는 모름 점수입력시 -1이 들어오면 EndOfFile 입력을 끝내라*/
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int hap = 0;
		int max = 0;
		int count = 0;
		
		int sw =0;
		while(sw==0) {
			System.out.print("점수를 입력하세요");
			a = Integer.valueOf(sc.next());
			if(a >= 0) {
				hap += a;
				if(a>max) {
					max = a;
				}
				count++;	
			}
			if(a == -1) {
				sw=1;
				break;
			}
		}
		
		double av = hap/(double)count;
		
		System.out.println("점수 최고점 : " + max);
		System.out.println("과목 수 : " + count);
		System.out.printf("점수 평균 : %.2f", av);
		
		
		
		
		
	}
}
