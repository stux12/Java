package Day11_17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextViewerEx01 {
	// 파일은 예외처리를 무조건 해줘야함!!
	public static void main(String[] args) throws IOException {

		/*
		 * file = 입출력 스타일은 기준점이 파일임!!!! stream : byte stream / 문자 stream intput output
		 * stream 파일을 끄집어내는 파일에 집어넣는다 class안에 intput output 이 들어가있으면 대부분 byte stream
		 * class안엔 intput output 이 없을시에는 대부분 문자 stream || reader, writer이 보이면 문자 stream
		 * 
		 * file을 처리하는 로직(text viewer의 경우) open (owner) - open은 내가 쓸경우 소유권을 가짐 다른사람 접근X
		 * 
		 * read (write) 화면출력
		 * 
		 * close (free)
		 * 
		 */

		/*
		 * file을 처리하는 로직(text viewer의 경우) open (owner) - open은 내가 쓸경우 소유권을 가짐 다른사람 접근X
		 * 
		 * read (write) 화면출력
		 * 
		 * close (free) - close로 소유권을 풀어줌
		 */
		// 파일을 찾아감
		FileReader fr = new FileReader("d:\\aa.txt");// => open
		// 참고적으로 input, output, stream이 보이면 바이트 stream
		// reader, writer이 보이면 문자 stream

		//
		BufferedReader br = new BufferedReader(fr);// => open을 도움
		// 임시 방에 버퍼링 한 후 한줄처리 해보자

		// read는 파일에서 읽어서 to 기억창고 (변수)
		// write는 키보드등으로 입력하여 to 파일에

		String s = null;
		// file read - 화면 출력 (write)
		// byte인 경우엔 readInt
		while ((s = br.readLine()) != null) { // 한줄의 끝 = null
			// 한글자씩의 끝 eof(end of file) or -1
			System.out.println(s);
		}
		// 생성한 순의 반대로 닫아줘야함
		br.close(); // 사용하고 해당것을 더이상 사용하지 않을때
		fr.close(); // 메모리 낭비를 최소화 함!!

	}// main_end

}// class_end
