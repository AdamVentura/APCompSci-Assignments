/*
 * Adam Ventura
 * 03/08/2021
 * This program reads in the radius and height of a cylinder and then calculates the volume of it.
 */

package cylinder_volume;

import java.util.Scanner;

public class cylinder_volume {

	public static void main(String[] args) {
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Declare variables
		double dRadius, dHeight, dPi = 3.14, dVolume;
		// Prompt user for radius and height and store in appropriate variables
		System.out.println("Enter the radius of the cylinder: ");
		dRadius = reader.nextInt();
		System.out.println("Enter the height of the cylinder: ");
		dHeight = reader.nextInt();
		// Make calculations
		dVolume = dPi * (dRadius * dRadius) * dHeight;
		// Print the answer
		System.out.println("The volume is " + dVolume);
	}

}
