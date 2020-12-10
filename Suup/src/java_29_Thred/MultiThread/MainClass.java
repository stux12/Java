package java_29_Thred.MultiThread;

public class MainClass {

	public static void main(String[] args) {

		// 구현을 통한 스레드
		ThreadTest threadTest = new ThreadTest();

		Thread thread = new Thread(threadTest, "A");
		thread.start();

		System.out.println(Thread.currentThread().getName());

		// 상속을통한 스레드
		ThreadTest2 thread2 = new ThreadTest2();
		thread2.setName("B");
		thread2.start();

		System.out.println(Thread.currentThread().getName());

		// 다중 스레드 객체 1개, 스레드n개
		ThreadTest3 test3 = new ThreadTest3();
		
		Thread thread0 = new Thread(test3, "A");
		Thread thread1 = new Thread(test3, "B");
	
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		
		// 다중 스레드 객체 1개, 스레드1개
		ThreadTest3 test4 = new ThreadTest3();
		ThreadTest3 test5 = new ThreadTest3();
		Thread thread3 = new Thread(test4, "A");
		Thread thread4 = new Thread(test5, "B");
		thread3.start();
		thread4.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
		
		// 객체 1개 스레드 n개일때 값이 공유되는걸 해결하기 위해 사용
		// 스레드 하나가 끝나기전까지 다른 스레드는 기다려라 A 다하고나서 B실행
		// 일대 다 스레드일경우 자주사용
		Thread_Synchronized synchronized1 = new Thread_Synchronized();
		
		Thread thread5 = new Thread(synchronized1, "A");
		Thread thread6 = new Thread(synchronized1, "B");
		thread5.start();
		thread6.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}

}
