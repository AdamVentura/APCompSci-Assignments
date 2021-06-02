/*
 * Adam Ventura
 * 2/6/2021
 * This program calculates the total costs of a video rental
 */

package video_rentals;

import java.util.Scanner;


public class video_rentals {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		double dTop_Pick_P, dOldie_P, dTop_Pick_Q, dOldie_Q, dTotal;
		String sTop_Pick, sOldie;
		// Assign values to variables
		dTop_Pick_P = 3.00;
		dOldie_P = 2.00;
		dOldie_Q = 0;
		dTop_Pick_Q = 0;
		// Prompt user
		System.out.println("Would you like to rent any top-pick videos (y/n)? ");
		// Read the next input and store it in the variable sTop_Pick
		sTop_Pick = reader.next();
		// Use if statement to determine whether or not user needs to be prompted further
		if (sTop_Pick.equals("y")) {
			System.out.println("How many would you like to rent? ");
			// Store the answer in the variable dTop_Pick_Q
			dTop_Pick_Q = reader.nextDouble();
			}
		// Prompt user again
		System.out.println("Would you like to rent any top-pick videos (y/n)? ");
		// Read the next input and store it in the variable sOldie
		sOldie = reader.next();
		// Use if statement to determine whether or not user needs to be prompted further
		if (sOldie.equals("y")) {
			System.out.println("How many would you like to rent? ");
			// Store the answer in the variable dOldie_Q
			dOldie_Q = reader.nextDouble();
			}
		// Calculate totals
		dTotal = (dOldie_Q * dOldie_P) + (dTop_Pick_Q * dTop_Pick_P);
		System.out.println("Your Total is $" + dTotal);

	}

}
