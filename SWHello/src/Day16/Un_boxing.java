package Day16;

public class Un_boxing {

	public static void main(String[] args) {
		
		String a = "30";
		
		int b = Integer.parseInt(a);
		Integer c = Integer.valueOf(a);
		System.out.println(b+c);
		
		System.out.println(Integer.parseInt(a)+Integer.valueOf(a));
		
		//int 는 스택메모리 Integer 은 힙메모리
		// 상식선으로는 서로 값을 바꾸는게 불가능하지만 가능하게 해둠
		int aa = 30;
		Integer bb = aa; // auto boxing
		int cc = bb; // auto unboxing
		
		
		System.out.println(bb+cc);
	}
}
