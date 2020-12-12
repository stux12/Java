package JDBC.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class JDBC_T1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 접속 객체 con1선언
		Connection con1 = null;

		// 드라이버 로딩, 소대문자, 띄워쓰기, 스태틱메소드(new없이사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// db접속 접속객체 ip port SID id pw
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

//			System.out.println("접속했어영");
		
		
		//자료 insert
		String sql2 = "insert into teltable5 values(?,?,?,?)";
		
		//자료 delete
//		String sql3 = "delete from teltable5"
//					+ " where id = ?";
		
		//자료 update
//		String sql4 = "update teltable5"
//					+ " set tel = ?"
//					+ " where name = ?";
		
		//시간 넣기	
//		String sql5 = "insert into teltable5 values(1,'김진환','010-2222-3333',to_date(?,'yyyy/mm/dd hh24:mi:ss'))";
		
		//자료 select
//		String sql6 = "select id, name, tel, to_char(d, 'yyyy \"년\"mm \"월\" dd \"일\" hh24:mi:ss') from teltable5"
//					+ " where name = '김진환'";
		
		PreparedStatement pst1 = con1.prepareStatement(sql2);
//		PreparedStatement pst2 = con1.prepareStatement(sql3);
//		PreparedStatement pst3 = con1.prepareStatement(sql4);
//		PreparedStatement pst4 = con1.prepareStatement(sql5);
//		PreparedStatement pst4 = con1.prepareStatement(sql6);

		
		
		//hh = 0~23시 kk = 1~24시로 표현
		//날짜와 시간처리하는것 
//		1) format으로 형식을 디자인(날짜+시간), 신형버젼
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
//		String sDate = sdf1.format(Calendar.getInstance().getTime());
		
//		2) 구형버젼
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/mm/dd kk:mm:ss");
//		String sDate2 = sdf2.format(new Date());
		
		

		
		
		Scanner sc = new Scanner(System.in);
//		Scanner을 사용안하고 다른걸로 사용하는 방법
//		GUI
		int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는?"));
		String name = JOptionPane.showInputDialog("이름은?");
		String tel = JOptionPane.showInputDialog("전화번호는?");
		String ipsail = JOptionPane.showInputDialog("입사일은?");
//		int id = Integer.parseInt(JOptionPane.showInputDialog("지울아이디?"));
//		System.out.println("수정하기 위해 검색할 이름은?");
//		String ch = sc.next();
//		System.out.println("변경할 전화번호?");
//		String cid = sc.next();
		
		
		pst1.setInt(1, id);
		pst1.setString(2, name);
		pst1.setString(3, tel);
		pst1.setString(4, ipsail);
//		pst2.setInt(1, id);
//		pst3.setString(1, cid);
//		pst3.setString(2, ch);
//		pst4.setString(1, sDate);
		
		//insert, update, delete 전부다 Update()를 해줘야함 한번할때마다 값이 1이 올라감
//		int rowcnt1 = pst1.executeQuery(); //조회
//		int rowcnt1 = pst1.executeUpdate(); 
//		int rowcnt1 = pst2.executeUpdate();
//		int rowcnt1 = pst3.executeUpdate();
//		int rowcnt1 = pst4.executeUpdate();
//		ResultSet rs2 = pst4.executeQuery();
		
//		if(rowcnt1>0) {
//		System.out.println("잘들어봐~봐 " + rowcnt1 + "행 insert 했다는~~");
//		System.out.println("잘들어봐~봐 " + rowcnt1 + "행 delete 했다는~~");
//		System.out.println("잘들어봐~봐 " + rowcnt1 + "행 update 했다는~~");
//		}
//		else {
//			System.out.println("insert안됨");
//			System.out.println("delete안됨");
//			System.out.println("update안됨");
//		}
		
//		while(rs2.next()) {
//			int id=rs2.getInt("id");
//			String strD = rs2.getString(4);
//			System.out.println(rs2.getRow()+"\t"+id+"\t"+strD);
//		}
		
		con1.close();
		System.out.println("접속끝");
	}
}
