package JDBC.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Copy {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
			// 접속 객체 con1선언
			Connection con1 = null;
			
			// 드라이버 로딩, 소대문자, 띄워쓰기, 스태틱메소드(new없이사용)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// db접속 접속객체						SID	                  ip   port  SID  id   pw 
			con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
			
//			System.out.println("접속했어영");
			
//			sql 문장은 맞지만 역할은 X
			String sql2 = "select * from employees";
			
			//문장객체 
			Statement st2 = con1.createStatement(); 
			
			//연동 2가지 방법
//			createStatement
//			종이박스에 들어감               	조회를 실행하라 총107개
			ResultSet rs2 = st2.executeQuery(sql2);
			
			
			
			
	}
}
