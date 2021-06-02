/*
 * Adam Ventura
 * 02/28/2021
 * This program reads in a numerator and a denominator of a fraction and converts them to decimal form.
 */

package fractions;

import java.util.Scanner;

public class fractions {

	public static void main(String[] args) {
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Create instance of class
		fractions f = new fractions();
		// Declare variables
		double dNumerator, dDenominator, dDecimal;
		// Prompt user for fraction and store in appropriate variables.
		System.out.println("Enter a numerator: ");
		dNumerator = reader.nextInt();
		System.out.println("Enter a denominator: ");
		dDenominator = reader.nextInt();
		// Call method and print decimal form
		dDecimal = f.Divide(dNumerator, dDenominator);
		System.out.println("The decimal form of " + dNumerator + "/" + dDenominator + " is " + dDecimal);
	}
		
	// Use method to divide the numerator and denominator
	public double Divide(double dNumerator, double dDenominator) {
		// Declare variable
		Double dDecimal;
		// divide numerator and denominator
		dDecimal = dNumerator/dDenominator;
		// return the decimal form
		return dDecimal;
	}
	
	
}
