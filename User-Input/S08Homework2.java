/*
 * Berkeley Homework #2
 * Prompt the user to input an integer, store the input in a variable
 * Prompt the user for a second value and store it in a different variable
 * Process those two two variables using both relational and logical operators, such as > (relational) and & or | (logical)
 * Show a result to the user
 * @author S08 veemac
 */

import java.util.Scanner;



public class S08Homework2 
{	
	
	public static void main(String[] args)
	{
		//creating a new scanner variable
		Scanner keyboard = new Scanner(System.in);
		
		//integer variables for user input
		int firstNumber, secondNumber;
		
		//prompting the user and assigning the number variables to user input
		System.out.println("Please enter a number: ");
		firstNumber = keyboard.nextInt();
		
		System.out.println("Please enter a second number: ");
		secondNumber = keyboard.nextInt();
		
		//comparing the variables using rational and logical operators 
		if (firstNumber > secondNumber && firstNumber != secondNumber)
		{
			System.out.println("Your first number " + firstNumber + " is larger than you second number " + secondNumber);
		}
		
		else if
			(firstNumber < secondNumber && firstNumber != secondNumber)
		{
			System.out.println("Your second number " + secondNumber + " is larger than your first number " + firstNumber);	
		}
		
		else
		{	
			System.out.println("The two numbers you provided are equal.");
		}
	}

}
