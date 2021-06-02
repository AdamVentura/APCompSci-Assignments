package rectangle;

import java.util.Scanner;

public class rectangleMain {

	public static void main(String[] args) {
		// Create instance of Scanner
		Scanner reader = new Scanner(System.in);
		// Create instance of class
		rectangle r = new rectangle();
		// Declare variables
		int iLength, iWidth, iPerimeter, iArea;
		// Prompt user for length and width
		System.out.println("Enter the width of your rectangle: ");
		iLength = reader.nextInt();
		
		System.out.println("Enter the length of your rectangle: ");
		iWidth = reader.nextInt();
		// Call method to get perimeter
		iPerimeter = r.GetPerimeter(iLength, iWidth);
		System.out.println("Perimeter: " + iPerimeter);
		// Call method to get area
		iArea = r.GetArea(iLength, iWidth);
		System.out.println("Area: " + iArea);
		// Call method to print whether or not the rectangle is a square
		r.SquareCheck(iLength, iWidth);
		
		
		
		

	}

}
