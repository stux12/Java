package HomeWork_Apple;

import java.util.Scanner;

public class AppleGame {

	public static void main(String[] args) {
		
		/* apple로 하기
		 ___
		 예상글자 입력:
		 a
		 a___ 1번시도 for문 a+1
		 예상글자 입력: for문에 돌려야되미
		 b
		 a___ 2번시도
		 예상글자 입력:
		 p
		 app__ 3번시도
		 예상글자 입력:
		 l
		 appl_ 4번시도
		 예상글자 입력:
		 e
		 apple 5번시도
		 참잘했어요
		 
		 만약 13번이상 시도시 다음기회에
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String [] moonje = {"a","p","p","l","e"};
		String [] mitjul = {"_","_","_","_","_"};
		
		String test; // 예상글자 입력받는곳
		int count=0; //몇번시도?
		int count2=0; //정답횟수
		int sw=0; //while문 빠져나오기 위한 스위치
		
		
			// 계속 돌리기 위해서 무한루프
			while(sw==0) {
				for(int i=0; i<5; i++) { // 처음 문자들 계속 출력하게끔 한것
					System.out.print(mitjul[i]);
				}//for-end
				if(count2 == 5) { // 정답일시 종료하는 곳
					System.out.println(" 축하합니다~~");
					System.out.println(count+"번째 만에 맞추셨어요!!");
					sw=1;
				}//if-end
				else { // 값을 넣는곳
					System.out.println(" "+count+"번째 시도");
					System.out.println("예상글자 입력>");
					test = sc.next();
					count++;
					for(int i=0; i<5; i++) {
						if(test.equals(moonje[i])) {
							if(!test.equals(mitjul[i])) {
								mitjul[i]=moonje[i];
								count2++;
							}//if-end
					}//for-end
					
					}//if-end
				}//else-end
				
				if(count == 13) { // 기회실패시 종료하는 곳
					System.out.println("다음기회에");
					sw=1;
				}
			}//while-end
			
			
		
		
		
		
		
		
		
		
	}
}
