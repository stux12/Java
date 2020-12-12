package Day17;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {

		//txt가 없으면 imsi라는 txt를 만들어줌
				File f1 = new File("d:/imsi.txt");
				if(f1.exists()) { //파일있어? 그런데 결과는 true야 false야
					if(f1.delete()){ //파일을 지우자 그런데 결과는 true야 false야
						System.out.println("임시파일 안녕");
					}
					else {
						System.out.println("에러야 새꺄");
					}
				}
				else {//파일이 없으면
					System.out.println("지울파일없어");
				}
		
		
		
	}//main_end
}//class_end
