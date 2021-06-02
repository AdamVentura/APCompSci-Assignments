/*
 * Adam Ventura
 * 03/08/2021
 * This program will create patterns based on user input
 */
package loop_pattern;

import java.util.Scanner;

public class loop_pattern {

	public static void main(String[] args) {
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNum, iCountColumns, iCountRows;
		// Prompt user for number and store in variable
		System.out.println("Enter a number: ");
		iNum = reader.nextInt();
		// Use for loop to create the correct amount of rows
		for (iCountRows = 1; iCountRows <= iNum; iCountRows += 1) {
			// Nest another for loop for the columns
			for (iCountColumns = 1; iCountColumns <= iNum; iCountColumns +=1) {
				// Print the row number
				System.out.print(iCountRows);
			}
			// At the end of each row, start a new line
			System.out.println();
		}
		

	}

}
