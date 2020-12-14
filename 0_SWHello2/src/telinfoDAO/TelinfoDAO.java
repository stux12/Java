package telinfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import telinfoDBConn.TelinfoDBConn;
import telinfoDTO.TelinfoDTO;

public class TelinfoDAO {

	private Connection con;
	PreparedStatement ps1 = null;
	ResultSet rs1 = null;

	public TelinfoDAO() throws ClassNotFoundException, SQLException { // 생성자, 특징 : 제일먼저 수행된다.
		con = new TelinfoDBConn().getCon();// DAO쪽에서 다른 쪽에 있는 객체의 con을 끄집어낸다

	}

	public void ps1Close() throws SQLException {
		if (ps1 != null)
			ps1.close();
	}

	public void getAllInfoClose() throws SQLException {
		if (rs1 != null)
			rs1.close();
		if (ps1 != null)
			ps1.close();
		if (con != null)
			con.close();
	}

	public boolean insert_nametel(int id, String name, String tel, String sDate) {
		String sql = "insert into teltable2" + " values (?, ?, ?, ?)";

		try {
			ps1 = con.prepareStatement(sql);
			ps1.setInt(1, id);
			ps1.setString(2, name);
			ps1.setString(3, tel);
			int year = Integer.parseInt(sDate.substring(0, 4)) - 1900;
			int month = Integer.parseInt(sDate.substring(4, 6)) - 1;
			int day = Integer.parseInt(sDate.substring(6, 8));
			Date d1 = new Date(year, month, day);
			ps1.setDate(4, d1);
			ps1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert Exception");
			return false;
		}
		return true;
	}

	public ArrayList<TelinfoDTO> getAllInfo() throws SQLException {

		ArrayList<TelinfoDTO> tiarray1 = new ArrayList<TelinfoDTO>();
		String sql = "select * from teltable2 order by id";

		ps1 = con.prepareStatement(sql);
		rs1 = ps1.executeQuery(sql);

		while (rs1.next()) {
			int id = rs1.getInt("id");
			String name = rs1.getString("name");
			String tel = rs1.getString("tel");
			Date d = rs1.getDate("d");

			TelinfoDTO tiDTO = new TelinfoDTO(id, name, tel, d);
			tiarray1.add(tiDTO); // 컬렉션에 객체입력
		}

		return tiarray1;
	}

	public boolean update_id(int cid, int id2) {
		String sql = "update teltable2" + " set id = ?" + " where id = ?";
		try {
			ps1 = con.prepareStatement(sql);
			ps1.setInt(1, cid);
			ps1.setInt(2, id2);
			ps1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("update Exception");
			return false;
		}

		return true;
	}

	public boolean update_name(String cname, int id2) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update_tel(String ctel, int id2) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insert_logintable(String id, String pw, String name) {
		String sql = "insert into logintable" + " values (?, ?, ?)";

		try {
			ps1 = con.prepareStatement(sql);
			ps1.setString(1, id);
			ps1.setString(2, pw);
			ps1.setString(3, name);
			ps1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert Exception");
			return false;
		}
		return true;
	}

	public ArrayList<TelinfoDTO> gettestInfo() throws SQLException {

		ArrayList<TelinfoDTO> tiarray2 = new ArrayList<TelinfoDTO>();
		String sql = "select * from logintable";

		ps1 = con.prepareStatement(sql);
		rs1 = ps1.executeQuery(sql);

		while (rs1.next()) {
			String id = rs1.getString("id");
			String pw = rs1.getString("pw");
			String name = rs1.getString("name");
			TelinfoDTO testDTO = new TelinfoDTO(id, pw, name);
			tiarray2.add(testDTO); // 컬렉션에 객체입력
		}

		return tiarray2;
	}

	public boolean delete(String id) {
		String sql = "delete from logintable" + " where id = ?";

		try {
			ps1 = con.prepareStatement(sql);
			ps1.setString(1, id);
			ps1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("delete Exception");
			return false;
		}
		return true;

	}

}
