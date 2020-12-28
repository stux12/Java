package Day11_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SQLDate {

	public static void main(String[] args) {

		Date d3 = new Date();
		SimpleDateFormat sdf1 = new
		// 날짜 데이터를 원하는 형태로 출력시켜줌
		SimpleDateFormat("yyyy년MM월dd일E요일 HH:mm:ss"); // 대소문자한건 구별하기 쉽게하려고 한것뿐임
		System.out.println(sdf1.format(d3));

		// 자바 날짜 -> SQL 날짜
		Date d11 = new Date(); // 자바-날짜
		// SQL Date는 직접 들어가서 찾아온거라 import를 안함
		// d11을 초단위로 쪼개서 sql.Date()를써서 날짜까지만 계산해서 s11에 저장한 형태!!
		java.sql.Date s11 = new java.sql.Date(d11.getTime()); // DB-날짜 = DB 날짜 (import선언은 java.util만 한다)
		System.out.println(d11); // java에서 Date = 시간나오고 날짜나오고
		System.out.println(s11); // sql에서 Date = only 날짜

		long soo = d11.getTime();
		System.out.println(soo);

		// SQL 날짜 -> 자바 날짜
		Date d12 = new Date(s11.getTime());
		// rs1.getDate("hire_date").getTime()) - JDBC 나가면 알려줌
		System.out.println(d12); // 시간과 날짜 나옴
	}
}
