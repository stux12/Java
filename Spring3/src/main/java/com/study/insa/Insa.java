package com.study.insa;


public class Insa {
	
	private String name;
	
		
	public Insa(String name) {
		this.name = name;
	}

	
	public String insaGo(String str1) {
		return this.name+"님\n"+str1;
	}
}
