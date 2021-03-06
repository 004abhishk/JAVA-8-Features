package com.javatutorials.java8lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstExerciseLambdaSolution {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Abhishek", "Ojha", 10),
				new Person("Akshay", "Kumar", 12),
				new Person("Sachin", "Tendulkar", 12)
				);
		
		// Step 1 - Sort list by Last Name		
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		// Step 2 - Create a method that prints all the elements of the list
		printAll(people);
		
		// Step 3 - Create a method that prints all the elements of the list which has 
		//last name beginning with O
		printLastNameFilter(people);
	}

	private static void printAll(List<Person> people) {
		System.out.println("Printing all person using Lambda...");
		for(Person p : people) {
			System.out.println(p);
		}	
	}

	private static void printLastNameFilter(List<Person> people) {
		System.out.println("Printing all person as per last name filter using Lambda...");
		for(Person p : people) {
			if(p.getLastName().startsWith("O")) {
				System.out.println(p);
			}
		}
	}

}
