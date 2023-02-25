package homeWorkExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Program_21 {
	/*Make a program in JAVA such that given as data the enrollment and 5 grades of a student; Print the enrollment,
	the average and the word "approved" if the student has an average greater than or equal to 6, and the word
	"not approved" otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an integer variable that 
	represents the student's enrollment. CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the 
	student's 5 grades.*/

	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		
		System.out.println("Enter your enrollment : ");
		int MAT = student.nextInt();
		
		double [] cal = new double [5]; // Initializing array
		// System.out.println(Arrays.toString(cal)); --- printing null string
		
		double sum = 0; // Initializing the sum of the grades
		// taking user input in the form of an array
		for(int i = 0; i< cal.length; i++)
		{
			System.out.println("Enter your grade in " + (i+1) + " subject :" );
			cal[i] = student.nextDouble();
			sum = sum + cal[i];
		}
								
		double average = sum/5;
		
		String result  = (average>=6)? "Approved": "Not approved";
		
		
		// Printing the outputs
		System.out.println("Your enrollment is :" + MAT);
		System.out.println("Your grade average is : " + String.format("%.02f",average));
		System.out.println("Your admission is " + result);
		
		student.close();
		
	}

}
