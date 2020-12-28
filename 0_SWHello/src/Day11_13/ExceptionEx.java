package Day11_13;

import java.util.Scanner;

public class ExceptionEx {

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
		} // try_end

		// 에러가난 내용을 적어주는곳 Exception이라는 에러가 나면 e변수에 저장함.
		catch (Exception e) {
			System.out.println(e);
			System.out.println("에러가 났어요~");
		} // catch_end

		// 에러 유무에 관계없이 무조건 해야함
		finally {
			System.out.println(0 / 0);
			System.out.println("gooooooooooood");
		} // finally_end

	}

}
