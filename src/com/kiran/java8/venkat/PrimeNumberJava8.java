package com.kiran.java8.venkat;

import java.util.stream.IntStream;

public class PrimeNumberJava8 {
	
	public static boolean isPrime(int number) {
		return number >1 && IntStream.range(2, number)
				.noneMatch(i -> number%i == 0 );
	}

	public static void main(String[] args) {
		boolean returnedVal = isPrime(6);
		System.out.println(returnedVal);
	}

}
