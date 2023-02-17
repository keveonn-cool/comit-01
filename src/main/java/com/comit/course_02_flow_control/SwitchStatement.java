package com.comit.course_02_flow_control;

public class SwitchStatement {
	// Switch Statement is to select one of the many block codes to be executed

	public static void main(String[] args) {

		/*
		 * Write a program that translates the day's number into day's name 1- Monday 2-
		 * Tuesday and so on ....
		 */
		int day = 5;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday ");
		}

		// numeric (int, long, short, byte) , String, char
		switch (day) {
		case -1, 0, 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid day ");

		}

		System.out.println("\n");

		// Simplified Switch Statement
		switch (day) {
		case -1, 0, 1 -> {
			System.out.println("Hello");
			System.out.println("Monday");

		}

		case 2 -> System.out.println("Tuesday");

		case 3 -> System.out.println("Wednesday");

		case 4 -> System.out.println("Thrusday");

		case 5 -> System.out.println("Friday");

		case 6 -> System.out.println("Saturday");

		case 7 -> System.out.println("Sunday");

		default -> System.out.println("Invalid day ");

		}

		// Assigning values with the simplified switch statement
		String name = switch(day) {
		case  0, 1 -> "Monday";

		case 2 -> "Tuesday";

		case 3 -> "Wednesday";

		case 4 -> "Thrusday";

		case 5 -> "Friday";

		case 6 -> "Saturday";

		case 7 -> "Sunday";

		default -> "Invalid day" ;

		};
		System.out.println(name);
	}

}
