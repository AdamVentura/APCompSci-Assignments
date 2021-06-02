/*
 * Adam Ventura
 * 02/20/2021
 * This program will force the user to enter in an even number. 
 * Once an even number is entered it will print out whether the number is positive, negative, or 0.
 */
package even_number;

import java.util.Scanner;

public class even_number {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner (System.in);
		// Declare variables
		int iNum;
		// Use a do loop to force user to enter a number until it is even
		do {
			System.out.println("Enter an even number: ");
			iNum = reader.nextInt();
		} while (iNum % 2 != 0);
		// Use if statements to determine whether the number is even, positive, or 0.
		if (iNum > 0) {
			System.out.println("Your number is positive.");
		}
		else if (iNum < 0) {
			System.out.println("Your number is negative.");
		}
		else if (iNum == 0) {
			System.out.println("Your number is equal to 0.");
		}

	}

}
