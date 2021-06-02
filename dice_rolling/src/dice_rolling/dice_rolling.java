package dice_rolling;

import java.util.Scanner;

import java.util.Random;

public class dice_rolling {
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	// Create instance of random class
	Random rand = new Random();

	// Create method to determine the amount of times the user wants to roll the pair of dice
	public int AmountOfRolls() {
		// Declare variables
		int iNumberOfRolls;
		// Prompt user for amount and store amount in variable
		System.out.println("How many times would you like to roll the dice? ");
		iNumberOfRolls = reader.nextInt();
		// return the amount of rolls
		return iNumberOfRolls;
	}
	public int[] RollDie1(int iNumberOfRolls) {
		// Declare variables
		int iCount;
		// Create arrays for dice based on the amount of rolls
		int[] iDie1 = new int[iNumberOfRolls];
		
		// Use for loops to "roll" the dice
		for(iCount = 0; iCount <= (iNumberOfRolls - 1); iCount += 1) {
			// Generate random numbers for die 1
			iDie1[iCount] = rand.nextInt(5) + 1;
		}
		// Return the array
		return iDie1;
	}
	public int[] RollDie2(int iNumberOfRolls) {
		// Declare variables
		int iCount;
		// Create arrays for dice based on the amount of rolls
		int[] iDie2 = new int[iNumberOfRolls];
		// Use for loops to "roll" the dice
		for(iCount = 0; iCount <= (iNumberOfRolls - 1); iCount += 1) {
			// Generate random numbers for die 2
			iDie2[iCount] = rand.nextInt(5) + 1;
		}
		// Return the array
		return iDie2;
	}
	public void Combos(int[] iDie1, int[] iDie2, int iNumberOfRolls) {
		// Declare variables
		int iCount1, iCount2, iCount3;
		// Create array for combos
		int[] iCombos = new int[iNumberOfRolls];
		// Use for loops to iterate through the dice rolls
		for(iCount1 = 0; iCount1 <= (iNumberOfRolls - 1); iCount1 += 1) {
			for(iCount2 = 0; iCount2 <= (iNumberOfRolls - 1); iCount2 += 1) {
				// if there is more than one of a combo than add 1 to the combo array
				if (iDie1[iCount1] == iDie1[iCount2] && iDie2[iCount1] == iDie2[iCount2]) {
					iCombos[iCount1] += 1;
				}
			}
		}
		// Describe the output
		System.out.println("Here are the amount of times the same combo was rolled: ");
		// Use for loop to print the combos
		for(iCount3 = 0; iCount3 <= (iNumberOfRolls - 1); iCount3 += 1) {
			// Print the combos and amount of combos
			System.out.println(iDie1[iCount3] + " and " + iDie2[iCount3] + ": " + iCombos[iCount3]);
		}
	}
}
	