package Day11_11;

class cafe1 {
	private String name;
	private String size;
	private int price;
	private String witch;

	// 생성자들
	public cafe1(String name, String size, int price, String witch) {
		this.name = name;
		this.size = size;
		this.price = price;
		this.witch = witch;
	}

	// 디폴트생성자 무조건만든다!!! 생성자를 하나라도 만들시!!!
	public cafe1() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWitch() {
		return witch;
	}

	public void setWitch(String witch) {
		this.witch = witch;
	}

}

public class ClassEx02 {

	public static void main(String[] args) {

		/*
		 * main()에 String pummok = "coffee:big:1500:jongro"; 이 있을때 cafe1 클래스를 사용하여
		 * getter/setter 및 toString()등을 작성한후 toString()출력시 다음과 같이 출력하도록 프로그램을 작성하시오 (단,
		 * 커피명:사이즈:가격:지점을 의미하며 cafe1클래스의 필드는 앞의 4개를 만들어 사용한다
		 * 
		 * ex)coffee의 사이즈가 big인경우 가격은 1500원 jongro지점에서 판매합니다
		 * 
		 */

//		String pummok = "coffee.big.1500.jongro";
		String pummok = "coffee,big,1500,jongro";

		String[] bae = pummok.split(",");
//		String [] bae = pummok.split("\\."); //.의경우 \\를 앞에 두번붙여줘야 함 그래야 .한개로 인식됨 .만쓰면 all로 처리되서 안됨
//		String [] bae = pummok.split("\\*\\*"); //*하나 *하나 문자 따로보고 하나하나 붙여줘야함
		// split 메서드는 ()안 문자를 기준으로 자름

		cafe1 cafe = new cafe1(); // == cafe1(bae[0],bae[1],Integer.valueOf(bae[2]),bae[3])

		cafe.setName(bae[0]);
		cafe.setSize(bae[1]);
		cafe.setPrice(Integer.valueOf(bae[2]));
		cafe.setWitch(bae[3]);

		System.out.println(cafe); // .toString 생략

	}
}
