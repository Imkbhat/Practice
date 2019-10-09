package com.kiran.java8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollectionBasedOnEvanNum {

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>();
		
	intArr.add(5);
	intArr.add(10);
	intArr.add(20);
	intArr.add(30);
	intArr.add(45);
	
	//If we want to filter the data based on some condition
	// we can go for filter
	intArr.stream().filter(i-> i%2==0).collect(Collectors.toList()).forEach(System.out::println);
	System.out.println("======================= Increase 5 for every elements whoose value > 10");
	intArr.stream().filter(i-> i>=10).map(i-> i+5).collect(Collectors.toList()).forEach(System.out::println);
	
	}

}
