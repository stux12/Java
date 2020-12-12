package java_24_API.Timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {

	public TimerEx()throws InterruptedException {
	
		System.out.println("^^");
		Timer timer = new Timer(true);// true를 해줘야 로직이 끝날때 메모리상에서 없어짐
		TimerTask t1 = new TimerTask1();
		TimerTask t2 = new TimerTask2();
		
		timer.schedule(t1, 2000);// 2초후 실행
		timer.schedule(t2, 10000);// 10초후 실행
		
		Thread.sleep(11000);
		System.out.println("**");
		
	}
}
