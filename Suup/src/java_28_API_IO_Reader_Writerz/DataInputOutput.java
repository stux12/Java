package java_28_API_IO_Reader_Writerz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutput {

	public static void main(String[] args) {
		
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("경로명");
			dis = new DataInputStream(is);
			String str = dis.readUTF();
			
			os = new FileOutputStream("경로명");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
		}catch (Exception e) {

		}finally {
			
			if(dos != null) {
				try {
					dos.close();
				}catch (Exception e) {

				}
			}
			
			if(os != null) {
				try{
					os.close();
				}catch (Exception e) {
					
				}
			}

			
		}
		
	}
}
