package java_21_patton2.robotex;

import java_22_patton3.robotex.inter.FlyNo;
import java_22_patton3.robotex.inter.FlyYes;
import java_22_patton3.robotex.inter.KnifeLazer;
import java_22_patton3.robotex.inter.MisailYes;

public class MainClass {

	public MainClass() {}

	public static void main(String[] args) {
		
	
		System.out.println("SuperRobot을 만들어 주세요");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionLun();
		superRobot.actionWalk();
//		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
//		superRobot.setKnife(new KnifeLazer());
		superRobot.actionKnife();
//		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();
		
		
		superRobot.setFly(new FlyNo());
		superRobot.actionFly();
	
	}
}
