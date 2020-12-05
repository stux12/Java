package java_28_API_IO_Reader_Writerz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {

	public static void main(String[] args) {
		
		// 이 방법이 조금더 빠름
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("경로");
			os = new FileOutputStream("경로");
			
			byte[] bs = new byte[5];
			
			while(true) {
				int count = is.read();
				if(count == -1) {
					break;
				}
				os.write(bs, 0, count);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(is != null) {
				try {
					is.close();
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if(os != null) {
				try {
					os.close();
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
}
