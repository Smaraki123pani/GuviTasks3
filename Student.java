
//Q.1) Ramesh is developing a student management system for a university. 
//In this system, you have a Student class to represent student information. 
//You are asked to help Ramesh to handle exception which can be occurred into program according to following Scenarios:
//a) class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
//b) If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
//c) If a name contains numbers or special symbols, raise exception "NameNotValidException". Define the two exception classes.

package com.demo.task.four;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;

	public Student(int rollNo, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		super();
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
		}

		if (!isValidName(name)) {
			throw new NameNotValidException("Name contains numbers or special symbols.");
		}

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	private boolean isValidName(String name) {
		return name.matches("[a-zA-Z ]+");
	}

	public static void main(String[] args) {
		try {
			Student student1 = new Student(1, "John Doe", 18, "Computer Science");
		//Student student1 = new Student(1, "John Doe", 12, "Computer Science");
			System.out.println("Student created successfully");

			Student student2 = new Student(2, "Ram123", 20, "Mathematics");
			
		} catch (AgeNotWithinRangeException e) {
			System.out.println("Error creating student: " + e.getMessage());

		} catch (NameNotValidException e) {
			System.out.println("Error creating student: " + e.getMessage());
		}
	}

	private String getName() {
		return null;
	}
}

class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}

class NameNotValidException extends Exception {
	public NameNotValidException(String message) {
		super(message);
	}
}