package mybang;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		//Q 키 몸무게를 입력받고 비만도를 나타내세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 >");
		int ke = Integer.valueOf(sc.next());
		System.out.print("몸무게를 입력하세요 >");
		int mommu = Integer.valueOf(sc.next());
		
		double ke2 = ke / 100.0;
		double bmi = mommu / (ke2*2); // 같은식임 double bmi = mommu / Math.pow(mki, 2);
		String result;
		
		if(bmi >= 30) {
			result = "비만";
		}else if(bmi >= 25) {
			result = "과체중";
		}else if(bmi >= 20) {
			result = "정상";
		}else {
			result = "저체중";
		}
		
		System.out.println(result);
		
		

		
		
		
		
	}
}
