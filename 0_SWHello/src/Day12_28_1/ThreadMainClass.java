package Day12_28_1;

//Thread를 상속받음 ThreadClass가 됨 Thread는 run()가 무조건 있어야함
class ThreadClass extends Thread {
	public void run() {
		System.out.println("쓰레드와 오늘부터 1일");
	}
}

class ThreadClass2 extends ThreadMainClass implements Runnable {
	@Override
	public void run() {

	}

}

public class ThreadMainClass {

	public static void main(String[] args) {

		ThreadClass tc1 = new ThreadClass(); // delegation
		tc1.start(); // ThreadClass의 run을 호출
		System.out.println("쓰레드 하러 가자");

		/*
		 * - 프로그램(program) : 어떤 파일이나 소스가 디스크에 있는 상태 ex) 메모장 실행파일 notepad.exe
		 * 
		 * - 프로세스(process) : 디스크에 있는 프로그램이 메모리에 올라와 있는 상태 ex) 메모장이 화면에 보일때 .CGI(Common
		 * Gate Interface) (참고) process만 다량 사용시 : overhead(과부하) 걸림 networking : multi
		 * processing
		 * 
		 * - 쓰레드(Thread) : 프로세스 위에서 동작하는 경량 프로세스(LightWeight Process) overhead의 문제를 대처하기
		 * 위해서 Thread를 사용함 thread = TSS (Time Sharing System) 시분할 방식이다.
		 * 
		 * 기본 1 process - 1 thread : single thread 예) 잔치날 혼자서 요리 다하기 일하는 사원 1명 - 복사기 1대
		 * 
		 * 1 process - 여러 thread : multi thread 예) 잔치날 동서, 시누이, 남편동원 일하는 사원 1명 - 복사기 3대
		 * 
		 * 문맥스위치(Context Swich) - 각각의 thread 에서 한것을 보관, 시간이 많이 걸릴경우 빠르다고 장담X
		 * 
		 * - 쓰레드가 되게하는 클래스를 만드는 2가지 방법
		 * 
		 * 1) java.lang.Thread 클래스를 상속 : 다른 클래스와 상속이 특별히 요구되지 않는 경우, ==> 상속으로 인해 원치않는
		 * 메소드까지 상속받는 경우 발생이 단점
		 * 
		 * 2) java.lang.Runnable 인터페이스를 상속 : 다른클래스와 상속관련이 있는 경우 ==> 이왕이면 Runnable 을 사용하면
		 * 좋다.
		 * 
		 */

	}
}
