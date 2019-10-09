package com.kiran.designpatterns;

import java.io.Serializable;

public class SerialReadResolveSingleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static SerialReadResolveSingleton singleton = new SerialReadResolveSingleton();
	
	private SerialReadResolveSingleton() {

	}
	
    protected Object readResolve() { 
        return singleton; 
    } 

}
