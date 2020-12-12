package java_29_Thred.MultiThread;

// 상속하는 방법
public class ThreadTest2 extends Thread {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
		}
	}
}
