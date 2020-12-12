package Day13;

public class Change2 {

	
	public static void main(String[] args) {
		
		
		
		/*
		 문자열을 입력받아 첫번째, 3번째... 글자를 바꾸어 출력하시오
		단 메소드 2형식 사용
		예) ondal -> oadnl
		단, String과 char[] 사용
		mpwf = love
		 */
		
		change(args);
		
	}// main_end

	private static void change(String[] args) {
							// 문자를 하나씩 잘라서 char배열에 들어감
		//configuration에서 입력한 값의 개수가 2개라서 i<2
		for(int i=0; i<args.length; i++) {
			char[] ch = args[i].toCharArray();
		
		// 1번째방과 3번째방 값 바꾸는것!!
		char imsi = ch[1];
		ch[1] = ch[3];
		ch[3] = imsi;
		
		// ch[]안 내용을 순서대로 출력하기 위해 사용
		for(int j=0; j<args[i].length(); j++) {
			System.out.print(ch[j]+"\t");
		}// for_end
		System.out.println();
					// new String을 무조건 써야하며 다시붙일 char[]인 ch를 써야함!!
		String str2 = new String(ch); // char[] -> String으로 만드는것
		System.out.println(str2); // for문을 돌릴필요없이 이방법으로 출력가능
		
	}// for_end
	}// main_end
}// class_end
