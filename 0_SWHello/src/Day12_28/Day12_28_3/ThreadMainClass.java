package Day12_28.Day12_28_3;

class ThreadClass1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "내가 쏘고 있다.");
			try {
				Thread.sleep(200);// 500MS 즉, 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "네가 쏘는 거냐!!!");
			try {
				Thread.sleep(300); // 0.3초 delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadMainClass {

	public static void main(String[] args) {

		ThreadClass1 tc1 = new ThreadClass1(); // 디폴트 생성자
		ThreadClass2 tc2 = new ThreadClass2(); // 디폴트 생성자

		tc1.start(); // ThreadClass1의 run호출
		tc2.start(); // ThreadClass2의 run호출
	}
}
