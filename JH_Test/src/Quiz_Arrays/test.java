package Quiz_Arrays;

public class test {

	public static void main(String[] args) {
		
		 int[][] k = new int[5][3];
	      int n = 0;

	      for (int y = 0; y < 5; y++) {

	         if (y < 3) {
	            for (int x = 0; x <= y; x++) {

	               n++;

	               k[y][x] = n;
	               System.out.print(k[y][x]);
	            }
	            System.out.println();
	         } else {
	            for (int x = 0; x < 5 - y; x++) {

	               n++;
	               k[y][x] = n;

	               System.out.print(k[y][x]);
	            }
	            System.out.println();

	         }
	      }

	      for(int x=0; x<3; x++) {
	    	  for(int y=0; y<3; y++) {
	    		  System.out.print(k[y][x]);
	    	  }System.out.println();
	      }
	    	  
		
		
	}
}
