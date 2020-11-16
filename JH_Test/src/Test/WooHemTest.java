package Test;

import java.util.Scanner;

public class WooHemTest {

	public static void main(String[] args) {
	
	      // -----
	      /*
	       * 예상글자입력: a---- 1번시도 예상글자입력: b---- 2번시도 예상글자입력:
	       */
	      // string, 반복문, 빠져나오기

	      System.out.println("_ _ _ _ _");
	      System.out.print("예상글자입력:");
	      Scanner sc = new Scanner(System.in);
	      char[] A = { 'A', 'p', 'p', 'l', 'e' };
	      char[] B = { '_', '_', '_', '_', '_' };
	      int count=0;
	      int count2=0; // 정답일때 나오기 위해
	      int sw=0;
	      while (sw==0) {
	         char key = sc.next().charAt(0);
	         for (int i = 0; i < A.length; i++) {
	            count++;
	         
	            if (A[i] == key) {
	               B[i] = key;
	               
	            }
	            
	   	         if(A[i] == B[i]) {
	   	        	 if(B[i] != key) {
	   	        		 count2++;
	   	        	 }
	   	            }
	   	          if(count2==5) {
	   	        	  sw=1;
	   	          }
	            
	               
	         }//for_end
	       
	         
	         System.out.println(B);
	         
	         }

		
		
		
		
	}
	
}
