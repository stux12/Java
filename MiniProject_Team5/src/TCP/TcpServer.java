package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class ServerClass {

	ArrayList<ThreadServerClass> threadList = new ArrayList<ThreadServerClass>();

	Socket socket;
	DataOutputStream outputStream;

	public ServerClass(int portno) throws IOException {
		Socket s1 = null;

		ServerSocket ss1 = new ServerSocket(portno);
		System.out.println("서버 가동...");

		while (true) {
			s1 = ss1.accept();
			System.out.println("접속주소 :" + s1.getInetAddress() + " , 접속포트 : " + s1.getPort());
			ThreadServerClass tServer1 = new ThreadServerClass(s1);
			tServer1.start();

			threadList.add(tServer1); // 컬렉션에 add
			System.out.println("접속자 수 : " + threadList.size());
		}
	}

	public void sendChat(String chat) throws IOException {
		for (int i = 0; i < threadList.size(); i++) {
			threadList.get(i).outputStream.writeUTF(chat);
		}
	}

	class ThreadServerClass extends Thread {
		Socket socket1;
		DataOutputStream outputStream;
		DataInputStream inputStream;

		public ThreadServerClass(Socket s1) throws IOException {
			socket1 = s1;
			inputStream = new DataInputStream(s1.getInputStream());
			outputStream = new DataOutputStream(s1.getOutputStream());
		}

		@Override
		public void run() {

			String nickname = "";
			try {
				if (inputStream != null) {

					nickname = inputStream.readUTF();

					sendChat(nickname + " 님 입장~~~~");
					while (inputStream != null) {
						sendChat(inputStream.readUTF());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// 클라이언트가 보낸 채팅 내용을 접속한 모두에게 보냄

				// 나간 쓰레드의 인덱스 찾기
				for (int i = 0; i < threadList.size(); i++) {
					if (socket1.equals(threadList.get(i).socket1)) {
						threadList.remove(i);

						try {
							sendChat(nickname + " 님 퇴장~~");
						} catch (IOException e) {
//						e.printStackTrace();
						}

					}
					System.out.println("접속자 수 : " + threadList.size() + " 명");
				}
			}
		}

	}
}

public class TcpServer {

	public static void main(String[] args) throws NumberFormatException, IOException {

		new ServerClass(9000);

	}

}
