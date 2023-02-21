package homeWorkExamples;
import java.util.Scanner;

public class Program_19 {

	public static void main(String[] args) {
		/*Write a Java program that does the following: 
		 * declare a variable N of type int, a variable A of type double 
		 * and a variable C of type char and assign to each one a value.
		 *  The following screen displays:
		 *  The value of each variable. The sum of N + A. And A - N
		 */
		
		int N;
		double A;
		char C;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Integer value :");
		N = input.nextInt();
		
		System.out.println("Enter the double value :");
		A = input.nextDouble();
		
		System.out.println("Enter a character :");
	    C= input.next().charAt(0);
	    
	    
	    System.out.println("You entered the integer : " + N +", Double value :" + A + " ,and the character : " + C +"." );
	    
	    
		
		double sum = N+A;
		double difference = A-N;
		
		System.out.println("The sum of the integer value and double value is : " + sum + ",and the subtraction is :" + difference );
		
		
		input.close(); // Closing the scanner class
		
		
			
		

	}

}
