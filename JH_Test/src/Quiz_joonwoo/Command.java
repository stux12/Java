package Quiz_joonwoo;

import java.util.Scanner;

class Test {
    Scanner sc = new Scanner(System.in);

    public void Help() {
        System.out.println("test print 변경할값 순으로 넣으세요!!");
    }

    public String Scan() {
    	//Help메소드를 출력
        Help();
    	//명령 전체를 입력받는 메소드
    	System.out.println("입력하세요!!>");
        //test print SC나 test print sc가 들어올곳
        String result = sc.nextLine();
        
        Divide(result);
        
        //입력부분
        return result;
    }

    public String[] Divide(String INPUT) {
        //Scan()에서 받은 String을 자바 내장클래스에 존재하는 메소드로 쪼개는 메소드
        String[] result = INPUT.split("\\ ");

        commandA(result[0]); //수정필요
        commandB(result[1]); //수정필요
        System.out.println(updown(result[2]));
        return result;
    }
    public boolean commandA(String INPUT) {
        //첫번째로 입력된 string이 문자열 배열에 포함되는 string인지 검사하는 메소드
        boolean result = false;
        String[] commandA_G = {"test"};

        //if문으로 입력한 문자열이 commandA_G에 존재할경우 true값을 return
        if(commandA_G.equals(INPUT)) {
        	result = true;
        }
        return result; 
    }

    public boolean commandB(String INPUT) {
        //두번째로 입력된 string이 문자열 배열에 포함되는 string인지 검사하는 메소드
        boolean result = false;
        String[] commandB_G = {"print"};

        //if문으로 입력한 문자열이 commandB_G에 존재할경우 true값을 return 
        if(commandB_G.equals(INPUT)){
        	result = true;
        }
        return result; 
    }

    public String updown(String INPUT) {
        //소문자는 대문자로, 대문자는 소문자로 바꾸는 메소드
        String result = null;
        char[] ch = INPUT.toCharArray();
        for(int i=0; i<ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				ch[i] = (Character.toUpperCase(ch[i]));
			}
			else {
				ch[i] = (Character.toLowerCase(ch[i]));
			}
		result = new String(ch);
    }
        return result;
}
}
public class Command {
    public static void main(String[] args) {
        Test ts = new Test();
        ts.Scan();
      
    }
}