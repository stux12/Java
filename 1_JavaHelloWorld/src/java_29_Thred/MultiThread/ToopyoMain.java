package java_29_Thred.MultiThread;

public class ToopyoMain {

	public static void main(String[] args) {
		
		ToopyoThread Toopyothread1 = new ToopyoThread();
		ToopyoThread Toopyothread2 = new ToopyoThread();
		ToopyoThread Toopyothread3 = new ToopyoThread();
		
		Thread thread1 = new Thread(Toopyothread1, "Toopyo1");
		Thread thread2 = new Thread(Toopyothread2, "Toopyo2");
		Thread thread3 = new Thread(Toopyothread3, "Toopyo3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
