package Day11_13;

import java.util.Date;

public class LiveDate {

	public static void main(String[] args) {

		/*
		 * Q) 살아온 날짜 수 계산하기
		 */
		// 기준점 = 1970. 1. 1. 9:00:00가 기준점인데 9시로 나오는 이유 = 영국의 그리니치 천문대를 기준으로 9시간 빨라서
		Date d100 = new Date(); // 1000L = 1초를 1000m/s로 한것 1000m/s=1초
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
		Date mybirthday = new Date(1997 - 1900, 9 - 1, 17);
		// 이때 값을 넣으면 window 기준으로 인해 1900이 더해진 상태로 나오기 때문에 1900을빼고 -1월을 해줘야하는것
		// get으로 값을 가져올경우에는 window기준 1900이 빠진상태이기 때문에 1900을 더하고 +1월을 해주는것임

		// 내가 살아온 날짜 수 계산하는 방법 : 현재시간 - 내생일 = 살아온날
		// .getTime이 년월일시분초를 1000m/s단위로 쪼개버린것!!
		mybirthday.getTime(); // 내 생일을 쪼개고
		d0.getTime(); // 현재시간을 쪼개고
		System.out.println(mybirthday.getTime());
		// 값이너무크니 long
		long cha = d0.getTime() - mybirthday.getTime();
		long nal = cha / 1000 / 60 / 60 / 24;
		// 초 분 시간 일
		// .getTime은 1000m/s(=1초)로 쪼개지기 때문에 초로 바꿀때는 /1000
		System.out.println(nal + "일 살아왔습니다");

	}
}
