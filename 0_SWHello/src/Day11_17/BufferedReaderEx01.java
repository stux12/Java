package Day11_17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BufferedReaderEx01 {

	public static void main(String[] args) throws IOException {

		// input ouput 들어가면 byte단위임!!!
		// reader writer 들어가면 문자단위임!!

		// bufferedreader 를 이용해서 키보드에서 값 입력받기
//		InputStreamReader isr1 = new InputStreamReader(System.in);
//		BufferedReader br1 = new BufferedReader(isr1);

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		// 출력을 위해 //append X //append O
		// false붙은이유 : 기존의것들을 싹다날리고 추가 //ture : 기존의것 남기고 추가
//		FileWriter fr1 = new FileWriter("d:\\aa.txt", false); // 파일을 오픈, 파일을 수록하려고 그냥 열면 기존의것 싹다날라감
//		BufferedWriter bw = new BufferedWriter(fr1);
//		PrintWriter pw = new PrintWriter(bw); // 출력을 아주 편리하고 부드럽게 함 파일인데 줄바꿈가능

//		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("d:\\aa.txt", false)));
//		
//		System.out.println("저장할 데이터를 입력해주세요 (입력끝은 Ctrl+z+enter)");
//		String s = null;
//		while((s = br1.readLine()) != null) { //from keyinput
//			pw.println(s);  // file aa.txt에 수록
//		}
//		pw.flush(); // ??????????
//		br1.close();
//		pw.close();
		// 왜 위에를 주석을 해야지만 카피가 되나요??? 풀어야함

		// 메모장 내용 copy
		BufferedReader br2 = new BufferedReader(new FileReader("d:/aa.txt"));

		PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter("d:/cc.txt")));

		String s2 = null;
		while ((s2 = br2.readLine()) != null) {
			System.out.println("나 복사중");
			pw2.println(s2);
		}
		br2.close();
		pw2.close();

	}

}
