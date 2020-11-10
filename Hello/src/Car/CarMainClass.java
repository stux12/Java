package Car;

//정의(설계)
class Car{
	String color;
	int 	door;
	public void drive() { // 메소드 1형식 2형식,3형식도 들어가짐 public 설명은 나중 void는 쓸거없을때
		System.out.println("멋지게 드라이브하자~");
	}
} //Car-Class-end


public class CarMainClass {
	
	public static void main(String[] args) {
		
		//생성(제작)
		Car mycar = new Car(); 
		
		mycar.color = "Black"; //객체.속성 = 값
		mycar.door = 2;
		mycar.drive();//객체.메소드
		System.out.println(mycar.color); //객체.속성 = 출력
		System.out.println(mycar.door); //객체.속성 = 출력
		
		Car yourcar = new Car();
		yourcar.color = "Yellow";
		
	} //main-end

}// class-end
