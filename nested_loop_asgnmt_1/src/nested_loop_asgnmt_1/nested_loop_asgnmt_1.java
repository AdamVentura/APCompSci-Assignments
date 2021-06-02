/*
 * Adam Ventura
 * 02/22/2021
 * This program will read in a number and print out the corresponding output.
 */


package nested_loop_asgnmt_1;

import java.util.Scanner;

public class nested_loop_asgnmt_1 {

	public static void main(String[] args) {
		// Create instance of input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNumber, iCountRows, iCountColumns;
		// Prompt user for number and store number in iNumber variable
		System.out.println("Enter a number: ");
		iNumber = reader.nextInt();
		// Print out star before loop begins
		System.out.print("*");
		// Use a for loop to print out the corresponding amount of rows
		for (iCountRows = 0; iCountRows < (iNumber - 1); iCountRows += 1) {
			// Nest a for loop to print out the corresponding amount of rows
			for(iCountColumns = 0; iCountColumns < (iNumber - 2); iCountColumns += 1) {
				System.out.print("#");
			}
			// Print out a star at the end of each row and start a new line
			System.out.println("*");
			// If the rows are not finished being printed, print out a star to start the next row.
			if (iCountRows <= iNumber - 3) {
				System.out.print("*");
			}
		}

	}

}
