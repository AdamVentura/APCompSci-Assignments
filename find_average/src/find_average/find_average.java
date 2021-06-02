/*
 * Adam Ventura
 * 03/08/2021
 * This program uses methods to find the average of 3 numbers
 */

package find_average;

import java.util.Scanner;

public class find_average {

	public static void main(String[] args) {
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Create instance of class
		find_average fa = new find_average();
		// Declare variables
		double dNum1, dNum2, dNum3, dAverage;
		// Prompt user for numbers and store numbers in their variables
		System.out.println("Enter a number: ");
		dNum1 = reader.nextInt();
		System.out.println("Enter another number: ");
		dNum2 = reader.nextInt();
		System.out.println("Enter another number: ");
		dNum3 = reader.nextInt();
		// Call Average method and PrintAverage method
		dAverage = fa.Average(dNum1, dNum2, dNum3);
		fa.PrintAverage(dAverage);
	}
	public double Average(double dNum1, double dNum2, double dNum3) {
		// Declare variable
		double dAverage, dSum;
		// Make calculations
		dSum = dNum1 + dNum2 + dNum3;
		dAverage = dSum/3;
		// Return the average
		return dAverage;
	}
	// Create method to print the average
	public void PrintAverage(double dAverage) {
		System.out.println("The average is " + dAverage);
	}

}
