package java_21_patton2.robotex;

import java_22_patton3.robotex.inter.FlyYes;
import java_22_patton3.robotex.inter.KnifeLazer;
import java_22_patton3.robotex.inter.MisailYes;

public class SuperRobot extends Robot {

	public SuperRobot() {
		fly = new FlyYes();
		misail = new MisailYes();
		knife = new KnifeLazer();
	}
	
	public void shape() {
		System.out.println("SuperRobot 로봇 입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	
	
}
