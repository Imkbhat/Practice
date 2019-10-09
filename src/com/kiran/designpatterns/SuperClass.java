package com.kiran.designpatterns;

public class SuperClass implements Cloneable {
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
