/**
 * 
 */
package Assignment2;

import java.util.Scanner;

/**
 * @author user
 *Write a program to find the highest among the given 3 numbers.
 *Output : Print the highest number.
 */
public class HighestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int secondNumber = sc.nextInt();
		System.out.println("Enter 3rd Number");
		int thirdNumber = sc.nextInt();
		
		if(firstNumber==secondNumber && secondNumber == thirdNumber)
		{
			System.out.println("All 3 numbers are same");
		}
		else if(firstNumber>secondNumber && firstNumber > thirdNumber)
		{
			System.out.println("Highest Number is "+firstNumber);
		}
		else if(secondNumber>thirdNumber)
		{
			System.out.println("Highest Number is "+secondNumber);
		}
		else
		{
			System.out.println("Highest Number is "+thirdNumber);
		}
	}
}