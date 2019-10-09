package com.kiran.java8.venkat.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonComparatorDemo {
	
	public static void printSorted(List<Person> personList, 
			Comparator<Person> comparator ) {
		personList
		.stream()
		.sorted()
		.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("bob", 12));
		personList.add(new Person("sara", 12));
		personList.add(new Person("Kiran", 28));
		personList.add(new Person("Sachin", 29));
		
		printSorted(personList, Comparator.comparing(Person::getAge).thenComparing(Person::getName));
		
	}

}
