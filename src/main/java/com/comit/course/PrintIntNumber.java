
// Write a program in Java that prints an int number/float/ and show type conversion, for example 273, or 597.
package com.comit.course;

public class PrintIntNumber {
public static void main(String[] args)
{
	int a=100;
	char s= 'z';
	
	System.out.println(a);
	System.out.println(s);
	
	
	// Now, see the type conversion
	System.out.println((int)s);//it will display 122 (that is 7A in hex for letter lowercase 'z' in ASCII Code 
	
	
}
}
