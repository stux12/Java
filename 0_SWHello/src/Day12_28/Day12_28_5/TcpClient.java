package Day12_28.Day12_28_5;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//writeInt() readDouble()
// 4byte		8byte

//package 안에 총 4개의 클래스가 만들어진다.
/*
 * TcpClient.class
 * TcpServer.class
 * ThreadRcv.class
 * ThreadSend.class
 */

public class TcpClient {

	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {

		if (args.length != 2) {
			System.out.println("사용법은 java 파일명 ip주소 포트번호 입니당");
			System.exit(1);
		}

		Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
		// ip address port no.

		// recv, send ==> server에 만들었으니 그걸 쓰면됨
		ThreadSend tsendcli1 = new ThreadSend(s1);
		ThreadRcv trcvcli1 = new ThreadRcv(s1);
		tsendcli1.start();
		trcvcli1.start();

	}
}
