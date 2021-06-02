/*
 * Adam Ventura
 * 2/15/21
 * This program finds the sum of either all of even numbers or odd numbers between any two numbers a user enters.
 */

package sum_of_between_even_odd;

import java.util.Scanner;

public class sum_of_between_even_odd {

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
		// Prompt user to choose either even or odd and store response in variable sResponse
		System.out.println("Even or Odd (e/o)?");
		String sResponse = reader.next();
		// Use if 
		
		// Initialize iNumb1_2 and iSum
		iNumb1_2 = iNumb1;
		iSum = 0;
		// Use for loop to add up the numbers in between
		for (iCount = iNumb1; iCount <= iNumb2; iCount += 1 ) {
			if (iNumb1_2 % 2 == 0);
				iSum = iSum + iNumb1_2;
				iNumb1_2 += 1;
			}
		System.out.println(iSum);
				


	}

}
