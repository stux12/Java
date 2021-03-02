package com.study.insa;

public class InsaConClass {

	private InsaCon insaCon;

	public InsaConClass(InsaCon insaCon) {
		this.insaCon = insaCon;
	}
	
	public InsaConClass() {
	}
	
	public String insa() {
		return insaCon.toString();
	}
	
}
