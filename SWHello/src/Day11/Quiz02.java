package Day11;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		
		/*
		 Q) 문자열 loVE 를 기억창고에 넣은 후 대소문자를 바꾸어 출력하시오
		 (단, 메소드 호출을 사용하시오)
		 
		 
		 */

	
	String moonja = "loVE";
	
	kaja(moonja);
						// to 보낸다 대문자로 moonja객체를
	System.out.println(moonja.toUpperCase());
						// to 보낸다 소문자로 moonja객체를
	System.out.println(moonja.toLowerCase());
	
	char ch = 'A';
	if(Character.isLowerCase(ch)==true);
	
	}

	private static void kaja(String moonja) {
		for(int i=0; i<moonja.length(); i++) {
						//문자 하나만 가져와서 비교를 할수있음 그렇기때문에 앞에 Character.이 붙은거임
						// 따라서 is를 쓴다 하면 ()안에는 문자하나만 와야하고 is앞에는 Character.을 붙임
			if(Character.isLowerCase(moonja.charAt(i))) {
											//보내는것의 경우 문자하나만도 가능하고
											//전체를 보내는것도 가능하다.
				System.out.println(Character.toUpperCase(moonja.charAt(i)));
			}else {
				System.out.println(Character.toLowerCase(moonja.charAt(i)));
			}
	}

//	private static void kaja(String moonja) {
//		
//		for(int i=0; i<moonja.length(); i++) {
//			if(Character.isLowerCase(moonja.charAt(i))) { // is는 문자를 받아서 lower인지 upper인지 확인하는것
//				System.out.print(Character.toUpperCase(moonja.charAt(i))+"\t"); // to는 문자를 lower 혹은 upper로 바꿔주는것
//			}else {
//				System.out.print(Character.toLowerCase(moonja.charAt(i))+"\t");
//			}
//		}
				
		
	}
}
