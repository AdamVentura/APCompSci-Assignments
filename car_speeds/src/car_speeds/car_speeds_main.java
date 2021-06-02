package car_speeds;

public class car_speeds_main {

	public static void main(String[] args) {
		// Create an instance of car_speeds
		car_speeds cs = new car_speeds();
		// Call method to collect the speeds
		int[] iSpeeds = cs.CollectSpeeds();
		// Call method to find highest speed and print it
		int iHighestSpeed = cs.HighestSpeed(iSpeeds);
		System.out.println("The highest speed is " + iHighestSpeed);
		// Call method to find the average speed and print it
		int iAverageSpeed = cs.AverageSpeed(iSpeeds);
		System.out.println("The average speed is " + iAverageSpeed);
		// Call method to determine the speeds that are over the speed limit but not by more than 9 mph over
		int iAmountOverLimit = cs.Speeding(iSpeeds);
		System.out.println("There are/is " + iAmountOverLimit + " car/s driving over the speed limit but not by greater than 9 mph over.");
		// Call method to determine the speeds that are over the speed limit by 10 mph but not by more than 20 mph over
		int iAmount10Over = cs.SpeedingOver9(iSpeeds);
		System.out.println("There are/is " + iAmount10Over + " car/s driving 10mph over the speed limit but not by greater than 20 mph over.");
		// Call method to determine the speeds that are over the speed limit by 21 mph
		int iAmount21Over = cs.SpeedingOver20(iSpeeds);
		System.out.println("There are/is " + iAmount21Over + " car/s driving 21 mph over the speed limit.");
		
			
		}

	}
