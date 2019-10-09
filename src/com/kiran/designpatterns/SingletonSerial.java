package com.kiran.designpatterns;

import java.io.Serializable;

public class SingletonSerial implements Serializable {
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	private static SingletonSerial singleton = null;
	
	private SingletonSerial() {};
	
	public static SingletonSerial getInstance() {
		if(null == singleton ) {
			singleton = new SingletonSerial();
		}
		return singleton;
	}
}
