package com.kiran.designpatterns.breaksingleton;

import com.kiran.designpatterns.CloneSingleton;

public class CloneSingletonBreak {

	public static void main(String[] args) {
		CloneSingleton singleton = CloneSingleton.singleton;
		
		try {
		CloneSingleton singleton2 = (CloneSingleton)singleton.clone();
		System.out.println(singleton);
		System.out.println(singleton2);
		System.out.println(singleton.equals(singleton2));
		}  catch(Exception ex) {
			
		}
	}

}
