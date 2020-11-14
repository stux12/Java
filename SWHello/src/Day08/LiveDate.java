package Day08;

import java.util.Date;

public class LiveDate {

	public static void main(String[] args) {
		
		/*
		 Q) 살아온 날짜 수 계산하기
		 */
		// 기준점 = 1970. 1. 1. 9:00:00가 기준점인데 9시로 나오는 이유 = 영국의 그리니치 천문대를 기준으로 9시간 빨라서
		Date d100 = new Date(1000L); // 1000L = 1초를 1000m/s로 한것 1000m/s=1초
		System.out.println(d100);
		System.out.println(d100.toLocaleString());
		System.out.println(d100.toGMTString()); // 그리니치천문대 시간으로 나오기 때문에 00:00:00으로 나옴
							// 얘를 기준으로 잡아야 여러나라에서도 시차가 적용됨
			
		// 지금 현재 시간
		Date d0 = new Date();
		System.out.println(d0);
		
		// 내 생일 날짜
//		Date mybirthday = new Date(년, 월, 일, 시, 분, 초);
//		Date mybirthday = new Date(년, 월, 일);
		Date mybirthday = new Date(1997-1900, 9-1, 17);
		
		
		//.getTime이 년월일시분초를 1000m/s단위로 쪼개버린것!!
		mybirthday.getTime();
		d0.getTime();
		//값이너무크니 long								
		long cha = d0.getTime()-mybirthday.getTime();
		long nal = cha/1000/60/	60/	24;
					//	초	분	시간	일
		//몇일을 살았는지를 구하기 위해서 1000m/s=1초
		System.out.println(nal+"일 살아왔습니다");
		
		
		
	}
}
