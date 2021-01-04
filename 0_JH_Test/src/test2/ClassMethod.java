package test2;

//클래스
class car{
	//전역변수
	int a = 0;
	
	//생성자
	public car() {
		GUI();
	}
	
	public void GUI() {
		System.out.println("실행됨");
		price();
		color();
		GUI();
		DataBase();
	
	}
	
	
	
	
	private void DataBase() {
	}






	//메서드는 보통 반환값이 있어요
	//반환값이 없으면 void를 써야하고 있으면 그 반환하는 형태에 맞게 써줘야함
	private String color() {
		System.out.println("색깔");
		String a  = "색깔";
		return a;
	
	}

	private void price() {
		System.out.println("가격");
	}

	@Override
	public String toString() {
		String a = "안녕하세요";
		return a;
	}
		
	
}









public class ClassMethod {

public static void ClassMethod(){
		System.out.println("아아아아");
	}
	public static void main(String[] args) {
		
		//객체  변수 = 새로만든다 객체의생성자를통
		

	
	
	}	
}
