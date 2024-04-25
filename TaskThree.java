
//Q3) Store name of weekdays in an array (starting from "Sunday" at 0 index). 
//Ask day position from user and print day name. 
//Handle array index out of bound exception and give proper message if user enters day index outside range (0-6).

package com.demo.task.four;

import java.util.Scanner;

public class TaskThree {
	public static void main(String[] args) {
		
	
	String[] day=new String[7];
	day[0]="Sunday";
	day[1]="Monday";
	day[2]="Tuesday";
	day[3]="Wednuseday";
	day[4]="Thursday";
	day[5]="Friday";
	day[6]="Saturday";
	
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter day position:");
	int a=sc.nextInt();
	
	try {
		String dayname=day[a];
		System.out.println(a + "-"+dayname);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound. Please enter a number between 0-6");
	}
	
	sc.close();
			
	}
}
