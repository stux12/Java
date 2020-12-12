package java_26_Collection.List;

import java.util.LinkedList;

public class List_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("str1");
		linkedList.add("str2");
		linkedList.add("str3");
		linkedList.add("str4");
		System.out.println(linkedList.toString());
		
		linkedList.add("str5");
		System.out.println(linkedList.toString());
		
		linkedList.add(2, "STR2");
		System.out.println(linkedList.toString());
		
		linkedList.set(2, "STR3");
		System.out.println(linkedList.toString());
		
		int size = linkedList.size();
		System.out.println("사이즈 : " +size);
		
		linkedList.remove(2);
		System.out.println(linkedList.toString());
		
		linkedList.clear();
		System.out.println(linkedList.toString());
		
		linkedList = null;
		System.out.println(linkedList);
		
		
	}

}
