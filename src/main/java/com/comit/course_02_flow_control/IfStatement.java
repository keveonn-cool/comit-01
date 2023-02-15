package com.comit.course_02_flow_control;

public class IfStatement {
	public static void main(String[] args) {
		int a = 20;
		int b = 20;

		// Scenario 1
		if (a > b) {
			System.out.println("a is greater than b");
		} else if (a < b) {
			System.out.println(" a is less than b");
		} else {
			System.out.println(" a is equal to b");
		}

		// 2nd Scenario
		if (a > b) {
			System.out.println("a is greater than b");
		}
		if (a < b) {
			System.out.println(" a is less than b");
		}
		if (a == b) {
			System.out.println(" a is equal to b");
		}

		// 3rd Scenario --nested if

		int c = 25;
		if (a > b) {
			if (a < c) {

			}
		}
		
		
		String str;
		a=10;
		b=15;
		if(a>b)
		{ 
			str = "a is greater than b";
			
		}
		else
		{
			str = "a is less than b";
		}
		
		// Ternary Operator
		str = (a>b)? "a is greater than b" : "a is less than b";
		System.out.println(str);
		
		
	}

}
