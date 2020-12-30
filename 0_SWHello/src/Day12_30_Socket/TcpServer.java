package Day12_30_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//클래스
class MainServer{

	ServerSocket ss1;
	DataInputStream inputStream;
	DataOutputStream outputStream;
	Socket s1;
	
	public MainServer() {
		
		ServerConnect();
		ServerData();
		System.out.println(dataIn());
		dataOut("안녕하세요 서버입니다");
		
	}
	
	//서버 열었따
	public void ServerConnect() {
		System.out.println("서버 준비중");
		try {
			ss1 = new ServerSocket(8899);
			s1 = ss1.accept();
			System.out.println("서버 연결됨");
		} catch (IOException e) {
		}
		// 서버 준비중
	}
	
	// 데이터를 주고받는 걸 정의
	public void ServerData()  {
		try {
			inputStream = new DataInputStream(s1.getInputStream());
			outputStream = new DataOutputStream(s1.getOutputStream());
		} catch (IOException e) {
		}
	}
	
	
	public String dataIn() {
		
		try {
			return inputStream.readUTF();
		} catch (IOException e) {
		}
		return null;
	}
	
	public void dataOut(String dataout) {
		try {
			outputStream.writeUTF(dataout);
		} catch (IOException e) {
		}
	}

	
	
}





public class TcpServer {

	public static void main(String[] args) {
		
		new MainServer();

		
	}
}
