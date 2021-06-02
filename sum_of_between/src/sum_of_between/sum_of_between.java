/*
 * Adam Ventura
 * 2/15/21
 * This program finds the sum of all the numbers between any two numbers a user enters.
 */

package sum_of_between;

import java.util.Scanner;

public class sum_of_between {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNumb1, iNumb2, iNumb1_2, iSum, iCount;
		// Prompt user for two numbers
		System.out.println("Enter a number: ");
		iNumb1 = reader.nextInt();
		System.out.println("Enter another number: ");
		iNumb2 = reader.nextInt();
		// Initialize iNumb1_2 and iSum
		iNumb1_2 = iNumb1;
		iSum = 0;
		// Use for loop to add up the numbers in between
		for (iCount = iNumb1; iCount <= iNumb2; iCount += 1 ) {
			iSum = iSum + iNumb1_2;
			iNumb1_2 += 1;
		}
		System.out.println("The sum of the numbers in between " + iNumb1 + " and " + iNumb2 + " is equal to " + iSum);
		

	}

}
