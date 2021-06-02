package ArrayLists2;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayLists2 {
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	// initialize array list
	ArrayList<Integer> number_list = new ArrayList<Integer>();
	// Initialize and create global access for variables
	// Initialize and declare variables
	int i1_10 = 0, i11_20 = 0, i21_30 = 0, i31_40 = 0, i41_50 = 0, i51_60 = 0, i61_70 = 0, i71_80 = 0, i81_90 = 0, i91_100 = 0;
	
	// Use method to read in set of values 1-100
	public void GetNumbers(){
		// Initialize variable
		boolean bOn = true;
		// Use while loop to keep method running until user would like to end the series of numbers.
		while (bOn == true) {
			// Prompt user for input
			System.out.println("Enter in a number 1-100. Enter '0' when you are finished.");
			// Store number in variable
			int iNumber = reader.nextInt();
			// if the number is 0 change the value of on to false
			if (iNumber == 0) {
				bOn = false;
			}
			// If it's not, check to see if number is in the range of 1 and 100 and add the number to the array
			else if (iNumber >= 1 && iNumber <= 100){
				// Store numbers in array
				number_list.add(iNumber);
			}
			// If it's not in the range of 1 and 100
			else {
				// Tell the user they need to enter in a value in the range of 1 and 100
				System.out.println("Please only enter in a value in the range of 1 and 100.");
			}
		}
		System.out.println(number_list);
	}
	// Use method to create chart to put each number in a range
	public void SortNumbers() {
		// Use for loop to iterate through ArrayList
		for (Integer number : number_list) {
			// Use if statements to determine if numbers are in a range
	        if(number >= 1 && number <= 10) {
	           i1_10 += 1;
	        }
	        if(number >= 11 && number <= 20) {
		       i11_20 += 1;
		    }
	        if(number >= 21 && number <= 30) {
		       i21_30 += 1;
		    }
	        if(number >= 31 && number <= 40) {
		       i31_40 += 1;
		     }
	        if(number >= 41 && number <= 50) {
			   i41_50 += 1;
			}
	        if(number >= 51 && number <= 60) {
			   i51_60 += 1;
			}
	        if(number >= 61 && number <= 70) {
			   i61_70 += 1;
			}
	        if(number >= 71 && number <= 80) {
		       i71_80 += 1;
	        }
	        if(number >= 81 && number <= 90) {
		       i81_90 += 1;
	        }
	        if(number >= 91 && number <= 100) {
		       i91_100 += 1;
			}

		}
				
	}
	
	// Use method to print chart
	public void PrintChart() {
		// Declare variables
		int iCount;
		// Initialize iCount to 0
		// Print out the different ranges
		// Use while loop for each range to print out the correct amount of asterisks
		
		iCount = 0;
		if(i1_10 > 0) {
			System.out.print("1-10  | ");
			while(iCount < i1_10) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i21_30 > 0) {
			System.out.print("21-30 | ");
			while(iCount < i21_30) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i31_40 > 0) {
			System.out.print("31-40 | ");
			while(iCount < i31_40) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i41_50 > 0) {
			System.out.print("41-50 | ");
			while (iCount < i41_50) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i51_60 > 0) {
			System.out.print("51-60 | ");
			while(iCount < i51_60) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i61_70 > 0) {
			System.out.print("61-70 | ");
			while(iCount < i61_70) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i71_80 > 0) {
			System.out.print("71-80 | ");
			while(iCount < i71_80) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(81_90 > 0) {
			System.out.print("81-90 | ");
			while(iCount < i81_90) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		iCount = 0;
		if(i91_100 > 0) {
			System.out.print("91-100| ");
			while(iCount < i91_100) {
				System.out.print("* ");
				iCount += 1;
			}
			System.out.println();
		}
		
		
	}
			
}
