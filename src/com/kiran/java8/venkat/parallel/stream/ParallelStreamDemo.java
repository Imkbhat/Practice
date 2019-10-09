package com.kiran.java8.venkat.parallel.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long t1,t2;
		List<Employee> empList = Arrays.asList(
				new Employee("A", 10000),
				new Employee("B", 20000),
				new Employee("C", 30000),
				new Employee("D", 40000),
				new Employee("E", 5000)
				);
 		
		t1 = System.currentTimeMillis();
		System.out.println("Performing Sequential Stream " +empList.stream().filter(e -> e.getSalary() > 15000).count());
		t2 = System.currentTimeMillis();
		System.out.println("Total time taken to Execute Sequential Stream = "+ (t2-t1) + "\n");
		
		t1= System.currentTimeMillis();
		System.out.println("Performing Parallel Stream "+ empList.parallelStream().filter(e -> e.getSalary() > 15000).count());
		System.out.println("Total time taken to Execute Parallel Stream= "+ (t2-t1) + "\n");
		
	}

}
