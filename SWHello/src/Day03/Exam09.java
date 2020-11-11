package Day03;

public class Exam09 {

	public static void main(String[] args) {
		
		//오버로딩 인자의타입이 달라야 or 인자의 갯수가 달라야
		int aa=100;
		double bb=23.5;
		int x=200;
		double y=300.7;
		kaja();
		kaja(aa); // 인자의개수가 다르다. 타입이 다르다고 하기에는 kaja()가 애매함
//		kaja(x); // 오버로딩은 아니고 aa로 찾아감
//		kaja(bb); // 오버로딩 됨 인자의 타입이 다름
		
		
//		private static int kaja(int i, int j) {
//			return 100;
//		}
//		private static String kaja(int i, int j) {
//			return "뭐야뭐야";
//		} ==> 오버로딩이 된것이 아님 애초에 찾아올때부터 못찾아옴
	

	}

	private static void kaja(int aa, int bb) {

		
		
	}

	private static void kaja(int aa) {
		
		
		
		
	}

	private static void kaja() {
		
		
		
		
		
	}
}
