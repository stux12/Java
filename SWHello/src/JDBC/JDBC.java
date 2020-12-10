package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
			// 접속 객체 con1선언
			Connection con1 = null;
			
			// 드라이버 로딩, 소대문자, 띄워쓰기, 스태틱메소드(new없이사용)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// db접속								SID	                  ip   port  SID  id   pw 
			con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
			
			System.out.println("접속했어영");
			
			
			
		
		
		
		
	}
}
