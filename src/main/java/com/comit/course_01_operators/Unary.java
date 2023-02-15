package com.comit.course_01_operators;

public class Unary {

	public static void main(String[] args) 
	{
		int a=5;
		// a++ adds 1 to a
		int b = a++; // Post Increment Operator
		System.out.println("Post Increment");
		System.out.println("a: "+ a);
		System.out.println("b: " +b);
		
		
		a=5; // No need to initialize a and b again
		// a++ adds 1 to a
		b = ++a; // Pre Increment Operator
		
		System.out.println("Pre Increment");
		System.out.println("a: "+ a);
		System.out.println("b: " +b);
		
		
		a=5;
		// a-- subtracts 1 from a
	    b = a--; // Post decrement Operator
		System.out.println("Post deccrement");
		System.out.println("a: "+ a);
		System.out.println("b: " +b);
		
		
		a=5; // No need to initialize a and b again
		// a-- subtracts 1 from a
		b = --a; // Pre decrement Operator
		
		System.out.println("Pre decrement");
		System.out.println("a: "+ a);
		System.out.println("b: " +b);
		
	}

}
