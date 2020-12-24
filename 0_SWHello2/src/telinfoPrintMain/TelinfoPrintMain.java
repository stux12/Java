package telinfoPrintMain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import telinfoDAO.TelinfoDAO;
import telinfoDTO.TelinfoDTO;

public class TelinfoPrintMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		int sel = 0;
		TelinfoDAO tiDAO = new TelinfoDAO();
		
		do {
			System.out.println("비상 연락망 관리!!\n\n\n");
		
			System.out.println("-----------------------------");
			System.out.println("1 : 한명입력");
			System.out.println("2 : 전체출력");
			System.out.println("3 : 한명수정");
			System.out.println("4 : 한명삭제");
			System.out.println("5 : 종료");
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
				
				boolean b1=tiDAO.insert_nametel(id, name, tel, sDate);
				if(b1) //결과 true
					System.out.println("insert ok");
				else 
					System.out.println("insert error");
				break;
			
			case 2:
				ArrayList<TelinfoDTO> tiaArray2 = tiDAO.getAllInfo();
				
				for(TelinfoDTO imsi : tiaArray2) {
					System.out.println(imsi.getId());
					System.out.println(imsi.getName	());
					System.out.println(imsi.getTel());
				}
				break;
			
			case 3:
				System.out.println("수정할 id를 입력하세요");
				int id2 = sc.nextInt();
				System.out.println("어떤걸 변경하시겠습니까? 1.id 2.name 3.tel 4.date");
				int sw = sc.nextInt();
				switch(sw) {
				case 1 : 
					System.out.println("id를 뭘로 변경하시겠습니까?");
					int cid = sc.nextInt();
					boolean b2 = tiDAO.update_id(cid, id2);
					if(b2) //결과 true
						System.out.println("update ok");
					else 
						System.out.println("update error");
					break;
				case 2 : 
					System.out.println("name을 뭘로 변경하시겠습니까?");
					String cname = sc.next();
					boolean b3 = tiDAO.update_name(cname, id2);
					if(b3) //결과 true
						System.out.println("update ok");
					else 
						System.out.println("update error");
					break;
				case 3 :
					System.out.println("tel을 뭘로 변경하시겠습니까?");
					String ctel = sc.next();
					boolean b4 = tiDAO.update_tel(ctel, id2);
					if(b4) //결과 true
						System.out.println("update ok");
					else 
						System.out.println("update error");
					break;
				default : System.out.println("해당 메뉴를 확인하고 선택해주세요");
				break;
				}
				
				break;
			case 4:
				break;
				
				
				
				
			case 5: System.out.println("종료합니다");
				tiDAO.ps1Close();
				tiDAO.getAllInfoClose();
				break;
				
			default : System.out.println("해당 메뉴를 확인하고 선택해주세요");
			break;
				

			}// switch_end
			
			
			
		}while(sel!=5);
		
	}
}
