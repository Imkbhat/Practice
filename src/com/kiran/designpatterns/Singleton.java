package com.kiran.designpatterns;

public class Singleton {
	public static Singleton singleton = null;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if(null == singleton ) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
