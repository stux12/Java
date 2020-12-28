package BBang;

class Bang {
	private String name;
	private int price;

	public Bang(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Bang() {
	}

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

	public void start() {
		System.out.println("빵을 맛있게 먹자.");
	}

	public String toString() {
		return name + "의 가격은 " + price;
	}

}

public class Bbang {

	public static void main(String[] args) {

		Bang piza = new Bang("피자빵", 2000);
		Bang soboru = new Bang("소보루빵", 1000);

		System.out.println(piza.toString());
		System.out.println(soboru.toString());

	}

}
