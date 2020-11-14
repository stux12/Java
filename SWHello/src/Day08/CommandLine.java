package Day08;

public class CommandLine {

							
	public static void main(String[] args) {
		
		/*
		 명령 30 80 ==> 110 출력
		 >duhae 30 80
		 "30" --> 30
		 명령행인자를 사용하여야함
		 
		runAs -> run configuration -> 니가직접 설정값을 넣고해라
		project와 Main class 가 맞는지 확인!!
		main 옆 Arguments 여기가 메인String[] args 값받는곳
		 */
		

		
		if(args.length!=2) {
			System.out.println("정신 똑바로!!!!!!");
			System.out.println("사용법은 명령 숫자 숫자");
//			return; // 아무값없이 리턴해서 종료 비정상종료
//			c,c#,Java 다 공통으로 사용가능
			System.exit(-1); // 시스템 종료하는 키
//			c: exit(1)
//			c#: Environment.Exit(1)
		}
		
		
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		
		
		
		
		
		
		
	}
}
