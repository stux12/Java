package java_29_Thred.MultiThread;

// 스레드 하나가 끝나기전까지 다른 스레드는 기다려라
// 일대 다 스레드일경우 자주사용
public class Thread_Synchronized implements Runnable {

	int testNum = 0;
	
	@Override
	public void run() {

		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
			System.out.println("=======================");
			testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName()+ ", testNum : " + testNum);
		}
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			
		}
	}
	
}
