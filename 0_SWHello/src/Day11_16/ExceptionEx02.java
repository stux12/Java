package Day11_16;

import java.util.Scanner;

public class ExceptionEx02 {

	public static void main(String[] args) {

		// 첫번째수 30 두번째수 20 = 1
		// 첫번째수 0 두번째수 0 = error => 산술연산 에러 JVM이 체크해서 알려줌
		/*
		 * 개발자가 에러체크를 하는 방법!!!! try {이부분에서 에러날지도 몰라라는 내용을 적기} catch {에러가난 내용을 적어주는곳}
		 * finally {에러 유무에 관계없이 무조건 해야함}
		 */

		// 이부분에서 에러날지도 몰라라는 내용을 적기
		try {
			Scanner sc1 = new Scanner(System.in);

			System.out.print("첫번째 수는 : ");
			String one1 = sc1.nextLine();
			// 빈칸포함 한줄 다 입력 받는 nextLine
			// ex) i love you 한줄 다읽어짐 !! next의 경우 i만 입력받음

			int soo1 = Integer.valueOf(one1);

			System.out.print("두번째 수는 : ");
			String two1 = sc1.nextLine();
			int soo2 = Integer.valueOf(two1);
			System.out.println("나눈값은 : " + soo1 / soo2);

			// bada에 메소드를 넣은형태
			int bada = kaja(soo1, soo2);
			System.out.println(bada);
		} // try_end

		// 에러가난 내용을 적어주는곳 Exception이라는 에러가 나면 e변수에 저장함.
		catch (Exception e) {
			System.out.println("에러가 났어요~");
			System.out.println("0이 아닌 두개의 정수를 입력하세요");
			System.out.println(e);// 객체가 쓰이면 .toString()생략

			// 에러난 메세지를 출력!!
			System.out.println(e.getMessage()); // by zero
			// oracle 에러시 ora-10976
			// Java 에러시 message에 들어감
		} // catch_end

		// 에러 유무에 관계없이 무조건 해야함
		finally {
			System.out.println("gooooooooooood");
			// 에러시 해당하는것을 계속 사용하면 안되기 때문에 닫아줄때 사용
			// DB접속 close 시킬경우에 사용
			// 파일접속 close시킬경우에 사용
		} // finally_end

	}// main_end

	// int 변수안에 저장하는것이기 때문에 무조건 리턴해야함!! 리턴형태는 저장하는 변수의 형태
	// == try {} catch ( ArithmeticException e)
	private static int kaja(int soo1, int soo2) throws ArithmeticException {

		/*
		 * if(soo2 == 0) { System.out.println("0으로 나눌 수 없다고 전해라~~"); throw new
		 * ArithmeticException(); // soo2==0일시 에러를 발생시켜라 }else { return soo1/soo2; }//
		 * else_end
		 */
		return soo1 / soo2;
	}// kaja()_end
}// class_end
