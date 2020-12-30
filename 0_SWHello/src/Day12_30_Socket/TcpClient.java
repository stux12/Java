package Day12_30_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class TcpClient {

	DataInputStream inputStream;
	DataOutputStream outputStream;
	Socket s1;

	public TcpClient() {
		ServerConnect();
		ServerData();
		dataOut("안녕하세요 클라이언트입니다");
		System.out.println(dataIn());
		
		
		

	}

	public void ServerConnect() {
		try {
			s1 = new Socket("127.0.0.1", 8899);
		} catch (IOException e) {
		}
	}

	public void ServerData() {
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

	public static void main(String[] args) {
		new TcpClient();
	}

}
