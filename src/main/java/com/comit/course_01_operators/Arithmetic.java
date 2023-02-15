package com.comit.course_01_operators;

public class Arithmetic {

	public static void main(String[] args) {
		int a= 8;
		int b= 3;
		int c= 5;
		int d=11;
		
		int sum = a+b;// addition
		int sub = a-b;//Subtraction
		double div = (double)a/b;//Division
		int mul = a*b;//Multiplication 
		
		System.out.println("Addition:" + sum);
		System.out.println("Subtraction:" + sub);
		System.out.println("Division:" + div);
		System.out.println("Multiplication:" + mul);
		
		int mod = a%b; //Division remainder
		System.out.println("Modulous :" + mod);
		
		int exp = (a+c)*b/d;  // Always use parenthesis
		System.out.println("Expression : "+ exp);
		
		
		
		

	}

}
