package Day11_16;

import java.util.ArrayList;

//객체 = class
class SMarket {

}

public class ArrayListEx02 {

	public static void main(String[] args) {

		/*
		 * 배열과 컬렉션의 장점을 따서 만들어보자 가변길이 배열 + one data type
		 */

		// 형식 문자열만 들어가게 됨
		ArrayList<String> arr3 = new ArrayList<String>();

		// 객체 클래스 객체만 들어가게 됨
		ArrayList<SMarket> arr4 = new ArrayList<SMarket>();

		// Q 문자열만 들어가는 ArrayList 객체 arr1 생성
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(arr1.size());// 아무것도 안넣었으니 0

		// 입력은 add
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("김밥");
		arr1.add("우유");

		// 내용 수정은 set 삭제는 remove
		arr1.set(1, "과자"); // 라면 --> 과자
		arr1.remove(2); // 우유 삭제
		arr1.remove("빵"); // 빵 삭제

		// 출력은 get or 바로출력
		System.out.println(arr1); // .toString 생략
		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i) + "\t");
		}
		// arr에서 제일첫번째껄 끄집어내서 찍고 다음껄 또 끄집어내서 찍음 다 끄집어내서 찍기전까지 반복
		// 안에 객체의 개수가 애매할때 전부다 출력하는 방법!!!!!
		for (String imsi : arr1) {
			System.out.println(imsi);
		}

		// .get()의 길이를 알고싶을땐 .length()
		System.out.println(arr1.get(0).length());

	}
}
