package Day01;

public class Exam04 {

	public static void main(String[] args) {
		
		String ppp = null;
		String qqq = "";
//		System.out.println(ppp.length()>0); - null pointer error
// 		System.out.println(qqq.length()>0);
		
		String aa = "ondal";
		String bb = "ondal";
		String cc = new String ("ondal");
		String dd = new String ("ondal");
		
		System.out.println(aa==bb);
		System.out.println(aa==cc);
		System.out.println(aa.equals(bb));
		System.out.println(aa.equals(cc));
		System.out.println(cc==dd);
		

		
		
		
		
	}
}
