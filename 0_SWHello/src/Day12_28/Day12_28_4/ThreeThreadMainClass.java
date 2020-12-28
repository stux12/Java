package Day12_28.Day12_28_4;

class ThreeThreadClass extends Thread {
	String kwail;

	public ThreeThreadClass(String kwail) {
		this.kwail = kwail;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(kwail + "\t" + i + "개 주세요");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreeThreadMainClass {

	public static void main(String[] args) {

		ThreeThreadClass ttc1 = new ThreeThreadClass("사과");
		ThreeThreadClass ttc2 = new ThreeThreadClass("배");
		ThreeThreadClass ttc3 = new ThreeThreadClass("감");

		// 우선순위라는게 특별하게 차이가나는게 없음 쓰는의미 없는거??
		// 우선순위 : priority // 자바쓰레드 : 1-10범위
		ttc1.setPriority(ttc1.MIN_PRIORITY); // 1
//		ttc1.setPriority(2);//1~10
		ttc2.setPriority(ttc2.NORM_PRIORITY); // default 5
		ttc3.setPriority(ttc3.MAX_PRIORITY); // 10 감

		System.out.println(ttc1.getPriority() + "\t" + ttc2.getPriority() + "\t" + ttc3.getPriority());

		ttc1.start();
		ttc2.start();
		ttc3.start();

	}

}
