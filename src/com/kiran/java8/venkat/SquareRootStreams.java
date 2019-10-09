package com.kiran.java8.venkat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareRootStreams {
	
	public static boolean isPrime(int number) {
		System.out.println("Calling");
		return number >1 && IntStream.range(2, number)
				.noneMatch(i -> number%i == 0 );
	}
	
	public static List<Double> squareRootof100Elements() {
		List<Double> streamSquare = 
		Stream.iterate(1, e -> e + 1)
				.filter(SquareRootStreams::isPrime)
				.map(Math::sqrt)
				.limit(100)
				.collect(Collectors.toList());
		
		return streamSquare;
	}

	public static void main(String[] args) {
		squareRootof100Elements();
	}

}
