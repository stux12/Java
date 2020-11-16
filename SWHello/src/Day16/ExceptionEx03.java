package Day16;

import java.util.Scanner;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try{
			Scanner sc1 = new Scanner(System.in);
			
			
			System.out.print("첫번째 수는 : ");
			String one1 = sc1.nextLine();
			//빈칸포함 한줄 다 입력 받는 nextLine
			// ex) i love you 한줄 다읽어짐 !!   next의 경우 i만 입력받음
			
			int soo1 = Integer.valueOf(one1);
			
			System.out.print("두번째 수는 : ");
			String two1 = sc1.nextLine();
			int soo2 = Integer.valueOf(two1);
			System.out.println("나눈값은 : "+soo1/soo2);
		}// try_end
		catch(NumberFormatException e) {
			System.out.println("숫자로 입력하면 안되겠니");
		}
		catch(ArithmeticException e) {
			System.out.println("0이 아닌값으로 입력하라고");
		}
		catch(Exception e) {
			System.out.println("다른 예외 처리");
			System.out.println(e.getMessage());
		}

	}// main_end

}// class_end
