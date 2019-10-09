package com.kiran.java8.venkat;

import java.util.*;
import java.util.function.*;

public class ForEachWithConsumer {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);

		//Consumer is an  anonymous inner class
		intList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer val) {
				System.out.println(val);
			}
		});
		
		//Using lambda, code has reduced to one line
		intList.forEach(i -> System.out.println(i));
	}

}
