/*
 * Write a method called maxOfTwo that accepts two integer parameters and returns the larger of the two.
 * In your main method make a few tests of maxOfTwo method to make sure it works.
 * 
 * @author veemac 
 */

public class ClassExercise09
{
		
	public int maxOfTwo(int firstNumber, int secondNumber)
	{
		if (firstNumber >= secondNumber)
	{
			System.out.println("The max of " + firstNumber + " and " + secondNumber + " is: " + firstNumber);
			return firstNumber;
	}
		else 
		{
			System.out.println("The max of " + firstNumber + " and " + secondNumber + " is: " + secondNumber);
			return secondNumber;
		}
	
	}	
public static void main(String[] args)
	{
	ClassExercise09 test = new ClassExercise09();
	test.maxOfTwo(9, 11);
	test.maxOfTwo(42, 6);
	test.maxOfTwo(5, 2);		
	}
	
}
