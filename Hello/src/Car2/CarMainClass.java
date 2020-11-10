package Car2;

//정의(설계)
class Car{			//heap영역에 구성
	private String color;
	private int 	door;
	//getter, setter	//임시방임 받는것이 String이라서
	public void setColor(String color) { // set은 받는것 , 메소드 2형식
		this.color = color;
		//car클래스의 color를 의미
	}
			// 값을 반환할때는 무조건 void가 아닌 해당 형으로 바꿔줘야함
	public String getColor() { // get은 보내는것 , 메소드 3형식
		return color; //== this.color
	}
		
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return door;
	}
	
	public void drive() { // 메소드 1형식 2형식,3형식도 들어가짐 public 설명은 나중 void는 쓸거없을때
		System.out.println("멋지게 드라이브하자~");
	}
	
} //Car-Class-end


public class CarMainClass  {
	
	public static void main(String[] args) {
		
		//생성(제작)
		Car mycar = new Car(); 
		
		// 도우미를 이용해서 값을 넣고 받고 하는 형태
		mycar.setColor("red");
		mycar.setDoor(2);
		System.out.println(mycar.getColor());
		System.out.println(mycar.getDoor());
		
		// 직접 값을 넣는 형태
//		mycar.color = "Black"; //객체.속성 = 값
//		mycar.door = 2;
		mycar.drive();//객체.메소드
//		System.out.println(mycar.color); //객체.속성 = 출력
//		System.out.println(mycar.door); //객체.속성 = 출력
		
		
	} //main-end

}// class-end
