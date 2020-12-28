package Day11_17;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Que_IteraterEx01 {

	public static void main(String[] args) {

//		Queue (fifo : first in first out)
//			   lilo : last in last out
		/*
		 * collection 인터페이스 Queue(큐) 인터페이스 -> 상속받아 만든 LinkedList클래스 출력 : Queue q1 = new
		 * LinkedList(); LinkedList <String> q2 = new LinkedList <String>();
		 */
		Deque q2 = new ArrayDeque();
		Queue<String> q1 = new LinkedList<String>();

		// 값을 넣을때 offer로 넣음 add도 가능하나 문법상 offer
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");

		System.out.println(q1.size());

		// Que의 출력 명령 1)
		System.out.println(q1);

		// Que의 출력 명령 2)
		// Iterator는 컬렉션에 저장되어있는 요소를 읽어오는 객체, 종이박스라고 생각
		// Enumeration하고 똑같음 근데 구형이라 신형인 Iterator을 쓰는게 나음
		Iterator itr1 = q1.iterator();
		// 값이있냐고 물어보는것
		while (itr1.hasNext()) {
			String name1 = (String) itr1.next();
			System.out.println(name1);

//			System.out.println(itr1.next()); //이 방법도 가능 

		} // while_end

		if (!q1.isEmpty()) { // q1이 비어 있지 않니?
			q1.poll(); // 꺼내는 메소드
		}
		if (!q1.isEmpty()) {
			q1.poll();
		}
		q1.offer("홍길동");

		System.out.println(q1);

		System.out.println(q1.peek());// 제일 처음값 출력 메소드

	}// main_end
}// class_end
