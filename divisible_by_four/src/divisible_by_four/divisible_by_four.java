/*
 * Adam Ventura
 * 2/20/2021
 * This program will read in two numbers and print out all of the 
 * numbers between the 2 numbers that are divisible by 4.
 */
package divisible_by_four;

import java.util.Scanner; 

public class divisible_by_four {

	public static void main(String[] args) {
		// Create instance of input reader 
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iNum1, iNum2, iCount;
		// Prompt user for numbers
		System.out.println("Enter a number: ");
		iNum1 = reader.nextInt();
		System.out.println("Enter another number that is greater than the first number: ");
		iNum2 = reader.nextInt();
		// Create description of output
		System.out.println("These are the numbers divisible by 4 between " + iNum1 + " and " + iNum2 + ":");
		// Use for loop to iterate through the two numbers
		for(iCount = iNum1; iCount <= iNum2; iCount += 1) {
			// Use an if statement to see if number is divisible by 4
			if(iCount % 4 == 0) {
				// Print out number and add a space
				System.out.print(iCount + " ");
			}
		}
		
		
		
		
		}
		     
	}
