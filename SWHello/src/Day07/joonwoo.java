package Day07;

public class joonwoo {

	  public static void main(String[] args) {
	      int[] viras = {'A', 'A', 'A', 'A'};
	      
	      viras[2]++;
	      
	      for (int i = 0; i < viras.length; i++) {
	         System.out.printf("%03d ", viras[i]);
	      }
	      
	      System.out.println("");
	      
	      for (int i = 0; i < viras.length; i++) {
	         System.out.printf("%c ", viras[i]);
	      }
	   }
	  
}
