package java_27_Collection.Set;

import java.util.HashSet;

public class Set_HashSet {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str2"); // 중복이 안되서 값이 안들어감
		System.out.println(hashSet.toString());
		
		hashSet.remove("str0");
		System.out.println(hashSet.toString());
		
		int i = hashSet.size();
		System.out.println("사이즈 : " + i);
	
	}

}
