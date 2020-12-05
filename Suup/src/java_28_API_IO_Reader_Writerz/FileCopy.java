package java_28_API_IO_Reader_Writerz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		
		// 파일을 읽음과 동시에 쓰기 = copy~
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("경로");
			os = new FileOutputStream("경로");
			
			while(true) {
				int i = is.read();
				if(i == -1) {
					break;
				}
				os.write(i);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
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
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
		}
		
		
		
	}
}
