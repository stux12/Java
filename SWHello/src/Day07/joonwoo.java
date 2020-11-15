package Day07;

public class joonwoo {

	  public static void main(String[] args) {
	      // int []에 문자를 저장할경우 해당 문자의 아스키코드값이 저장이 된다.
		  int[] viras = {65, 'A', 'A', 'A'};
	     
		  // 그 값을 ++할경우 아스키코드의 값이 1증가된다.
	      viras[2]++;
	      
	      
	      for (int i = 0; i < viras.length; i++) {
	    	  					//03 = 0을 3개 출력한다는 의미다!
	    	  System.out.printf("%03d ", viras[i]);
	      }
	      
	      System.out.println("");
	      
	      for (int i = 0; i < viras.length; i++) {
	    	  					//c = 해당 문자를 출력할때 사용한다.
	         System.out.printf("%c ", viras[i]);
	      }
	   }
	  
}
