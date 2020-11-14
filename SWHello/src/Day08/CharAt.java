package Day08;

public class CharAt {

	public static void main(String[] args) {
		
		String s1 = "good";
		
			// ~~로 시작하는지 물어보는것
		if(s1.startsWith("go")) {
			System.out.println("good");
		}// if_end
		
		/*		시작하는게 go니까
		if(s1.startsWith("od")) {
			System.out.println(s1);
		}	
				끝나는게 od니까
		if(s1.endsWith("go")) {
			System.out.println(s1);
		}
		*/
				//~~로 끝나는지 물어보는것
		if(s1.endsWith("ood")) {
			System.out.println(s1);
		}// if_end
		
	}// main_end
}// class_end
