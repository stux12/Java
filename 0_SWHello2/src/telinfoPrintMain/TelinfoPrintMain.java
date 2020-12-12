package telinfoPrintMain;

import java.sql.SQLException;
import java.util.Scanner;

import telinfoDAO.TelinfoDAO;

public class TelinfoPrintMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		int sel = 0;
		TelinfoDAO tiDAO = new TelinfoDAO();
		
		do {
			System.out.println("비상 연락망 관리!!\n\n\n");
		
			System.out.println("-----------------------------");
			System.out.println("1 : 한명입력");
			System.out.println("2 : 전체출력");
			System.out.println("3 : 종료");
			System.out.println("-----------------------------");
			System.out.print("이용할 메뉴 선택");

			Scanner sc = new Scanner(System.in);
			sel=sc.nextInt();

			switch(sel) {
			case 1: // 입력
				Scanner sc1 = new Scanner(System.in);
				System.out.print("id=");
				int id = sc1.nextInt();
				System.out.print("name=");
				String name = sc1.next();
				System.out.print("tel=");
				String tel = sc1.next();
				System.out.print("telDate=");
				String sDate=sc1.next();
				
//				boolean b1=tiDAO.insert_nametel(id, name, tel, sDate);
//				if(b1) //결과 true
//					System.out.println("insert ok");
//				else 
//					System.out.println("insert error");
				break;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}// switch_end
			
			
			
		}while(sel!=3);
		
	}
}
