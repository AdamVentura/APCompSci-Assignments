/*
 * Adam Ventura
 * 02/12/2021
 * This program when given a budget for a trip, will convert that amount into Canadian dollars, Pesos, and Euros.
 */
package vacation_conversions;
import java.util.Scanner;

public class vacation_conversions {

	public static void main(String[] args) {
	// Create scanner.
	Scanner reader = new Scanner(System.in);
	// Declare variables.
	double dUSD, dCD, dPesos, dEuros;
	// Prompt user for input and store the input in iUSD.
	System.out.println("What is your budget? ");
	dUSD = reader.nextInt();
	// Make conversions.
	dCD = dUSD * 1.34;
	dPesos = dUSD * 22.07;
	dEuros = dUSD * 0.86;
	// Print out calculations.
	System.out.println("$" + dUSD + " in US Dollars would be the following amounts converted to Canadian dollars, Pesos, and Euros: ");
	System.out.println();
	System.out.println("Canadian Dollars: " + dCD);
	System.out.println("Pesos: " + dPesos);
	System.out.println("Euros: " + dEuros);

	}

}
