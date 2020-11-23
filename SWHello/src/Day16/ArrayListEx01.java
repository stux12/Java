package Day16;

import java.util.ArrayList;
import java.util.Date;

class SMarket2{
	
	private String sangpum;
	private int price;
	
	

	public String toString() {
		return "상품이름은 " + sangpum + " 상품 가격은 " + price;
	}


	public SMarket2(String sangpum, int price) {
		this.sangpum = sangpum;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getSangpum() {
		return sangpum;
	}


	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}


	public SMarket2() {
	}

	
	
	

}



public class ArrayListEx01 {

	public static void main(String[] args) {

		
		 SMarket2 sm1 = new SMarket2("치즈빵", 2000);
		 SMarket2 sm2 = new SMarket2("피자빵", 3000);
		/* 
		 //Q3) 이제 여기에 collection을 적용시켜보기
		 arrayList arr3 를 만들어 처음에 판매한 날짜를 넣고
		 그다음부터 판매내용을 넣은 후 모두를  출력하시오
		 출력예)
			Mon Nov 16 19:59:44 KST 2020
			상품이름은 우유이고 상품가격은 1000원입니다
			상품이름은 빵이고 상품가격은 2000원입니다.
		*/
		 
		/*
		 객체(사용자정의객체등)을 넣으려면
		 객체부터 만든다 SMarket s1 = new SMarket("우유", 2500);
		 컬렉션에 넣으려면 new SMarket("우유", 2500); 를 만들고
		 add로 넣는다
		 */
		 ArrayList arr3 = new ArrayList();
		 
		 arr3.add(new Date());
		 arr3.add(new SMarket2("우유", 1000));
		 arr3.add(new SMarket2("빵", 2000));
		 
//		 for(int i=0; i<arr3.size(); i++) {
//			 System.out.println(arr3.get(i));
//		 }
		 
		/* 
		 Q4) 이제 여기에 generic 을 적용 시켜보자는~~~
			ArrayList <SMarket> arr5를 만들어 5개정도 판매상품을 넣은후
			toString 사용없이 가격이 2000미만인 상품의 이름만 모두 출력하시오
		 */
		 
		 ArrayList <SMarket2> arr5 = new ArrayList<SMarket2>();
		 arr5.add(new SMarket2("집에", 1000));
		 arr5.add(new SMarket2("가고", 2000));
		 arr5.add(new SMarket2("싶다", 3000));
		 arr5.add(new SMarket2("어려", 4000));
		 arr5.add(new SMarket2("워요", 5000));

		System.out.println(sm1); //toString
		System.out.println(sm2); //toString
		
		
		 for(int i=0; i<arr5.size(); i++) {
			 if(arr5.get(i).getPrice() < 000) {
				 System.out.println(arr5.get(i).getSangpum());
			 }
		 }
		 
		 
		 
		 
	}

}
