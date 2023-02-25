package com.comit.course_04_strings;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// General Method
		char[] name = { 'G', 'O', 'P', 'A', 'L' };
		String str0 = new String(name);
		System.out.println(str0);

		/* Declare and initialize variable */
		String str1 = "Sharma";
		System.out.println(str1);

		// String size
		System.out.println(" The length of first string is :" + str0.length());
		System.out.println(" The length of second string is :" + str1.length());

		// String concatenation :- 
		// First Method
		String str2 = "My name is :"+ str0 +" " + str1;
		System.out.println(str2);
		// Second Method
		String str3 = str0.concat(str1);
		System.out.println(str3);
		
		
		// String trim method
		
	String str4 = "   I am awesome   ";
	System.out.println(str4);
	System.out.println("The string length before string trim is : " + str4.length());
		
		
		str4= str4.trim();
		System.out.println(str4);
		
		System.out.println("The string length before string trim is : " + str4.length());
		
		// How to grab a character from a given string
		System.out.println(str4.charAt(3));
		
		// grabbing a substring from a string
		// str4= I am awesome
		//index= 012345678910
		System.out.println(str4.substring(2));  //By giving the starting index
		
		System.out.println(str4.substring(2,9));
		
		
		/* Check if a string is a substring of another string or not
		 This command is case- sensitive*/
		System.out.println(str4.contains("am awesome"));
		
		// String compare
		String str5="Hello khan"; 
		System.out.println(str5.equals("hello khan"));  // this is case sensitive
		System.out.println(str5.equalsIgnoreCase("hello khan"));// this is not case sensitive
		
		
		// String replace
		System.out.println(str5);
		str5 = str5.replace("khan","pathan");
		System.out.println(str5);
	}
}
