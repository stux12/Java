package test;

public class clock {

	public static void main(String[] args) {
		//[1] 준비
        int A[][] = new int[6][6]; //배열의 방을 1~5번 방을 사용할것이므로 배열방크기를 6으로 준다.
                                   //Java언어는 배열의 인덱스가 0부터 시작, 그래서 배열의 크기를 한칸 더잡은것이다.
        int CENTER = (int) 5/2 +1; //3 기준행.
        int K=0; //출력할값을 담은 변수
        int BEGIN = 0; //열의 시작위치
        int END = 6; //열의 끝 위치
       
        //[2] 처리
        for(int ROW=1;ROW<=5;ROW++){           
           
            if(ROW<=CENTER){ //기준행보다 작거나 같은 행일때.
                BEGIN = ROW;
                END = 6 - ROW;
            }else{
                BEGIN = 6 - ROW;
                END = ROW;
                       
            }
            for(int COL=BEGIN;COL<=END;COL++){             
                K = K+1;
                A[ROW][COL] = K;
            }              
        }      
       
        //[3] 출력
        for(int i = 1; i<A.length;i++){        
            for(int j =1; j< A[i].length;j++){
                if(A[i][j] == 0) {
                    System.out.print("\t");
                }else{
                    System.out.print(A[i][j]+"\t");
                }              
            }
            System.out.println();
        }


	}

}
