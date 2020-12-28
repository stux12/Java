package Day12_28.Day12_28_2;

class ThreadClass1 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + "나는 나야");
		System.out.println("All you need is Love~~~~");
	}
}

class ThreadClass2 extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + " 나도 너 아니거든");
		System.out.println("Love is All you need~~~~");
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
