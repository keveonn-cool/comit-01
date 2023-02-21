package homeWorkExamples;
import java.util.Scanner;

public class Program_18 {

	public static void main(String[] args) {
		/*Write a program in Java that reads two numbers on the keyboard 
		and say which is the largest and which is the smallest.*/
		
		Scanner num1= new Scanner(System.in);
		//Scanner num2 = new Scanner(System.in);
		
		/*System.out.println("Enter the first number :");
		double number_1 = num1.nextDouble();
		
		System.out.println("Enter the Second  number :");
		double number_2 = num2.nextDouble();
		
		
		System.out.println(number_1+" " + number_2);*/
		
		
		
		System.out.println("Enter the first number :");
		double number_1 = num1.nextDouble();
		
		System.out.println("Enter the Second  number :");
		double number_2 = num1.nextDouble();
		System.out.println(" Entered numbers are : " + number_1+" and " + number_2);
		System.out.println("");
		System.out.println("The result of comparision is :- ");
		if (number_1>number_2)
		{
			System.out.print(" The first number :" +number_1+ " is greater than second number :" +number_2);
		}
		
		else if (number_2>number_1)
		{
			System.out.print(" The second number :" +number_2+ " is greater than first number :" +number_1);
		}
		else 
		{
			System.out.print(" The first number :" +number_1+ " is equal to second number :" +number_2);
		}
		
		
		num1.close();  // Close the scanner class
		
		

	}

}
