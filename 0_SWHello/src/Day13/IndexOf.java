package Day13;

public class IndexOf {

	public static void main(String[] args) {
		
		/*
		 책이름을 배열에 넣은후 JAVA책을 모두 검색하는
		 순차검색 프로그램을 작성하시오
		 (자바책이 있을 경우 결과)
		 	java Programming
		 	easy Java Programming
		 	Master of JAVA
		 	C# Language and java
		 	Oracle and Java-JDBC
		 */
		
		
		String[] bae = {"java Programming",
						"easy Java Programming",
						"Master of JAVA",
						"C# Language and java",
						"Oracle and Java-JDBC"
						};
		
		
		
		int sw=0; // 순차검색
		for(int i=0; i<bae.length; i++) {
			//JAVA글자가 있으면 몇번째에 있는지 번째수가 나옴 그래서 있을경우 >=0 //indexOf에서는 없으면 무조건 -1 !=-1도 가능 
					// 대문자로 다 바꿔서		JAVA라는게 있는지 확인
			if(bae[i].toUpperCase().indexOf("JAVA")>=0) {
//				System.out.println(bae[i].toUpperCase().indexOf("JAVA"));
				System.out.println(bae[i]);
				sw=1;
			}//if_end
		}//for_end
		
		if(sw==0) {
			System.out.println("검색하신 책은 재고가 없습니다.");
		}
		
	}//main_end
}//class_end
