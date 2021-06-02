package math_overload;

import java.util.Scanner;

public class math_overload {
	// Create instance of Scanner
	Scanner reader = new Scanner(System.in);
	
	// Create method to determine the data type used
	public int GetDataType() {
		// Declare variables
		int iDataType;
		// Prompt user for their choice of data type
		System.out.println("What data type would you like to use (enter the number)?"
				+ "\n(1) Integers"
				+ "\n(2) Floats"
				+ "\n(3) Doubles");
		
		// Read in the input
		iDataType = reader.nextInt();
		
		// Return the data type
		return iDataType;
	}
	
	// Create method to read in the numbers
	public int iGetNumber1(int iNum1) {
		System.out.println("Enter a number: ");
		iNum1 = reader.nextInt();
		return iNum1;
	}
			
	public int iGetNumber2(int iNum2) {
		System.out.println("Enter another number: ");
		iNum2 = reader.nextInt();
		return iNum2;
	}
	
	public float fGetNumber1(float fNum1) {
		System.out.println("Enter a number: ");
		fNum1 = reader.nextFloat();
		return fNum1;
	}
	
	public float fGetNumber2(float fNum2) {
		System.out.println("Enter another number: ");
		fNum2 = reader.nextFloat();
		return fNum2;
	}

	public double dGetNumber1(double dNum1) {
		System.out.println("Enter a number: ");
		dNum1 = reader.nextDouble();
		return dNum1;
	}

	public double dGetNumber2(double dNum2) {
		System.out.println("Enter another number: ");
		dNum2 = reader.nextDouble();
		return dNum2;
	}
	
	// Create method to determine operation
	public int GetOperation() {
		// Declare variable
		int iOperation;
		
		// Prompt user for input
		System.out.println("What operation would you like to use (enter the number)?"
				+ "\n(1) Add"
				+ "\n(2) Subtract"
				+ "\n(3) Multiply"
				+ "\n(4) Divide");
		iOperation = reader.nextInt();
		
		return iOperation;
	}
	
	// Create method to complete the operations, use method overloading to use the correct method based on the data type
	// for integers:
	public void MakeCalculations(int iNum1, int iNum2, int iOperation){
		// Declare variable for result
		int iAnswer = 0;
		// Use switch statements to determine the operation
		switch (iOperation) {
			// Adding
			case 1:
				iAnswer = iNum1 + iNum2;
				break;
				
			// Subtracting
			case 2:
				iAnswer = iNum1 - iNum2;
				break;
				
			// Multiplying
			case 3:
				iAnswer = iNum1 * iNum2;
				break;
			
			// Dividing
			case 4:
				iAnswer = iNum1 / iNum2;
				break;
		}
		
		// Print out answer
		System.out.println("Answer: " + iAnswer);
		
	}
	
	// for floats:
	public void MakeCalculations(float fNum1, float fNum2, int iOperation){
		// Declare variable for result
				float fAnswer = 0;
				// Use switch statements to determine the operation
				switch (iOperation) {
					// Adding
					case 1:
						fAnswer = fNum1 + fNum2;
						break;
						
					// Subtracting
					case 2:
						fAnswer = fNum1 - fNum2;
						break;
						
					// Multiplying
					case 3:
						fAnswer = fNum1 * fNum2;
						break;
					
					// Dividing
					case 4:
						fAnswer = fNum1 / fNum2;
						break;
				}
		// Print out answer
		System.out.println("Answer: " + fAnswer);
	}
	
	// for doubles:
	public void MakeCalculations(double dNum1, float dNum2, int iOperation){
		// Declare variable for result
				double dAnswer = 0;
				// Use switch statements to determine the operation
				switch (iOperation) {
					// Adding
					case 1:
						dAnswer = dNum1 + dNum2;
						break;
						
					// Subtracting
					case 2:
						dAnswer = dNum1 - dNum2;
						break;
						
					// Multiplying
					case 3:
						dAnswer = dNum1 * dNum2;
						break;
					
					// Dividing
					case 4:
						dAnswer = dNum1 / dNum2;
						break;
				}
		// Print out answer
		System.out.println("Answer: " + dAnswer);
		
	}

}
