package Day12;

interface samchon{ // 상속역할
	public void isBoat(); // 선언O, 구현절대안됨 X, child class에서 구현해야함, {}도 없음 대충설계도라서
					// public왜 안쓰라고 한건지?? -> 다른데서 동일한이름의 interface가 있으면 에러날수 있으니 나중에 써야할떄도 있는거는 맞음
	
//	public static void bote() { // 이 방법으로 에러가 안나긴 하지만 불러올수 없음 고로 에러
//		System.out.println("보트도 있지롱~~~~~~~~~");
//	}	
}

interface gomo extends samchon{
	void bosuk();
}

class Booja{
	public void manaDon() {
		System.out.println("많이 벌었다~~~~~~~~~~");
	}
}// Booja class_end

	//Na 에 엑박이 뜨면 클릭하여 메소드 만들기
class Na extends Booja implements gomo{ // Booja를 상속하고 samchon은 간단한 도구

	
	public void isBoat() { // 위에서 삼촌의 isBoat()는 구현을 안했기 때문에 여기서 구현함
		System.out.println("보트 여행 다니자~~~~");
	}
	
	public void useDon() { // Na가 들고있는 메소드
		System.out.println("많이 사자~~~~");
	}

	public void bosuk() {
		System.out.println("보석 니꺼~~~~~");
	}
	
}// Na class_end

public class Diamondproblem02 {

	public static void main(String[] args) {
		Na na1=new Na(); // 객체생성
		na1.useDon();// 원래 나
		na1.isBoat();// 상속된것(interface)
		na1.bosuk();
		na1.manaDon();// 상속된것(extends)
//		na1.bote(); // 불러올수 없음 
		// 결국 설계도를 대충그린 interface방법으로 다중상속을 한 것!!
	}// main_end
	
	
}// diamond class_end