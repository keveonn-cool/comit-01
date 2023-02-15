package com.comit.course_01_operators;

public class Logical {
	public static void main(String[] args)
	{
		boolean a= true;
		boolean b = false;
		
		boolean and = a && b;  // returns true only when both operators are true
		boolean or = a || b;  // returns true if any one or  both operators are true
		boolean not  = !a;  // returns the opposite 
		
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
	}

}
