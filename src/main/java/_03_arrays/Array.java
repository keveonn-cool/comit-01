package _03_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int i0=0;
		int i1=1;
		int i2=2;
		int i3=3;
		int i4=4;
		int i5=5;
		int i6=6;
		int i7=7;
		int i8=8;
		int i9=9;
		
		// the array in java are not re-sizable
		// int[] a = {4,5,7,2,14,35,46,71,28,19,12};
//      index      0 1 2 3  4  5 6   7  8  9  10
		
//		System.out.println(a[9]);
		
	/*  int l =a.length;  // array property to know the length of array
	System.out.println(l); */
		
	/* printing array using a.length
		for (int i=0; i<a.length; i++)
		{
			int j= a[i];
			System.out.println(j);
		}
		*/
		
		
		/*
		// enhanced for loop
		
		int[] b = {4,5,7,2,14,35,46,71,28,19,12};
		for(int numbers:b)
		{ 
			System.out.println(numbers*2);
		}
		*/

  
		/*
		 * // to print in  a single line
		int[] b = {4,5,7,2,14,35,46,71,28,19,12};
		for(int numbers:b)
		{ 
			System.out.print(numbers + " ");
		}
		*/
		
		 
		/*
		 * // to print in  a next line using \n
		 
			int[] b = {4,5,7,2,14,35,46,71,28,19,12};
			for(int numbers:b)
			{ 
				System.out.print(numbers + "\n");
			}
		*/
		
		
		
	
		/*
		 // Print out the memory address
		 
		int[] a = {4,5,7,2,14,35,46,71,28,19,12};
		System.out.println(a);
		*/
		
		
		
		/*
		//how to change individual elements of an array  
		int [] b= {4,5,7,14,35,46,71,28,19,12};
		b[7] = -1;
		System.out.println(b[7]); */
		
		
		
		/*
		// 2nd way to create an array--empty array
		int [] c = new int [10];
		for (int j = 0; j<c.length; j++)
		{
			int q = c[j];
			System.out.println(q);
		}*/
		
		
		/*
		// Taking input from user for an array size
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter the size of the array :");
		int size = input.nextInt();
		
		int [] newArray = new int[size];
		for (int r=0; r<newArray.length; r++)
		{
			int t= newArray[r];
			System.out.println(t);	
			
		}
	System.out.println(Arrays.toString(newArray));  // print array in a single line in the form of a array
	*/
		
		/*
		// Array of string
	String[] brands = {"Toyota" , "Ford" , "Nissan", "BMW"};
	System.out.println(Arrays.toString(brands));
	*/
	
	
		// Creating a null string array
	String[] names = new String [4];
	System.out.println(Arrays.toString(names));
	
	// now adding some data into the null array
	names[0] = "Gopal";
	names[2] = "Khushi";
	System.out.println(Arrays.toString(names));
	
	}
		
		
		
	}


