package com.kiran.java8.venkat.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
	
	public enum Genders {
		MALE, FEMALE, OTHERS
	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Kiran", Genders.MALE, 12));
		persons.add(new Person("Karthik", Genders.MALE, 16));
		persons.add(new Person("Karan", Genders.MALE, 17));
		persons.add(new Person("Kumari", Genders.FEMALE, 18));
		persons.add(new Person("Pooja", Genders.FEMALE, 19));
		
		
		
		List<String> persons2 =
				persons
				.stream()
				.filter(person -> person.getAge() > 18)
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
				System.out.println(persons2);
	}

}
