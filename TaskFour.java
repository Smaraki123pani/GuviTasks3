
//Q4) Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers). 
//Create methods to add a new student, remove a student, and Display up a student's grade by name.

package com.demo.task.four;

import java.util.HashMap;
import java.util.Map;

public class TaskFour {

	Map<String, Integer> map = new HashMap<>();

	public void addStudent(String name, int grade) {
		map.put(name, grade);
	}

	public void removeStudent(String name) {
		map.remove(name);
	}

	public void displayGrade(String name) {
		Integer grade = map.get(name);
		System.out.println("Grade of " + name + ":- " + grade);
	}

	public static void main(String[] args) {
		TaskFour student = new TaskFour();

		student.addStudent("John", 9);
		student.addStudent("Ram", 8);
		student.addStudent("Hari", 7);
		student.addStudent("Sam", 8);
		student.addStudent("Alam", 10);

		student.displayGrade("John");
		student.displayGrade("Ram");
		student.displayGrade("Hari");
		student.displayGrade("Sam");
		student.displayGrade("Alam");
		System.out.println("--------------------------------");

		student.removeStudent("Sam");
		System.out.println("'Sam' Removed...............");

		student.addStudent("Arjun", 9);
		System.out.println("'Arjun' Added...............");
		System.out.println("--------------------------------");

		System.out.println("Final Outcome:");
		student.displayGrade("John");
		student.displayGrade("Ram");
		student.displayGrade("Hari");
		student.displayGrade("Alam");
		student.displayGrade("Arjun");
	}

}
