package com.kiran.java8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {

	public static void main(String[] args) {
		
List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(60);
		intArr.add(40);
		intArr.add(30);
		intArr.add(20);
		intArr.add(25);
		
		//Sorted in natural sorting order
		intArr.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("====================================");
		//Descending order(using comparator Object)
		intArr.stream().sorted((i1,i2) -> (i1<i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("====================================");
		
		//Descending order onne more
		intArr.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
