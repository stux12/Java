package com.study.insa;

public class Insa {
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	


	public String insaGo(String str1) {
		return this.name+"님\n"+str1+"\n나이는"+age+"이군요";
	}
	
}
