/*
 * Adam Ventura
 * 2/8/2021
 * This program will read in a month and a year and will print out the number of days in that month.
 */

package days_in_month;
import java.util.Scanner;

public class days_in_month {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables.
		int iJanuary, iFeburary, iMarch, iApril, iMay, iJune, iJuly, iAugust, iSeptember, iOctober, iNovember, iDecember, iYear, iMonth;
		// Initialize variables.
		iJanuary = 31;
		iFeburary = 28;
		iMarch = 31;
		iApril = 30;
		iMay = 31;
		iJune = 30;
		iJuly = 31;
		iAugust = 31;
		iSeptember = 30;
		iOctober = 31;
		iNovember = 30;
		iDecember = 31;
		// Prompt user for the month and year.
		System.out.println("Enter a month (1-12): ");
		iMonth = reader.nextInt();
		System.out.println("Enter a year (yyyy): ");
		iYear = reader.nextInt();
		// Use if statements and the modulo operator to determine leap years.
		if (iYear % 4 == 0){
			iFeburary += 1;
		}
		if (iYear % 100 == 0) {
			iFeburary = 28;
		}
		if (iYear % 400 == 0) {
			iFeburary += 1;
		}
		// Use switch statements to determine the correct output.
		switch(iMonth) {
		
		case 1:
			System.out.println(iJanuary);
				break;
				
		case 2:
			System.out.println(iFeburary);
				break;
				
		case 3:
			System.out.println(iMarch);
				break;	
				
		case 4:
			System.out.println(iApril);
				break;	
				
		case 5:
			System.out.println(iMay);
				break;
				
		case 6:
			System.out.println(iJune);
				break;
		case 7:
			System.out.println(iJuly);
				break;
				
		case 8:
			System.out.println(iAugust);
				break;
				
		case 9:
			System.out.println(iSeptember);
				break;	
				
		case 10:
			System.out.println(iOctober);
				break;	
				
		case 11:
			System.out.println(iNovember);
				break;
				
		case 12:
			System.out.println(iDecember);
				break;
		
		}
		
		

	}

}
