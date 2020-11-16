package Quiz_yongsuhem;

import java.util.Scanner;

public class Quiz01 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] apart = new int [3][5];
		int money = 0;
		
		int cng1 = 0;
		int cng2 = 0;
		int cng3 = 0;
		int jun = 0;
		
		for(int i=0; i<apart.length; i++) {
			for(int j=0; j<apart[i].length; j++) {
				System.out.println((i+1)+"0"+(j+1)+"호의 관리비를 입력하세요 >");
				apart[i][j] = Integer.valueOf(sc.next());
				money += apart[i][j];
				if(i==0) {
				cng1 += apart[0][j];
				}
				else if(i==1){
					cng2 += apart[1][j];
				}
				else{
					cng3 += apart[2][j];
				}
			}
		}
		
		jun = money/15;
		
		for(int i=0; i<apart.length; i++) {
			for(int j=0; j<apart[i].length; j++) {
				System.out.print((i+1)+"0"+(j+1)+"호\t");
			}	
		}
		System.out.println();
		System.out.println("1층의 관리비 평균 :"+cng1/5);
		System.out.println("2층의 관리비 평균 :"+cng2/5);
		System.out.println("3층의 관리비 평균 :"+cng3/5);
		System.out.println();
		System.out.println("전체 관리비 평균 :"+jun);
		for(int i=0; i<apart.length; i++) {
			for(int j=0; j<apart[i].length; j++) {
				if(jun>=Integer.valueOf(apart[i][j])) {
					System.out.println("전체관리비 평균보다 적게 사용한 호수 > "+(i+1)+"0"+(j+1)+"호");
				}
			}
		}
		
		System.out.println();
		int imsi = apart[0][2];
		apart[0][2] = apart[1][2];
		apart[1][2] = imsi;
		System.out.println("103호와 203호 관리비가 바꼈습니다");
		
		System.out.println();
	}
}
