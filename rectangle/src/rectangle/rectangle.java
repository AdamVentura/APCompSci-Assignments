package rectangle;

public class rectangle {
// Declare variables
int iLength, iWidth;

	// Use constructer to initialize variables
	public rectangle() {
		iLength = 0;
		iWidth = 0;
	}
	
	// Use method to find perimeter
	public int GetPerimeter(int iLength, int iWidth) {
		// Declare variable for perimeter
		int iPerimeter;
		// Make calculations
		iPerimeter = (2 * iLength) + (2 * iWidth);
		// return the perimeter
		return iPerimeter;
	}
	
	// Use method to find the area
	public int GetArea(int iLength, int iWidth) {
		// Declare variable for area
		int iArea;
		// Make calculations
		iArea = iLength * iWidth;
		// return the area
		return iArea;
	}
	
	// Use method to determine if rectangle is a square
	public void SquareCheck(int iLength, int iWidth) {
		// if the length and width are equivalent, the rectangle is a square
		if (iLength == iWidth) {
			System.out.println("Your rectangle is a square.");
		}
		else {
			System.out.println("Your rectangle is not a square.");
		}
}
	

}
