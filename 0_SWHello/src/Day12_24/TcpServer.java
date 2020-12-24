package Day12_24;

import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {

		// ip와 port번호가 있어야함 //port no.(21, 80) 1024까진 안쓰는게좋음
		ServerSocket ss1 = new ServerSocket(7780);
		System.out.println("전화는 준비되어 있음");

		while (true) {
			System.out.println("전화기다리는중...");
			// 클라이언트에서 사용하는 소켓
			Socket s1 = ss1.accept(); // 받는것도 accept
			//
			System.out.println(s1.getInetAddress() + "에서 전화왔네.");

			// file 문법 = 네트워킹문법						//network stream
			DataOutputStream dos1 = new DataOutputStream(s1.getOutputStream());
			dos1.writeUTF("야~ 오랜만이네");
			
			// 종료
			dos1.close();
			s1.close();
			
			// output하면 byte단위로 처리됨 byte단위로 처리하기 때문에 글,그림,동영상등 다 처리가 가능함
		}

	}

}
