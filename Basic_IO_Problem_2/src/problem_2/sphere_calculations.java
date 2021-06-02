package problem_2;
import java.util.Scanner;
/*
 * Adam Ventura
 * 2/3/20
 * Sphere Calculations
 * Program will read a given radius of a sphere and will return the sphere's diameter, circumference, surface area, and volume.
 */
public class Problem_2 {

	public static void main(String[] args) {
		
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Declare variables
		double dRadius, dDiameter, dCircumference, dSurfaceArea, dVolume;
		
		// Tell user to enter radius
		System.out.println("What is the radius of the sphere: ");
		
		// Retrieve the input for the radius
		dRadius = reader.nextDouble();
		
		// Calculate diameter, circumference, surface area, and volume
		dDiameter = dRadius * 2;
		dCircumference = 2 * 3.141592 * dRadius;
		dSurfaceArea = 4 * 3.141592 * ((dRadius) * (dRadius));
		dVolume = ((4) * (3.141592) * ((dRadius) * (dRadius) * (dRadius)))/3;
		
		// Print out the diameter, circumference, surface area, and volume
		System.out.println("Diameter: " + dDiameter);
		System.out.println("Circumference: " + dCircumference);
		System.out.println("Surface Area: " + dSurfaceArea + " units squared");
		System.out.println("Volume: " + dVolume + " units cubed");
		
	}

}
