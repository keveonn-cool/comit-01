package homeWorkExamples;

import java.util.Scanner;

public class Program_17 {

	public static void main(String[] args) {
		/*
		 * Write a program in Java that converts from Canadian dollars to US dollars.
		 * You will receive a decimal number corresponding to the amount in CAD and will
		 * answer with the corresponding amount in US dollars. Take the quotation of the
		 * dollar today.
		 */

		// quote for today - 1 Canadian Dollar equals 0.74 United States

		Scanner cad = new Scanner(System.in); // create a object cad
		System.out.println("Enter the amount of Canadian Dollars : ");
		double cadDollars = cad.nextDouble(); // taking the input from user

		System.out.println("your entered Cad dollars are :" + cadDollars);

		double usDollars = cadDollars * 0.74;

		System.out.println("The converted U.S dollars are : " + usDollars);
		
		
		cad.close();     // Closing the scanner class

	}

}
