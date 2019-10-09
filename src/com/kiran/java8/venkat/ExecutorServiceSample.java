package com.kiran.java8.venkat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorServiceSample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		/*
		 * for (int i=0; i<10; i++) { 
		 * final int index = i; 
		 * service.submit(() ->
		 * System.out.println("Executing "+index)); }
		 */
		
		//In Java 8
		IntStream.range(0, 10)
		.forEach(i -> {
			service.submit(()->System.out.println("Executing "+i));
		});
		
		
		System.out.println("Main thread has started Successfully.");
		service.shutdown();
	}

}
