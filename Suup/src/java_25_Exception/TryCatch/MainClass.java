package java_25_Exception.TryCatch;

public class MainClass {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		System.out.println(i * j);
		try {
			System.out.println(i / j);
		} catch (ArrayIndexOutOfBoundsException e) { // 배열을 사용시 존재하지 않는 index값을 호출하면 발생
			e.printStackTrace();
		} catch (NullPointerException e) { // 존재하지 않는 객체를 가르킬 때 발생
			e.printStackTrace();
		} catch (NumberFormatException e) { // 문자를 숫자로 처리할때 발생
			e.printStackTrace();
		} catch (Exception e) { // 모든 에러
			System.out.println(e.getMessage());
		}
		System.out.println(i - j);
		System.out.println(i + j);

		int[] iArr = { 1, 2, 3 };

		try {
			System.out.println("***************");
			System.out.println(iArr[3]);
			System.out.println("===============");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("무조건 실행 합니다.");
		}

	}
}
