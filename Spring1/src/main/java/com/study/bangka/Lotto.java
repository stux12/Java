package com.study.bangka;

public class Lotto {

	public void GoGo(){
		System.out.println("로또 너 나와");
		int[] number = new int[6];
		for(int i=0; i<number.length; i++) {
			number[i] = (int)Math.round(Math.random()*45);
			for(int j=0; j<i; j++) {
				if(number[i]==number[j]) {
					i--;
				}else {
					
				}
			}
			System.out.println(number[i]);
		}
	}

}
