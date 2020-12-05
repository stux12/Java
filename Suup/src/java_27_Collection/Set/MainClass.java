package java_27_Collection.Set;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
	
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("홍길동", 3));
		hashSet.add(new Student("이순신", 5));
		hashSet.add(new Student("장보고", 1));
		
		System.out.println(hashSet.toString());
		
		
		// 1) 지워지지 않음 주소값이 달라서
		Student student = new Student("이순신", 5);
		hashSet.remove(student);
		System.out.println(hashSet.toString());
	}
}
