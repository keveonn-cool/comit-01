package com.comit.course_02_flow_control;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		 while(i<10)
		{
		i++;	
		if(i==5)
		{
			//break;    break out the loop
		continue; // continue with the next iteration 
		}
		System.out.println(i);
		}
		/*
		do {
			System.out.println(i);
			i++; // ++i will have the same effect here in the case
		} while(i<1);
		System.out.println("The end");
		*/
		 System.out.println("The end");
	}

}
