package equal_overload;

public class equal_overload {
	// Use method overloading to determine if parameters are equal for different amounts of parameters
	public void CheckEqual(int iNum1, int iNum2, int iNum3){
		if (iNum1 == iNum2 && iNum1 == iNum3) {
			System.out.println("The numbers you entered are all equal to each other.");
		}
		else {
			System.out.println("The numbers you entered are not all equal to each other.");
		}
	}
	public void CheckEqual(int iNum1, int iNum2){
		if (iNum1 == iNum2) {
			System.out.println("The numbers you entered in are equal to each other.");
		}
		else {
			System.out.println("The numbers you entered in are not equal to each other.");
		}
		
	}
}
