package com.kiran.java8.venkat;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		
		
		//Intermediate Operations:
		//Using Filter
		
		List<String> names = Arrays.asList("Kiran", "Bhat", "Engineer");
		List<String> containNames = names
				.stream()
				.filter(s->s.startsWith("K"))
				.collect(Collectors.toList());
		
		System.out.println(containNames);
		
		//========================================================
		//Using Map
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 6, 8, 10);
		List<Integer> containNums = nums
				.stream()
				.map(s->s*s)
				.collect(Collectors.toList());
		
		System.out.println(containNums);
		
		//=========================================================
		//Using Sorted
		
		List<String> sortedNames =
				names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedNames);
	
	  //==============================================================
	  //Terminal Operations:
	  // Using  collect
		Set squares = nums.stream().map(x->x*x).collect(Collectors.toSet());
		
		System.out.println(squares);
	
		
	 //=================================================================
	 //Using reduce
	  
	 int evan = nums.stream().filter(x -> x%2 == 0).reduce(0,(ans,i) -> ans+i);
	 System.out.println(evan);
		
	//===================================================================
	//forEach
	 nums.stream().forEach(System.out::print);
	}

}
