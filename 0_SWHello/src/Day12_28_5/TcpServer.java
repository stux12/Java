package Day12_28_5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class ThreadSend extends Thread { // 주는쪽

	Socket s1; // from Client
	DataOutputStream dos1; // out -> "방가방가"를 보낼것이므로
	// 기본 데이터 타입별로 처리하기 예) writeInt, writeUTF(문자열처리)
	String what1; // 채팅시 맨앞에 나올 문자열

	public ThreadSend(Socket s1) throws IOException {
		this.s1 = s1;// s1받아서 s1필드에 넣기
		dos1 = new DataOutputStream(s1.getOutputStream()); // send를 위한 i/o스트림
		what1 = "미팅중 ==>";
	}

	@Override
	public void run() {
		Scanner sc1 = new Scanner(System.in); // 화면입력받아
		while (dos1 != null) { // chat 있으면
			try {
				dos1.writeUTF(what1 + sc1.nextLine());
				// io 스트림을 통해 상대에게 chat 보내기
			} catch (IOException e) {
			}
		}
	}
}

class ThreadRcv extends Thread { // 받는쪽

	Socket s1;
	DataInputStream dis1;

	public ThreadRcv(Socket s1) throws IOException {
		this.s1 = s1;
		dis1 = new DataInputStream(s1.getInputStream()); // read
	}

	@Override
	public void run() {
		while (dis1 != null) {
			try {
				System.out.println(dis1.readUTF());
			} catch (IOException e) {
			}
		}
	}
}

public class TcpServer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		if (args.length != 1) {
			System.out.println("사용법은 java 파일명 포트번호");
			System.exit(1); // 비정상종료?
		}
		ServerSocket ss1 = new ServerSocket(Integer.parseInt(args[0]));
		System.out.println("서버 준비 중1");
		while (true) {
			System.out.println("미팅 대화 기다리는 중");
			Socket s1 = ss1.accept(); // connect를 받자

			// 아래는 원래 receive / send 가 오는자리
			// 여기에 thread를 사용
			ThreadSend tsendSer1 = new ThreadSend(s1);// 초기치 주는곳
			ThreadRcv trcvSer1 = new ThreadRcv(s1);// 받는곳
			tsendSer1.start();
			trcvSer1.start();

		}

	}
}
