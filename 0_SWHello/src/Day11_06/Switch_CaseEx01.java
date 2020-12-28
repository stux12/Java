package Day11_06;

public class Switch_CaseEx01 {

	public static void main(String[] args) {

		int a = 100 / 10;

//		if (a>=90) {
//			System.out.println("A");
//		}else if(a>=80) {
//			System.out.println("B");
//		}else if(a>=70) {
//			System.out.println("C");
//		}else if(a>=60) {
//			System.out.println("D");
//		}else
//			System.out.println("F");

//		switch문으로 바꾸기

		switch (a) {
		case 10:
//			System.out.println("A");
//			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("F");

		}

	}
}
