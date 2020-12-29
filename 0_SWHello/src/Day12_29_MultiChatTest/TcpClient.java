package Day12_29_MultiChatTest;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) throws IOException {
		Socket s1 = new Socket("127.0.0.1", 8989);
		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
		
		// file 길이, 내용받아 byte배열로
		int len1 = dis1.readInt(); // 서버가 보낸 파일 길이 받아옴
		byte[] byteBae2 = new byte[len1];
		dis1.readFully(byteBae2); // 내용을 byte배열로 바꿈
		
		//byte 배열 -> file로 저장
		FileOutputStream fos1 = new FileOutputStream("d:/bb.jpg");
		fos1.write(byteBae2);
		System.out.println("끝");
		
	}

}



/*
	선택하여 작성하시오
	
-	클라이언트에 ip, port 입력란을 UI로 구성하시오
	또한 접속자 이름도 화면에 출력하시오 할만함
	
-	귓속말을 작성하시오
-	hint)
	if(msg.startsWith("/")){
	if(msg.charAt(1)=='w')
			split작업
	w1[0]	w1[1]	w1[2] - 컬렉션에서 w1[1]을 찾아 해당 사람에게만 전송
	
-	그림파일도 전송하시오 할만함

-	DB에 접속한 사람을 저장하시오 (일별로 저장) 누가 들어왔따 몇시 언제
*/

