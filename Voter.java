
//Q.2) Create a class Voter(voterId, name, age) with parameterized constructor. 
//The parameterized constructor should throw a checked exception if age is less than 18.
//The message of exception is "invalid age for voter"

package com.demo.task.four;

public class Voter {
	int voterId;
	String name;
	int age;

	public Voter() {
	}

	public Voter(int voterId, String name, int age) throws InvalidAge {
		if (age < 18) {
			throw new InvalidAge("Invalid Age for Voting");
		}

		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		try {
			Voter voter = new Voter(1, "Arjun", 20);
			//Voter voter = new Voter(1, "Arjun", 5);
			
			System.out.println("Voter Created Seccessfully");
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}
	}
}

class InvalidAge extends Exception {

	public InvalidAge(String message) {
		super(message);
	}
}