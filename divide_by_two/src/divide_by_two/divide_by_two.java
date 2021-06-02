/*
 * Adam Ventura
 * 2/20/2021
 * This program will read in a number than print out the number 
 * and divide by two until the number is less than or equal to zero.
 */
package divide_by_two;

import java.util.Scanner;

public class divide_by_two {

	public static void main(String[] args) {
		// Create instance of input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNum;
		// Prompt user for number, store number in variable, and print out number.
		System.out.println("Enter a number: ");
		iNum = reader.nextInt();
		System.out.print(iNum + ", ");
		// Use while loop to divide number until number is less than or equal to 0, and print out number
		while (iNum > 0) {
			iNum = iNum/2;
			System.out.print(iNum + ", ");
		}

	}

}
