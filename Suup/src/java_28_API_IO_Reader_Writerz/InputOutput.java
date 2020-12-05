package java_28_API_IO_Reader_Writerz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutput {

	public static void main(String[] args) {
		OutputStream os = null; // {}밖에서 쓰기위해 전역함수 처리해줌

		// 1byte 단위
//		I/O를 하면서 반듯이 해야 하는 예외처리가 있다. IOException
//		I/O작업 마지막은 close()로 외부연결을 끝내야합니다.
//		InputStream
		try {
			InputStream is = new FileInputStream("경로");
			while (true) {
				int i = is.read(); // read할 값이 없으면 -1반환
				System.out.println("데이터 : " + i);
				if (i == -1)
					break;

			}

		} catch (Exception i) {
			System.out.println(i.getMessage());
		}

//		OutputStream
		try {
			os = new FileOutputStream("경로"); // 경로에 파일이 있으면 그걸쓰고 없으면 새로만듬
			String str = "오늘 날씨는 아주 좋습니다.";
			byte[] bs = str.getBytes(); // 문자열의 문자 하나하나를 바이트단위로 바꿔서 바이트배열에 담음
			os.write(bs); // 바이트 배열을 파일에 쓴다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}
}
