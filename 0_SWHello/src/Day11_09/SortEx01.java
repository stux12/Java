package Day11_09;

import java.util.Arrays;

public class SortEx01 {

	public static void main(String[] args) {
		/*
		 * 다음배열을 소트하여 오름차순 및 내림차순으로 출력하시오. sort : key(기준), 차순(오름차순(ascending),
		 * 내림차순(descanding)) 내부 sort(memory sort): radix, selection, bubble, insertion,
		 * quick, shell... 외부 sort : disk(2-way merge sort, k-way..)
		 */

//		int [] bae = {10,90,100,60,70};
//		
//		Arrays.sort(bae); // 오름차순
//		
//		for(int i=0; i<bae.length; i++) {
//			System.out.print(bae[i]+"\t");
//		}
//		System.out.println();

		/* 찍을때 반대로찍으면 내림차순임 내림차순으로 하는 sort는 없음!! */
//		for(int i=bae.length-1; i>=0; i--) {
//			System.out.print(bae[i]+"\t");
//		}
//		System.out.println();

		/* sort를 안쓰고 배열정리 하는방법 */

		int[] k = { 10, 90, 100, 60, 70, 23 };

		int imsi;
		for (int i = 0; i < k.length - 1; i++) {
			int sw = 0;
			for (int j = 0; j < k.length - 1 - i; j++) { // -i를 해준 이유는 비교할때 마지막꺼 하나는 순차적으로 비교를 안해도 되니까!!
				if (k[j] < k[j + 1]) {
					imsi = k[j];
					k[j] = k[j + 1];
					k[j + 1] = imsi;
					sw = 1;
				}
			}
			if (sw == 0) { // switch를 하나 넣어서 비교를해서 값을 변경했으면 넘어가고 변경안했으면 멈추게 하기!!
				break;
			}

		}

		System.out.println(Arrays.toString(k)); // k배열 전체 다 순서대로 출력

	}

}
