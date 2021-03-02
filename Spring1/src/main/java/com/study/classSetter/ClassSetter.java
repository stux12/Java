package com.study.classSetter;

import com.study.insa.Insa2;

public class ClassSetter {
	private Insa2 insa2;

	public Insa2 getInsa() {
		return insa2;
	}

	public void setInsa(Insa2 insa) {
		this.insa2 = insa;
	}
	
	public String kajaHello(String str1) {
		return insa2.insaGo(str1);
	}
	
}
