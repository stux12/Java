package Day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {

//				처리속도가 조금 느림			처리속도가 조금더 빠름
		//ArrayList는 <형태 한개만가능> , HashMap <형태 여러개 가능> 
				//key값	 value값 형태는 상관없음
		HashMap <Integer,String> hm1 = new HashMap <Integer, String>();
		
		System.out.println(hm1.size());
		
		// hashmap은 put으로 값넣음 (key, value) ArrayList는 .add로 넣음
		hm1.put(new Integer(100), "멋쟁이"); // hashcode
		hm1.put(new Integer(300), "공주");
		hm1.put(new Integer(200), "왕자");
		
		
		//.get으로 끄집어냄
		System.out.println(hm1.get(100));
		System.out.println(hm1); // = 으로 묶여있다는걸 표시해줌
		System.out.println(hm1.get("멋쟁이")); //Null??
		
		// remove
		hm1.remove(300);
		if(hm1.size()>0) {
			System.out.println(hm1.size());
		}
		
		// value모음 출력
		Collection <String> v1 = hm1.values();
		System.out.println(v1);
		
		// key모음 출력
		Collection <Integer> v2 = hm1.keySet();
		System.out.println(v2);
		
		// key하고 value 같이 찍어내는 방법 1)
		// 이소스에서 v2는 key의 집합
		// i : v2 v2의 하나하나를 다 뽑아옴 끝날때까지!!
		for(Integer i : v2) {
			System.out.println(i + "\t" + hm1.get(i));
							//key값			value값
		}
		
		// key하고 value 같이 찍어내는 방법 2) Entry Set
		Set <Map.Entry <Integer, String>> set3 = hm1.entrySet();
		for(Map.Entry<Integer, String> k : set3) {
			System.out.println(k.getKey()+"\t"+k.getValue());
		}
	}

}
