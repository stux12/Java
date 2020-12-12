package Day17;

import java.util.Iterator;
import java.util.Stack;

public class Stack_IteraterEx01 {

	public static void main(String[] args) {
		
		// stack lifo filo구조
		
		Stack <String> st1 = new Stack <String> ();
		
		// 값을 넣을때 push로 함 add도 가능은하나 문법상 push
		st1.push("카레");
		st1.push("볶음밥");
		st1.push("뚝불고기");
		
		System.out.println(st1.size());
		
		// stack 출력 명령 1) 있는걸 찍을때는 유용!!
		System.out.println(st1);
		
		// stack 출력 명령 2) X 순서에 주의해야함!! 이렇게하면 넣은순서대로 나옴
		System.out.println("======== Iterator로 출력");
		Iterator <String> itr1 = st1.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+"\t");
		}
		
		// stack 출력 명령 3) 순서에 맞게 출력함 pop를 이용
		System.out.println("==== pop로 출력");
		while(!st1.isEmpty()) {
			System.out.print(st1.pop()+"\t");
		}
		System.out.println();
		System.out.println(st1);// 다 끄집어 냈으니깐 아무것도 안나옴!!! 중요!!
	}// main_end
}// class_end
