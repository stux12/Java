package java_23_API.Wrapper;

public class MainClass {

	public static void main(String[] args) {
		
		Integer integer = new Integer(234);
		int i = integer.intValue();
		System.out.println(i);
		
		String str = "12345";
		int j = integer.parseInt(str);
		System.out.println(j+10);
	}
}
