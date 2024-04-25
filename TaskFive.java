
//Q5) Create a stack data structure to store Integers.
//Create some methods for following functionalities:
//a) Include functions for pushing elements onto the stack.
//b) popping elements from the stack.
//c) Checking if the stack is empty.

package com.demo.task.four;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class TaskFive {
	List<Integer> list = new Stack();

	public void pushElement(int element) {
		list.add(element);
	}

	public int popElement() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return list.remove(list.size() - 1);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {
		TaskFive stack = new TaskFive();
		
		stack.pushElement(5);
		stack.pushElement(100);

		System.out.println("Popping Elements");
		stack.pushElement(20);
		System.out.println(stack.popElement());
		
		stack.pushElement(77);
		System.out.println(stack.popElement());
		
		stack.pushElement(56);
		System.out.println(stack.popElement());
		
		stack.pushElement(13);
		System.out.println(stack.popElement());

		
		System.out.println("Checking if the stack is empty?");
		System.out.println(stack.isEmpty());
	}

}
