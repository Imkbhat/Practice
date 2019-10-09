package com.kiran.java8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddFiveToEveryElementInMap {

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(5);
		intArr.add(10);
		intArr.add(20);
		intArr.add(30);
		intArr.add(45);
		
		
		//If we want to alter the data/to  perform some operation on each element
		// we can go for map
		intArr.stream().map(i -> i+5).collect(Collectors.toList()).forEach(System.out::println);
	}

}
