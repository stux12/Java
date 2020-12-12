package JDBC.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Copy {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 이름을 입력하세요");
		String who = sc.next();
		who = who.toUpperCase();
		
		// 접속 객체 con1선언
		Connection con1 = null;

		// 드라이버 로딩, 소대문자, 띄워쓰기, 스태틱메소드(new없이사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// db접속 접속객체 ip port SID id pw
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

//			System.out.println("접속했어영");

//			sql 문장은 맞지만 역할은 X
		String sql2 = "select * from employees" // 줄을 바꾸면 무조건 한칸 띄고 시작
//						+ " where department_id=30";// +할시에는 띄워쓰기를 해야지만 읽어짐
//				+ " where upper(first_name) = '"+who+"'";
//				+ " where upper(first_name) = ?"; // 전체문장이 아직 결정안된상태, 문법이 달라짐
				+ " where upper(first_name) like ?";
		
		// 연동 2가지 방법
//			1)createStatement
//			2)preparedStatement
		// 문장객체
//1)	Statement st2 = con1.createStatement();
		PreparedStatement ps2 = con1.prepareStatement(sql2);
		ps2.setString(1, '%'+who+'%');//?번째, 값
		
//			ResultSet
//			종이박스에 들어감               	조회를 실행하라 총107개
//1)	ResultSet rs2 = ps2.executeQuery(sql2);
		ResultSet rs2 = ps2.executeQuery();

		
		while (rs2.next()) {// data있어?

			int id = rs2.getInt("employee_id");
//			int id2 = Integer.parseInt(rs2.getString("employee_id"));

			String fname = rs2.getString("first_name");

			String h_date = rs2.getString("hire_date");// 날짜도있지만 시간 분 초 

			String hire_date = h_date.substring(0, 10);// 날짜만출력하려고 쓰는거임 

			System.out.println(rs2.getRow() + "\t" + id + "\t" + fname + "\t" + hire_date);

		} // while end

		con1.close();
		System.out.println("접속끝");

	}
}
