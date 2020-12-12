package Quiz_joonwoo;

import java.util.Scanner;

class spacebar {
	public void space(){
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요 >");
		String [] s2 = (sc.nextLine()).split("\\ ");
		
		int count = 0;
		for(int i=0; i<s2.length-1; i++) {
			if(s2[i].toLowerCase().equals("print")||s2[i].toLowerCase().equals("test")) {
				count++;
			}// if_end
		}// for_end
		
		if(count > 0) {
		char[] ch = s2[count].toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				System.out.print(Character.toUpperCase(ch[i]));
			}//if_end
			else {
				System.out.print(Character.toLowerCase(ch[i]));
			}//else_end
		}//for_end
		}//if_end
	}//space()_end
}//class_end

public class Quiz01 {

	public static void main(String[] args) {
/*
		1. 스페이스로 구분되는 명령어를 만드시오.(단, 명령어를 인식하고 처리하고 출력하는 모든 기능을 main클래스가 아닌 다른 클래스에서 처리하도록 만드시오)
		2. 명령어 종류(updown) <- 메소드로 기능 구현

		출력예시
		test print sc //사용자 입력부분
		sc //컴퓨터 출력부분

		test print sc
		SC

		test print Sc
		sC*/
	
		spacebar s1 = new spacebar();
		s1.space();
		
	}//main_end


}//class_end
