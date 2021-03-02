package com.study.classSetter;

import com.study.client.Client2;

public class ClassSetter2 {
	private Client2 client2;

	public void setClient2(Client2 client2) {
		this.client2 = client2;
	}
	
	public String ClientView() {
		return client2.View();
	}
	public void ClientHobby() {
		client2.Hobby();
	}
	
}
