package com.kiran.java8.venkat.streams;

import com.kiran.java8.venkat.streams.PersonDemo.Genders;

public class Person {
	
	String name;
	Genders gender;
	Integer age;
	
	public Person(String name, Genders male, Integer age) {
		this.name = name;
		this.gender = male;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genders getGender() {
		return gender;
	}

	public void setGender(Genders gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
