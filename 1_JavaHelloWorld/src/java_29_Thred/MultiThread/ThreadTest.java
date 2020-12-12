package java_29_Thred.MultiThread;

// 구현하는방법
public class ThreadTest implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()); // Main에서 준 "A"가 찍힘
		System.out.println("ThreadTest");
		
		for(int i=0; i<10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(1000);// 1초간 재운다.			
			}catch (Exception e) {
				
			}
		}
	}

}
