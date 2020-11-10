package mybang5;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		
		/*
		 <검색의 종류>
		 1. 순차검색 (sequence search)
		 	ex) 100명이라고 치고 (1 + 100)/2 = 평균 50번 ==> (n+1)/2
		 
		 2. 이진검색 (binary search) - 오름차순일때 밖에 못씀
		 	ex) log2N+1 => log 10 N - 10의 몇제곱을하면 N이 나오는지 엄청 큰 수를 줄이기 위해서 사용함!!!!!!!
		 		log2 100 = x  => 2^x=100 => 2^6=64 < 2^x=100 < 2^7=128 => 6.x번인데 공식이 +1이니 평균 7번
		 		
		 3. 피보나치검색 (fibonacci search)
		 	ex) 1	1	2	3	5	8	13	21	34	55	89	143	232
 		 */
		
//		순차검색
		int [] ar = {11,84,45,78,34,9,2};
		int sw=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==78) {
				System.out.println("0번째 부터 시작하여 "+i+" 번째에 있어용~~");
				sw=1;
			}
		}
		if(sw==0){
			System.out.println("뭐야 없어!!");
		}
		
//		이진검색
		int [] arr = {11, 84, 45, 78, 34, 9, 2};
		// 2	9	11	34	45	78	84
		Arrays.sort(arr);
		
		if(Arrays.binarySearch(arr, 78)>=0) {
			System.out.println("있네용~");
			System.out.println("78은"+Arrays.binarySearch(arr, 78)+"번째에 있어용~~");
		}
		else {
			System.out.println("없네용~");
		}
		
		
		
		
		
		
		
		
	}
}
