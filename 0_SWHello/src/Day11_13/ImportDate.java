package Day11_13;

import java.util.Date;

/*
내장클래스를 사용하기 위한방법 1)
import 선택시
java.sql.Date, java.util.Date
(참고) System 클래스 : java.lang 인데 안쓴다!! 너무 자주쓰는거라서
import 패키지명.클래스명
ex) import java.util.Date
 */

public class ImportDate {

	public static void main(String[] args) {

		/*
		 * 클래스 1) 사용자 정의 클래스(user defined class) 설계(정의) - 제작(new, 생성) - 사용 => 3단계 2) 내장
		 * 클래스 (설계까지만 되어있음(1단계 생략), 안에 어떤기능이 있는지 공부해야만 알 수 있음) Scanner, System, Date
		 */

		// Date()말고 SQLDate, Calender()도 있음
		Date d1 = new Date();// 오늘날짜, 지금시간등등 값이 들어감
		// 자바스크립트에서 쓰는 방법
		// window.location="http://www.naver.com"
		// 객체.속성 = 값 인 형태임 ==>설계,제작까지 되어있음(2단계까지 생략)

		System.out.println(d1); // toString()를 오버라이딩함, toString 생략

		System.out.println(d1.toLocaleString()); // 현재 시간 더깔끔하게 나옴
		// 한줄그인이유 : 약간 오래된 명령어라는 뜻

		// Q) 출력은 오늘은 OO년 OO월 OO일로 나오게 짜기 tip!! d1.까지만찍으면 해당 Date안에있는 메소드들이 보임 동그라미에
		// 줄그인것들!!
		System.out.println(d1.getYear() + "년" + d1.getMonth() + "월" + d1.getDate() + "일" + d1.getDay() + "요일입니다");
		// window기준 1900년이후라서 0부터 1월로 쳐짐 이상없음 0은 일요일~ 6은 토요일
		// 2020-1900 = 120 ok? 11-1 = 10 ok?
		// 맞는결과 나오게 하려면
		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" }; // getDay가 숫자로 되어있기 때문에 0일 ~ 6토 순이라서
		String str1 = "오늘은 "; // str1 = String에 문자를 다 더하기위해 사용
		str1 += (d1.getYear() + 1900) + "년이고 ";
		str1 += (d1.getMonth() + 1) + "월 이며 ";
		str1 += d1.getDate() + "일 이고 ";
		str1 += yoil[d1.getDay()] + "요일 이다";
		System.out.println(str1);

		// Q1 오늘부터 만난지 100일 되는날 출력하기
		System.out.println("오늘부터 만난지 100일후는");
		d1.setDate(13 + 99); // get으로 받았으니 set으로 값을 보내줄때 오늘부터 100일후면 99일뒤니까 해당일자 + 99
		// 위 일을 더한것을 기준으로 월 년도 자동으로 카운트되서 올라감!!!!
		System.out.print(d1.getYear() + 1900 + "년 ");
		System.out.print((d1.getMonth() + 1) + "월 ");
		System.out.println(d1.getDate() + "일");

	}
}
