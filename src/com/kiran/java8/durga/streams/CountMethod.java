package com.kiran.java8.durga.streams;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(60);
		intArr.add(40);
		intArr.add(30);
		intArr.add(20);
		intArr.add(25);
		
		//Returns how many elements in the collection after Filter.
		long count = intArr.stream().filter(i -> i<35).count();
		System.out.println(count);
	}

}
