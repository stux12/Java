package telinfoDBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelinfoDBConn {

	private Connection con;

	public Connection getCon() {
		return con;
	}
	
	public TelinfoDBConn() {
	}

	public TelinfoDBConn(Connection con) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //driver 로딩
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); //접속
	}

	
	
}
