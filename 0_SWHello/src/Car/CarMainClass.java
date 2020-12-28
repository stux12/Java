package Car;

//정의(설계)
class Car { // heap영역에 구성
	private String color;
	private int door;

	public Car(String color, int door) { // 생성자 - 메서드 2형식 정의문과 비슷 비서쪽
		this.color = color; // 넘어온 초기치를 객체 안으로 넣기
		this.door = door;
	}

	public Car() {
	} // 디폴트 생성자 직접만든형태 생성자를 만들경우 항상 만들어주는 습관 들이기
	// getter, setter //임시방임 받는것이 String이라서

	public void setColor(String color) { // set은 받는것 , 메소드 2형식
		this.color = color;
		// car클래스의 color를 의미
	}

	// 값을 반환할때는 무조건 void가 아닌 해당 형으로 바꿔줘야함
	public String getColor() { // get은 보내는것 , 메소드 3형식
		return color; // == this.color
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getDoor() {
		return door;
	}

	public void drive() { // 메소드 1형식 2형식,3형식도 들어가짐 public 외부클래스에서 접근가능 void는 쓸거없을때
		System.out.println("멋지게 드라이브하자~");
	}

	// 출력할때 편리하게 사용하기 위해서
	public void chool() {
		System.out.println(color + "\t" + door);
	}

	public String toString() { // overriding = 이미 있는 메서드를 살을 덧대어 만든것
		return "[자동차 색은 말하자면]" + color + " 이고" + "[문의 갯수는 다시 얘기하면]" + door + " 개 입니다.";
	}

} // Car-Class-end

public class CarMainClass {

	public static void main(String[] args) { // 메인도 메서드 정의문 형태 OS가 호출하고있음!!

		// 생성(제작)
//		Car mycar = new Car(); 

		// 도우미를 이용해서 값을 넣고 받고 하는 형태
		/*
		 * mycar.setColor("red"); mycar.setDoor(2);
		 * System.out.println(mycar.getColor()); System.out.println(mycar.getDoor());
		 */

		// 생성과 동시에 값넣기
		Car mycar2 = new Car("red", 4); // 메서드 2형식과 호출문과 비슷 사장쪽

		Car yourcar = new Car();

		// 직접 값을 넣는 형태
		/*
		 * mycar.color = "Black"; //객체.속성 = 값 mycar.door = 2; mycar.drive();//객체.메소드
		 * System.out.println(mycar.getcolor); //객체.속성 = 출력
		 * System.out.println(mycar.getdoor); //객체.속성 = 출력
		 */

		mycar2.chool();

		System.out.println(mycar2.toString()); // .toString()은 생략가능 썻을때에 한해서
		System.out.println(mycar2);

	} // main-end

}// class-end
