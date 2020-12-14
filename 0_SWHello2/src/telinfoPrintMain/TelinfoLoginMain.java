package telinfoPrintMain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import telinfoDAO.TelinfoDAO;
import telinfoDTO.TelinfoDTO;

public class TelinfoLoginMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String id = null;
		String pw = null;
		String name = null;
		int sel = 0;
		int count = 0;
		TelinfoDAO tiDAO = new TelinfoDAO();

		do {
			count=0;
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원삭제");
			System.out.println("0. 종료");

			Scanner sc = new Scanner(System.in);
			sel = sc.nextInt();

			switch (sel) {
			case 1:
				System.out.println("id를 입력하세요");
				id = sc.next();
				System.out.println("pw를 입력하세요");
				pw = sc.next();
				System.out.println("이름을 입력하세요");
				name = sc.next();

				ArrayList<TelinfoDTO> test = tiDAO.gettestInfo();
				for (TelinfoDTO imsi : test) {
					if (imsi.getId2().equals(id)) {
						count++;
					} 
				}
				if(count==0) {
					boolean b1 = tiDAO.insert_logintable(id, pw, name);
					if (b1) {// 결과 true
						System.out.println("회원가입 완료");
					} else
						System.out.println("회원가입 실패");
					
				}else {
					System.out.println("이미 있는 아이디입니다.");
				}break;

			case 2:
				ArrayList<TelinfoDTO> test2 = tiDAO.gettestInfo();
				System.out.println("id를 입력하세요");
				id = sc.next();
				System.out.println("pw를 입력하세요");
				pw = sc.next();
				for (TelinfoDTO imsi : test2) {
					if (imsi.getId2().equals(id) && imsi.getPw().equals(pw)) {
						System.out.println("로그인되었습니다.");

					} else {
						System.out.println("id 혹은 pw가 틀렸습니다.");
					}
				}
				break;
			case 3:
				System.out.println("삭제할 id를 입력하세요");
				id = sc.next();
				ArrayList<TelinfoDTO> test3 = tiDAO.gettestInfo();
				for (TelinfoDTO imsi : test3) {
					if (imsi.getId2().equals(id)) {
						System.out.println("정말 삭제하시겠습니까?(y/n)");
						String check = sc.next();
						check.toLowerCase();
						if (check.equals("y")) {
							boolean b4 = tiDAO.delete(id);
							if (b4) {
								System.out.println("삭제되었습니다.");
							} else {
								System.out.println("sql오류로 삭제되지않았습니다.");
							}
						} else {
							System.out.println("처음으로 돌아갑니다.");
						}

					} else {
						System.out.println("없는 아이디입니다.");
					}
				}

				break;
			case 0:
				System.out.println("종료합니다");
				tiDAO.ps1Close();
				tiDAO.getAllInfoClose();
				break;

			default:
				System.out.println("해당 메뉴를 확인하고 선택해주세요");
				break;
			}

		} while (sel != 0);

	}
}
