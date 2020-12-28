package Day;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// connect			//ip address	port
		Socket s1 = new Socket("127.0.0.1", 8899);

		DataInputStream dis1 = new DataInputStream(s1.getInputStream());
		System.out.println("네 말대로" + dis1.readUTF());
		dis1.close();
		s1.close();
		System.out.println("전화 끊어짐");
	}
}
