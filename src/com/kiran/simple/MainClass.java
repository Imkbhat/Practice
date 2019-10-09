package com.kiran.simple;

public class MainClass {
	
	public interface B {
		
		public int methodB(int a);

	}
	
	static class A implements B {

		@Override
		public int methodB(int a) {
			return a += a*a; //  a= a+b
			//a =+ a*a -> a = +(a*a); 
		}
		
	}
	
	public static void main(String[] args) {
		B b = new A();
		System.out.println(b.methodB(2));
	}

}
