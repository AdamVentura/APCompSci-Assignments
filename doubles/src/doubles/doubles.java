/*
 * Adam Ventura
 * 03/08/2021
 * This program reads in 2 numbers and doubles the first one until it is greater then the 2nd number
 */
package doubles;

import java.util.Scanner;

public class doubles {

	public static void main(String[] args) {
		// Create an instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNum1, iNum2, iDoubled;
		// Prompt user for numbers and store in appropriate variables
		System.out.println("Enter a number: ");
		iNum1 = reader.nextInt();
		System.out.println("Enter a number that is greater than the first one: ");
		iNum2 = reader.nextInt();
		// Initialize iDoubled variable
		iDoubled = iNum1;
		// Use a for loop to double the number
		do  {
			System.out.println(iDoubled);
			iDoubled = iDoubled * 2;
		} while (iDoubled <= iNum2);
	}

}
