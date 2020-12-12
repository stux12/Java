package telinfoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import telinfoDBConn.TelinfoDBConn;

public class TelinfoDAO {

	
	private Connection con;
	PreparedStatement ps1 = null;
	ResultSet rs1 = null;
	
	public TelinfoDAO() throws ClassNotFoundException, SQLException{ // 생성자, 특징 : 제일먼저 수행된다.
		con = new TelinfoDBConn().getCon();//DAO쪽에서 다른 쪽에 있는 객체의 con을 끄집어낸다
	}
	public void ps1Close() throws SQLException {
		if(ps1 != null) ps1.close();
	}
	
	public void getAllInfoClose() throws SQLException {
		if(rs1 != null) rs1.close();
		if(ps1 != null) ps1.close();
		if(con != null) con.close();
	}
	
}
