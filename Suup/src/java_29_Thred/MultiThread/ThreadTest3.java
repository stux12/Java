package java_29_Thred.MultiThread;


// 다중 스레드 객체 1개, 스레드n개
public class ThreadTest3 implements Runnable {

	int testNum = 0;
	
	@Override
	public void run() {

		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("===================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName()+", testNum : " + testNum);
		
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
		}
	}
}
