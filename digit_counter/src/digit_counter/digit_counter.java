/*
 * Adam Ventura
 * 3/13/2021
 * This program uses recursion to determine the amount of digits in a number
 */
package digit_counter;

import java.util.Scanner;

public class digit_counter {

	public static void main(String[] args) {
		// Create instance of class
		digit_counter dc = new digit_counter();
		// Create instance of scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNum;
		// Prompt user for number
		System.out.println("Enter a number: ");
		iNum = reader.nextInt();
		// Call counter method
		iNum = digit_counter.Counter(iNum);
		System.out.println("Your number has " + iNum + " digit(s).");
		
	}
	// Create counter method to determine the amount of digits the number has
	static int Counter(int iNum) {
		// If the number is less than 10 then there is 1 digit.
		if (iNum < 10) {
			return 1;
			}
		// If the number divided by 10 is greater than 0, then there is at least 2 digits
		return 1 + Counter(iNum/10);
		}

}
