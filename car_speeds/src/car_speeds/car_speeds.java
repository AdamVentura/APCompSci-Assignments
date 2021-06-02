package car_speeds;

import java.util.Scanner;

public class car_speeds {
	// Create an instance of scanner
	Scanner reader = new Scanner(System.in);
	public int[] CollectSpeeds() {
		// Declare variables
		int[] iSpeeds = new int[10];
		int iCount;
		// Use for loop to collect the speeds for the array
		for(iCount = 0; iCount <= 9; iCount += 1) {
			System.out.println("Enter a speed (in mph): ");
			iSpeeds[iCount] = reader.nextInt();
		}
		// Return the array
		return iSpeeds;
			
	}
	public int HighestSpeed(int[] iSpeeds){
		// Declare variables
		int iCount, iHighest = 0;
		// Use for loop to iterate through iSpeeds
		for (iCount = 0; iCount <= 9; iCount += 1) {
			// Nest a for loop to compare each speed to every other speed
				// If the number from the first loop is greater than all the other numbers than that is the highest
				if (iHighest < iSpeeds[iCount]) {
					iHighest = iSpeeds[iCount];
				}
			}
		// Return the highest number
		return iHighest;
	}
	public int AverageSpeed(int[] iSpeeds) {
		// Declare variables
		int iSum = 0, iAverage, iCount;
		// Use for loop to determine the sum
		for(iCount = 0; iCount <= 9; iCount += 1) {
			// Add each speed to the other speeds to determine sum
			iSum += iSpeeds[iCount];
		}
		// Divide sum by 10 to determine the average
		iAverage = iSum/10;
		// Return the average
		return iAverage;
		
	}
	// Use method to determine if there are any speeds over the speed limit but less than 10 mph over
	public int Speeding(int[] iSpeeds) {
		// Declare speed limit as variable and initialize it
		int iSpeedLimit = 55, iAmountOverLimit = 0, iCount;
		// Use for loop to iterate through the speeds
		for (iCount = 0; iCount <= 9; iCount += 1) {
			// Use if statement to determine if speed is over limit but less by 10 mph
			if (iSpeeds[iCount] > iSpeedLimit && iSpeeds[iCount] < iSpeedLimit + 10) {
				iAmountOverLimit += 1;
			}
		}
		return iAmountOverLimit;
	}
	// Use method to determine the speeds 10 mph over the speed limit but less than 20 mph
	public int SpeedingOver9(int[] iSpeeds) {
		// Declare speed limit as variable and initialize it
		int iSpeedLimit = 55, iAmount10Over = 0, iCount;
		// Use for loop to iterate through the speeds
		for (iCount = 0; iCount <= 9; iCount += 1) {
					// Use if statement to determine if speed is over limit by 10mph but not greater than 20 mph over
			if (iSpeeds[iCount] > iSpeedLimit + 10 && iSpeeds[iCount] <= iSpeedLimit + 20) {
						iAmount10Over += 1;
					}
				}
		return iAmount10Over;
	}
	// Use method to determine the speeds over 20 mph
	public int SpeedingOver20(int[] iSpeeds) {
		// Declare speed limit as variable and initialize it
		int iSpeedLimit = 55, iAmount21Over = 0, iCount;
		// Use for loop to iterate through the speeds
		for (iCount = 0; iCount <= 9; iCount += 1) {
			// Use if statement to determine if speed greater than 20 mph over the speed limit
			if (iSpeeds[iCount] > iSpeedLimit + 20) {
				iAmount21Over += 1;
				}
			}
		return iAmount21Over;
	}
	

}
	
