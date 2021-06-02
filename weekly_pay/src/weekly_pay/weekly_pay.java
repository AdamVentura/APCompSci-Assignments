/*
 * Adam Ventura
 * 02/12/2021
 * This program calculates an employees weekly salary
 */
package weekly_pay;
import java.util.Scanner;

public class weekly_pay {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare Variables
		int iID;
		double dYearly_Salary, dWeekly_Salary, dHours, dHourly_Salary;
		// Prompt user for employee ID number and store number in variable iID
		System.out.println("Enter your employee ID number: ");
		iID = reader.nextInt();
		// Calculate weekly salary for employees with an ID # greater than or equal to 1000
		if (iID >= 1000) {
			// Prompt user for yearly salary and store amount in dYearly_Salary
			System.out.println("What is your yearly salary? ");
			dYearly_Salary = reader.nextDouble();
			// Divide the provided yearly salary by 52 and print out weekly salary
			dWeekly_Salary = dYearly_Salary/52;
			System.out.println("Your weekly salary is $" + dWeekly_Salary);
			
		}
		// Calculate weekly salary for employees with an ID # less than 1000
		if (iID < 1000) {
			// Prompt user for hours worked and their hourly salary and store inputs in their respective variables
			System.out.println("How many hours do you work every week? ");
			dHours = reader.nextDouble();
			System.out.println("What is your hourly salary? ");
			dHourly_Salary = reader.nextDouble();
			// Calculate weekly salary by multiplying hours by hourly salary and print out answer
			dWeekly_Salary = dHours * dHourly_Salary;
			System.out.println("Your weekly salary is $" + dWeekly_Salary);
		}
	}

}
