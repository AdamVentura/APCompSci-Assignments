package employee_salary;

import java.util.Scanner;

public class employee {
	// Declare variables
	int iEmployeeID, iSalary, iYearsOfService;
	double dSalary;
	boolean iRaiseUsed = false; 
	boolean iBonusUsed = false;
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	// Create method 
	public void NewEmployee() {
		// Prompt user for ID
		System.out.println("Welcome! What is your employee ID #? ");
		iEmployeeID = reader.nextInt();
		// Prompt user for salary
		System.out.println("What is your salary? ");
		iSalary = reader.nextInt();
		// Prompt user for Years of service
		System.out.println("How many years have you been at the company for? ");
		iYearsOfService = reader.nextInt();
		}
	
	public void Anniversary() {
		// Add 1 year to the years of service
		iYearsOfService += 1;
		System.out.println("Happy anniversary! You have now served " + iYearsOfService + " years at the company.");
		}
	
	public void Raise() {
		// Declare percentage of raise as a variable
		double dRaisePercent;
		// If the bonus method has not been used, set dSalary equal to iSalary
		if (iBonusUsed == false) {
			dSalary = iSalary;
		}
		// Prompt user for the raise percent
		System.out.println("How much was your raise (percentage)? ");
		dRaisePercent = reader.nextInt();
		// Make the percentage a valued that can be multiplied
		double dRaiseMultiplier = ((dRaisePercent/100) + 1);
		// Make the proper calculations
		dSalary = dRaiseMultiplier * dSalary;
		// Print the new salary
		System.out.println("Your new salary is $" + dSalary);
		// Use to determine if Raise method has been used
		iRaiseUsed = true;
		}
	
	public void Bonus() {
		// Declare variables
		double dBonus, dBonusAmount;
		// Convert years of service variable to double
		double dYearsOfService = iYearsOfService;
		// Check if raise method has been used
		if (iRaiseUsed == false) {
			dSalary = iSalary;
		}
		// Initialize bonus
		dBonus = 0;
		// Use if statements to determine size of bonus
		if (dYearsOfService >= 0) {
			if (dYearsOfService <= 10) {
				dBonus = 1.05;
		}
			}
		if (dYearsOfService > 10) {
			dBonus = 1.10;
		}
		// Multiply the bonus by the salary
		dSalary = dBonus * dSalary;
		// Calculate the bonus amount
		dBonusAmount = dSalary - iSalary;
		// Print out the new salary
		System.out.println("You recieved a bonus of $" + dBonusAmount);
		System.out.println();
		System.out.println("Your new salary is $" + dSalary);
		// Show bonus method has been used
		iBonusUsed = true;
		}
}

