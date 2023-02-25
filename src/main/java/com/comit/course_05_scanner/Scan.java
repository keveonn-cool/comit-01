package com.comit.course_05_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// Taking inputs from users
		System.out.println("Enter an Integer :");
		int i = scan.nextInt();
		
		
		System.out.println("Enter a double value : ");
		double d = scan.nextDouble();
		
		scan.nextLine(); // to clean the buffer , read the return key
		
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		
		
		
		// displaying inputs taken from user
		System.out.println("Your entered integer input is :  " + i);
		System.out.println("Your entered double input is :  " + d);
		System.out.println("Your entered String is :  " + str);
		
			
		
		
		scan.close();

	}

}
