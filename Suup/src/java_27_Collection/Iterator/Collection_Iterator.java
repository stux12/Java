package java_27_Collection.Iterator;

import java.util.HashMap;
import java.util.Iterator;

public class Collection_Iterator {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		System.out.println(hashMap.toString());
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) { //다음 문자가 있는지??
			String string = hashMap.get(iterator.next()); // 키값을 가져옴
			System.out.println(string);
		}
	
	
	}

}
