package java_24_API.StringTokenizer;

import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {

		// 문자열 나누는데 짱
		
		String str1 = "오늘 날씨는 춥고, 눈이 많이 오고 있습니다.";
		String str2 = "2014/12/25";
		System.out.println(str1);
		System.out.println(str2);
		
		StringTokenizer tokenizer1 = new StringTokenizer(str1); // 뛰어쓰기 기준으로 나눔
		StringTokenizer tokenizer2 = new StringTokenizer(str2, "/"); // /기준으로 나눔
		
		System.out.println("tokenizer1 문자열 수 : " + tokenizer1.countTokens());
		System.out.println("tokenizer2 문자열 수 : " + tokenizer2.countTokens());
		
		while(tokenizer1.hasMoreTokens()) { //다음 토큰이 있는지?? 있으면 true
			System.out.println(tokenizer1.nextToken()); // 문자를 찍어라
		}
		
		while(tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
		
		
	}

}
