
package employee_salary;

import java.util.Scanner;

public class employee_salary_main {

	public static void main(String[] args) {
		// Create instance of employee class
		employee e = new employee();
		// Declare variables
		int iSelection;
		// Create instance of scanner
		Scanner reader = new Scanner(System.in);
		// Call NewEmployee method
		e.NewEmployee();
		// Prompt user for what method they would like to use, to exit the loop they can respond with 0
		do {
		System.out.println();
		System.out.println("What would you like to use? If you do not need anything else, respond with '0'.");
		System.out.println("If you would like to use another service, respond with one of the other following numbers: ");
		System.out.println("(1) Anniversary");
		System.out.println("(2) Raise");
		System.out.println("(3) Bonus");
		// Store their selection in a variable
		iSelection = reader.nextInt();
		// Use switch statements to call the method based on the users selection
		switch(iSelection) {
		case 1:
			e.Anniversary();
			break;
		case 2:
			e.Raise();
			break;
		case 3:
			e.Bonus();
			break;
		}
		} while(iSelection != 0);

	}

}
