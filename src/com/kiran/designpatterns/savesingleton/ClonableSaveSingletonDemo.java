package com.kiran.designpatterns.savesingleton;

import com.kiran.designpatterns.ClonableSaveSingleton1;

public class ClonableSaveSingletonDemo {
	
	public static void main(String[] args) {
		ClonableSaveSingleton1 singleton = ClonableSaveSingleton1.singleton;
		
		try {
			ClonableSaveSingleton1 singleton2 = (ClonableSaveSingleton1)singleton.clone();
			System.out.println(singleton);
			System.out.println(singleton2);
			System.out.println(singleton.equals(singleton2));
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
