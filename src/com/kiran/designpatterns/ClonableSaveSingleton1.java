package com.kiran.designpatterns;

public class ClonableSaveSingleton1 extends SuperClass {
	
	public static ClonableSaveSingleton1 singleton = new ClonableSaveSingleton1();
	
	private ClonableSaveSingleton1() {

	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
