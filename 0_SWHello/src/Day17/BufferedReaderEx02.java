package Day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException {
		
		//Q) 서로 두파일을 이름은 그대로두고 내용만 swap 하시오
		
		BufferedReader br1 = new BufferedReader(new FileReader("d:/aa.txt"));
		PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter("d:/imsi.txt")));
		
		String s1 = null;
		
		while((s1=br1.readLine())!=null) {
			System.out.println("a->imsi");
			pw1.println(s1);
		}
		br1.close();
		pw1.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader("d:/cc.txt"));
		PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter("d:/aa.txt")));
		
		while((s1=br2.readLine())!=null) {
			System.out.println("c->a");
			pw2.println(s1);
		}
		br2.close();
		pw2.close();
		
		BufferedReader br3 = new BufferedReader(new FileReader("d:/imsi.txt"));
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter("d:/cc.txt")));
		
		while((s1=br3.readLine())!=null) {
			System.out.println("imsi->c");
			pw3.println(s1);
		}
		br3.close();
		pw3.close();
		
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
		
	}
}
