package homeWorkExamples;
import java.util.Scanner;

public class Program_20 {

	public static void main(String[] args) {
		/*Write a java program that declares an integer variable B and 
		assign it a value. It then displays a message indicating
		 whether the value of B is positive or negative.
		We will consider 0 as positive.
		If for example B = 1 the output will be 1 is positive. 
		If for example B = -1 the output will be: -1 is negative.*/
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the number that you want to check :");
		int number = input.nextInt();
		
		String s = (number>=0)? "Positive" : " Negative";
		
		System.out.println(" The entered number :" + number+ " is " + s);
		
	
		input.close();   // Closing the scanner class
 
	}

}
