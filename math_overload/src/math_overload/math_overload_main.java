package math_overload;

public class math_overload_main {

	public static void main(String[] args) {
		// Declare variables
		int iNum1 = 0, iNum2 = 0;
		float fNum1 = 0, fNum2 = 0;
		double dNum1 = 0, dNum2 = 0;
		// Create instance of math overload class
		math_overload mo = new math_overload();
		
		// Call method to get the data type
		int iDataType = mo.GetDataType();
		
		// Use a switch statement to determine which method to call based off the data type
		switch (iDataType) {
			// for integers
			case 1:
				iNum1 = mo.iGetNumber1(iNum1);
				iNum2 = mo.iGetNumber2(iNum2);
				break;
			
			// for floats
			case 2:
				fNum1 = mo.fGetNumber1(fNum1);
				fNum2 = mo.fGetNumber2(fNum2);
				break;
			
			// for doubles
			case 3:
				dNum1 = mo.dGetNumber1(dNum1);
				dNum2 = mo.dGetNumber2(dNum2);
				break;
		}
		
		// Call method to determine the operation the user wants to do
		int iOperation = mo.GetOperation();
		
		// Call method overloading to make calculations using method overloading to use the method with the same data type
		// Use switch statements to determine which method to call best on the operation
		switch(iDataType) {
		
			// for integers
			case 1:
				mo.MakeCalculations(iNum1, iNum2, iOperation);
				break;
				
			// for floats
			case 2:
				mo.MakeCalculations(fNum1, fNum2, iOperation);
				break;
				
			// for doubles
			case 3:
				mo.MakeCalculations(dNum1, fNum2, iOperation);
				break;
		}

	}

}
