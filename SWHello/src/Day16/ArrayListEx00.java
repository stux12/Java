package Day16;

import java.io.StreamCorruptedException;
import java.util.ArrayList;

public class ArrayListEx00 {

	public static void main(String[] args) {
		
		//ArrayList는 객체를 핸들링하기때문에 객체를 넣어줘야함!!!!!!
		// 일반값도 넣을수는 있으나 그럴바에는 배열을 쓰는게 나음
		ArrayList arr1 = new ArrayList();
		
		// array에는 .length지만 collect에는 .size임
		System.out.println(arr1.size());
		
		arr1.add(new Integer(300)); // multi data
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String("ondal"));
		
		// System.out.println(arr1[0]); //배열처럼 방이잡히는 구조가 아님
		
		// .get이 값을 가져오는것 배열을가져오는것과 비슷하게 for돌려야함
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		System.out.println(arr1.size());// 4개의 공간이 만들어짐
		System.out.println(arr1); //toString 생략
	
	
/*		int [] a = new int[3];
		a[0] = new Integer(300);
		a[1] = new Double(100.7);
*/
		
		
	}
}
