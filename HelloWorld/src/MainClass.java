import java.util.Scanner;
/* Adam Ventura
 * 2/2/2021
 * Wayzata High School
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double num1, num2, average;
		System.out.println("Enter a number: ");
		num1=reader.nextDouble();
		System.out.println("Enter another number: ");
		num2=reader.nextDouble();
		average = (num1 + num2)/2;
		System.out.println("The average of these two numbers is: " + average);
	}

}
