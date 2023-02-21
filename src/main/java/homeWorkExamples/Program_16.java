package homeWorkExamples;

import java.util.Scanner;

public class Program_16 {

	public static void main(String[] args) {
		/*
		 * Write a program in Java that reads an integer from the keyboard and makes the
		 * sum of the next 100 numbers, showing the result on screen.
		 */

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the required number : ");
		int num = myObj.nextInt(); // taking input from user

		// Sum of next 100 numbers including the given number

		int nextInteger = num + 1; //for first method

		int secondMethod = num + 1;// for 2nd method

		for (int i = 1; i <= 100; i++) {
			num += nextInteger;
			nextInteger++;

		}
		System.out.println("The Sum of next 100 number including the entered number is:" + num);

		// Sum of next 100 numbers including the given number

		int sum = secondMethod + 1;
		for (int j = 1; j < 100; j++) {
			secondMethod = secondMethod + sum;
			sum++;
			
			
		}
		System.out.println("The Sum of next 100 number excluding the entered number is:" + secondMethod);
		myObj.close();   // Closing the scanner class
	}

}
