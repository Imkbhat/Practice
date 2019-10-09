package com.kiran.java8.venkat;

public class SquareItFunctionalIf {

	public static void main(String[] args) {
		FunctionalIf iF = ((a,b) -> {
			return a+b;
		});
		System.out.println(iF.add(3, 5));
	}
}
