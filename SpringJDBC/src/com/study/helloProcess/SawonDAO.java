package com.study.helloProcess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SawonDAO {

	/* 전체검색 */
	private ArrayList<Object> alist1;
	private JdbcTemplate jt1;

	/* 자동생성하지 않고 직접 입력하세요 */
	public JdbcTemplate getJdbcTemplate() {
		return jt1;
	}

	public void setJdbcTemplate(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}

	public ArrayList<Object> getAlist1() {
		return alist1;
	}

	public void setAlist1(ArrayList<Object> alist1) {
		this.alist1 = alist1;
	}

	/* 모두 출력 전문 메소드 */
	public ArrayList<Object> selectALL() {
		/* 문자열의 변화가 많을때 */
		StringBuffer sb1 = new StringBuffer();
		sb1.append("select name, tel from TelTable");
		/* jt1.query(select 문자열, newRowMapper()메소드) 조회문 */
		alist1 = (ArrayList<Object>) getJdbcTemplate().query(sb1.toString(), new RowMapper<Object>() {
			public Object mapRow(ResultSet rs1, int joolBun1) throws SQLException {
				SawonVO sv1 = new SawonVO();
				System.out.println("줄번호 = " + joolBun1);
				sv1.setName(rs1.getString("name"));
				sv1.setTel(rs1.getString("tel"));
				return sv1;
			}
		});
		System.out.println("자료 총 갯수는 " + kajaSoo());
		return alist1;
	}

	public int kajaSoo() {
		/* onerow 한개만 읽음 */
		int soo = jt1.queryForObject("select count(name) from TelTable", Integer.class);
		return soo;
	}

}
