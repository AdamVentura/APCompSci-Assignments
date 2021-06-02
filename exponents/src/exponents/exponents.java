/*
 * Adam Ventura
 * 03/06/2021
 * This program completes operations involving exponents by 
 * prompting a user to enter a base number and then an exponent.
 */

package exponents;

import java.util.Scanner;

public class exponents {

	public static void main(String[] args) {
		// Create instance of scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		int iBase, iExponent, iAnswer;
		// Prompt user for base and exponent 
		System.out.println("Enter a base number: ");
		iBase = reader.nextInt();
		System.out.println("Enter an exponent: ");
		iExponent = reader.nextInt();
		// Call Evaluate method and print answer
		iAnswer = Evaluate(iBase, iExponent);
		System.out.println("The answer is " + iAnswer);

	}
	public static int Evaluate(int iBase, int iExponent) {
		// If an exponent is not equal to 0, multiply base by itself until it cannot.
		if (iExponent != 0) {
			return (iBase * Evaluate(iBase, iExponent - 1));
		}
		// If an exponent is 0 the answer is 1
		else {
			return 1;
		}
	} 

}

