package java_30_NetWork.InetAddress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MakeClientSoket {

	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	
	public MakeClientSoket() {
		try {
		socket = new Socket("localhost", 2000);
		writer = new PrintWriter(socket.getOutputStream(), true);
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String str = null;
		BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
		
		while ((str = sReader.readLine())!= null) {
			writer.println(str);
			System.out.println("output : " + str);
		}
		
		writer.close();
		reader.close();
		
		}catch (Exception e) {
		}
	
	}public static void main(String[] args) {
		new MakeServerSocket();
	}
}
