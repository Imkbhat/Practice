package com.kiran.java8.venkat;

@FunctionalInterface
public interface FunctionalIf {

	public int add(int a, int b);
	
	public static void sayHello() {
		System.out.println("Hello From Functional I/F");
	}
	
	public static void sayHello1() {
		System.out.println("Hello1 From Functional I/F");
	}
	
	public default int sub(int a, int b) {
		return a-b;
	}
}
