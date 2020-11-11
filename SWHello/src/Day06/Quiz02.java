package Day06;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		
		/*
		 Q) 문자열 loVE 를 기억창고에 넣은 후 대소문자를 바꾸어 출력하시오
		 (단, 메소드 호출을 사용하시오)
		 
		 
		 */

	
	String moonja = "loVE";
	
	kaja(moonja);
	
	
	
	
	}

	private static void kaja(String moonja) {
		for(int i=0; i<moonja.length(); i++) {
			if(Character.isLowerCase(moonja.charAt(i))) {
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
