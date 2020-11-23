package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Bookstore{

	private String book_name;
	private String book_genre;
	private int book_price;
	
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	
	
	public String toString() {
		return "[책이름]" + book_name + "[장르]" + book_genre + "[책가격]" + book_price + "[원]";
	}
	public Bookstore(String book_name, String book_genre, int book_price) {
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}
	
	public Bookstore() {
		
	}
	
		
}

public class BookstoreClass {

	public static void main(String[] args) {
		
		
		
		Bookstore b1 = new Bookstore();
		
		
		b1.setBook_name("홍길동전");
		b1.setBook_genre("전래동화");
		b1.setBook_price(19900);
		
		System.out.println(b1.toString()); //toString생략가능
		
		Bookstore b2 = new Bookstore("별이빛나는 밤에", "소설", 10000);
		
		System.out.println(b2);
		
		ArrayList <Bookstore> book = new <Bookstore> ArrayList ();
		book.add(b1);
		book.add(b2);
		book.add(new Bookstore("우리는 해낼수 있다", "자기개발", 12000));
		book.add(new Bookstore("나무와 숲", "판타지", 10000));
		book.add(new Bookstore("나의연극인생", "자서전", 20000));
		book.add(new Bookstore("잠자는공주", "판타지", 15000));
		book.add(new Bookstore("지웅이와 아이들", "폭력물", 500000));
		
		
		System.out.println("검색된 책은 모두"+bookSurch(book)+"권 입니다.");
	

	}
										// 제네릭을 사용해야지만 Bookstore의 .get들을 쓸수있음
	private static int bookSurch(ArrayList <Bookstore>book) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<book.size(); i++) {
			System.out.println(book.get(i));
		}
		
		System.out.print("검색할 장르는?");
		String jang = sc.next();
		System.out.print("검색할 가격은?");
		int ga = sc.nextInt();
		
		int count=0;
		
		for(int i=0; i<book.size(); i++) {
			if(book.get(i).getBook_genre().equals(jang)) {
				if(book.get(i).getBook_price()<=ga) {
					System.out.println(book.get(i).getBook_name());
					count++;
				}
			}
		}
		
		return count;
		
	}
}
