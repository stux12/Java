package test2;

public class test2 {

   public static void main(String[] args) {
      
    
	   int count=0;
	   
	   a:for(int i=0; i<10; i++) {
		   while(i<10) {
			   if(i==3) {
				  continue;
			   }
			   else if(i==8) {
				   break a;
			   }
			   else {
				   count++;
			   }
		   }
	   }
      
      
   }
}
