package Day12_28_4;

class RunnableClass implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("저찌라고");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class ThreadClass extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("어찌라고");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableMainClass {

	public static void main(String[] args) {

		ThreadClass th1 = new ThreadClass(); // 1) extends Thread방식
		Thread th2 = new Thread(new RunnableClass()); // 2) implements Runnable방식
		RunnableClass rc1 = new RunnableClass();
		th1.start();
		th2.start();

	}

}
