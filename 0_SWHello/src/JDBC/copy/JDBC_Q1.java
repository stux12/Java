package JDBC.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Q1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여 얼마이상?");
		int sal = sc.nextInt();
		System.out.println("매니저아이디 얼마이상?");
		int mid = sc.nextInt();
		
		// 접속 객체 con1선언
		Connection con1 = null;

		// 드라이버 로딩, 소대문자, 띄워쓰기, 스태틱메소드(new없이사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// db접속 접속객체 ip port SID id pw
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

//			System.out.println("접속했어영");

//			sql 문장은 맞지만 역할은 X
		String sql2 = "select first_name 이름, salary 봉급, manager_id 매니저아이디"
				+" from employees"
				+" where (salary >= ? or manager_id >= ?)"
				+" and manager_id is not null";
		
		// 연동 2가지 방법
//			1)createStatement
//			2)preparedStatement
		// 문장객체
//1)	Statement st2 = con1.createStatement();
		PreparedStatement ps2 = con1.prepareStatement(sql2);
		ps2.setInt(1, sal);//?번째, 값
		ps2.setInt(2, mid);//?번째, 값
		
//			ResultSet
//			종이박스에 들어감               	조회를 실행하라 총107개
//1)	ResultSet rs2 = ps2.executeQuery(sql2);
		ResultSet rs2 = ps2.executeQuery();

		
//		System.out.println("번호"+"\t"+"이름"+"\t"+"봉급"+"\t"+"매니저아이디");
		while (rs2.next()) {// data있어?


			String fname = rs2.getString("이름");

			int salary = rs2.getInt("봉급");
			
			int manager_id = rs2.getInt("매니저아이디");
			
			System.out.println(rs2.getRow() + "\t" + fname + "\t" + salary + "\t" + manager_id);

		} // while end

		con1.close();
		System.out.println("접속끝");

	}
}