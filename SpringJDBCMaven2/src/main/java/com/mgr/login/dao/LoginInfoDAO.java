package com.mgr.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.mgr.dbconn.TelInfoDBConn;
import com.mgr.login.vo.LoginInfoVO;

@Repository
public class LoginInfoDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public LoginInfoDAO() throws Exception {
		con = new TelInfoDBConn().getConnection();
	}
	
	public void pstmtClose() throws Exception{
		if(pstmt != null) {
			pstmt.close();
		}
	}
	
	/* 로그인 확인 */
	public int checkLogininfo(LoginInfoVO vo1) throws Exception{
		
		String sql = "SELECT * FROM LOGINTABLE55 WHERE ID=? AND PW=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		pstmt.setString(2, vo1.getPw());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	/* 로그인 정보 가져오기 */
	public LoginInfoVO getLogininfo(LoginInfoVO vo1) throws Exception{
		
		LoginInfoVO logininfo = null;
		String sql = "SELECT * FROM LOGINTABLE55 WHERE ID = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			logininfo = new LoginInfoVO();
			logininfo.setId(rs.getString("id"));
			logininfo.setName(rs.getString("name"));
			logininfo.setPw(rs.getString("pw"));
		}
		return logininfo;
	}
	
	/* 회원가입 */
	public void insertLogininfo(LoginInfoVO vo1) throws Exception{
		
		String sql = "INSERT INTO LOGINTABLE55 VALUES(?,?,?)";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		pstmt.setString(2, vo1.getPw());
		pstmt.setString(3, vo1.getName());
		pstmt.executeUpdate();
		
	}
	
	/* 회원삭제 */
	public void deleteLogininfo(LoginInfoVO vo1) throws Exception{
		
		String sql = "DELETE LOGINTABLE55 WHERE ID = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		pstmt.executeUpdate();
		
	}
	
}
