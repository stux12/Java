package mybang5;

class BakeryBBang{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void start(){
		System.out.println("빵을 맛있게 먹자.");
	}
}

public class Bbang {

	public static void main(String[] args) {
		/*
		 Q) 제과점(Bakery-BBang클래스)에서 빵 종류와 빵가격을
		 	그리고 "빵을 맛있게 먹자" 를 실행하는 메소드를
		 	설계하여 운영하려고 한다.
		 	이에대한 OOP(Object Oriented Programming)을 작성하시오
		 	ex) 피자빵	2000원
		 		소보루빵	1000원
		 		빵을 맛있게 먹자
		 */
		
		
		BakeryBBang piza = new BakeryBBang();
		BakeryBBang soboru = new BakeryBBang();
		
		
		piza.setName("피자빵");
		piza.setPrice(2000);
		soboru.setName("소보루빵");
		soboru.setPrice(1000);
		
		System.out.println(piza.getName()+"의 가격은 "+ piza.getPrice()+"원 입니다");
		System.out.println(soboru.getName()+"의 가격은 "+ soboru.getPrice()+"원 입니다");
		piza.start();
		
	}

}
