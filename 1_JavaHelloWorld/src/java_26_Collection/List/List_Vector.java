package java_26_Collection.List;

import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {

//		Vector ArrayList와 비슷하지만 속도가 떨어짐 하지만, ArrayList보다 멀티스레드 환경에서는 안전하여, 여전히 많이 쓰임
		
		Vector<String> vector = new Vector<String>();
		vector.add("str1");
		vector.add("str2");
		vector.add("str3");
		vector.add("str4");
		System.out.println(vector.toString());
		
		vector.add("str5");
		System.out.println(vector.toString());
		
		vector.add(2, "STR2");
		System.out.println(vector.toString());
		
		vector.set(2, "STR3");
		System.out.println(vector.toString());
		
		int size = vector.size();
		System.out.println("사이즈 : " +size);
		
		vector.remove(2);
		System.out.println(vector.toString());
		
		vector.clear();
		System.out.println(vector.toString());
		
		vector = null;
		System.out.println(vector);
		
		
	}

}
