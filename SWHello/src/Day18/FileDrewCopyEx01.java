package Day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDrewCopyEx01 {
											//main()을 호출한 jvm에게 예외를 던짐, JVM이 처리함
	public static void main(String[] args) throws IOException {

		//Q 파일 copy 단 byte단위로 args[]을 사용
		
//		byte imsi??
		int imsi = 0; // 'A' => 문자 상수 (문자 A이면서 동시에 아스키코드 65
		
		//input output Stream 나오면 바이트단위
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		
		if(args.length ==2 ) { //원본 파일명과 사본 파일명 합해서 2개파일
			fis1 = new FileInputStream(args[0]); //open
			fos1 = new FileOutputStream(args[1], false); //open
						//명령행인자 aa.jpg bb.jpg
		}
			//read() 괄호안이 비어있으면 한 바이트 단위로 처리
		while((imsi=fis1.read()) != -1) {
			fos1.write(imsi);//파일에 출력
			System.out.println(imsi+"나 지금 복사중인데~");
		}
		fis1.close(); fos1.close();
		
		
		// run configuration aa.jpg bb.jpg
		
		
		
		
	}//main_end

}//class_end