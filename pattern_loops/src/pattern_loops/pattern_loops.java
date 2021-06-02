/*
 * Adam Ventura
 * 02/28/2021
 * This program will read in a number and prints off its corresponding pattern.
 */

package pattern_loops;

import java.util.Scanner;

public class pattern_loops {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iCountRows, iCountColumns, iNumber, iCount;
		// Prompt user for number and store number in iNumber
		System.out.println("Enter a number: ");
		iNumber = reader.nextInt();
		// Use for loop to print out the correct amount of columns
		for (iCountRows = 0; iCountRows < iNumber; iCountRows += 1);
		{
			// Nest a for loop to print out the correct amount of columns
			for (iCountColumns = iNumber; iCountColumns > 0; iCountColumns -= 1)
			{
				System.out.print(iCountColumns);
		}
			// Start a new line
			System.out.println();
	}

}
}
