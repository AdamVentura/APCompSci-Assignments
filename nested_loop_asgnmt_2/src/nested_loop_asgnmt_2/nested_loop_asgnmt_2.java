/*
 * Adam Ventura
 * 02/24/2021
 * This program reads in a number and prints out the corresponding pattern.
 */

package nested_loop_asgnmt_2;

import java.util.Scanner;

public class nested_loop_asgnmt_2 {

	public static void main(String[] args) {
		// Create instance of input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNumber, iCountRows, iCountColumns, iCount = 0;
		// Prompt user for number and store number in iNumber
		System.out.println("Enter a number: ");
		iNumber = reader.nextInt();
		// Use for loop to print out columns
		for (iCountColumns = 0; iCountColumns < iNumber; iCountColumns += 1) {
			if (iCount < iNumber) {
				iCount += 1;
				// Nest a for loop to print rows
				for (iCountRows = 0; iCountRows < iCount - 1; iCountRows += 1) {
					System.out.print("?");
					
			}
				
			}
			// If the output does not equal 0, print a pound symbol
			if (iCount != 0) {
				System.out.println("#");
			}
					}
		for (iCountColumns = 0; iCountColumns < iNumber; iCountColumns += 1) {
			if (iCount <= iNumber) {
				iCount -= 1;
				// Nest a for loop to print rows
				for (iCountRows = 0; iCountRows < iCount - 1; iCountRows += 1) {
					System.out.print("?");
			// If the pattern is completed, break the loop.
			if (iCount == 0) {
				break;
			}
					
			}
				
			}
			// If the output does not equal 0, print a pound symbol
			if (iCount != 0) {
				System.out.println("#");
			}
			}
			
			}
}

	
