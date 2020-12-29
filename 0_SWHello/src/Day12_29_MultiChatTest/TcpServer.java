package Day12_29_MultiChatTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {

		ServerSocket ss1 = new ServerSocket(8989);
		System.out.println("서버 준비 됨");
		
		while(true) {
			System.out.println("기다리는중.");
			Socket s1 = ss1.accept();
			System.out.println(s1.getInetAddress()+ " 에서 접속");
			
			
		/*	그런데 지금 하려는 것은 파일을 전송하는 socketing
			그림파일 및 음악파일, docx(ms오피스)파일 등은 바이트단위 전송을 해야 제대로 감  */
//			DataInput, DataOutput을 통해 가능함
			
			File file1 = new File("d:/aa.jpg");
			FileInputStream fis1 = new FileInputStream(file1);
			DataInputStream dis1 = new DataInputStream(fis1);
			
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			//즉 jpg를 입력받아 network로 전송
			
			//byte단위로 보내야하니깐
			byte[] byteBae = new byte[(int)file1.length()];
			//파일길이만큼 바이트배열을잡음
			
			System.out.println("file --> byte중..");
			dis1.readFully(byteBae); // 파일내용 --> byte배열로 바꿈
			
			//길이를 먼저 전송, 내용을 전송
			dos1.writeInt(byteBae.length); //파일길이 먼저 전송
			dos1.write(byteBae);//바이트배열 전송
			System.out.println("전송했어요~");
			
		}//while
	}//main

}//class
