package com.kiran.designpatterns.breaksingleton;

import java.lang.reflect.Constructor;

import com.kiran.designpatterns.Singleton;

public class ReflectionMechanism {
	
	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = null;
		
		try {
		Constructor[] cons = Singleton.class.getDeclaredConstructors();
		for (Constructor con : cons) {
			con.setAccessible(true);
			singleton2 = (Singleton) con.newInstance();
		}
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		System.out.println(singleton1.equals(singleton2));
		
		
		}catch(Exception ex) {
			
		}
	}
}
