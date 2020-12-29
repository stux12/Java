package Day12_29_MultiChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpMulClient {

	public static void main(String[] args) {

		if(args.length != 3) {
			System.out.println("사용법 : 클라이언트 실행은 java 패키지명.파일명 ip주소 포트번호 닉네임 형식으로 입력");
			System.exit(1);
		}
		
		try {
			Socket s1 = new Socket(args[0], Integer.parseInt(args[1]));
			System.out.println("서버 연결....");
			
						
			//gui로 하기위해 아래내용을 준비함
			DataOutputStream outputStream = new DataOutputStream(s1.getOutputStream());
			DataInputStream inputStream = new DataInputStream(s1.getInputStream());
			outputStream.writeUTF("##"+args[2]); // 닉네임
			
			//gui .java쪽으로 필요한 내용을 인자로 보내야함
			new KajaClientGUI(outputStream, inputStream, args[2]) {
				public void closeWork() throws IOException{
					outputStream.close();
					inputStream.close();
					System.exit(0);
			}
			};
			
		} catch (NumberFormatException | IOException e) {
//			e.printStackTrace();
		}
		
		
	}

}
