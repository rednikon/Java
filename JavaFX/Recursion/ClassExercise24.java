/**
 * Write a method with signature double power(int n, int exponent) that computes n to the exponent power, i.e., exponent, i.e. n multiplied by itself exponent times.
 * For example, power(2, 3) is 8.  Implement the method using recursion.
 * In a main method, test power(3, 4).  It should yield 81.
 * 
 * @author veemac
 *
 */
public class ClassExercise24 
{
	/*
	 * power method with if else ladder to cover all possible exponent values
	 */
	private static double power(int n, int exponent)
	{
		//if the exponent is a negative number
		if (exponent < 0)
		{
			exponent *= -1;
			return 1 / (n * power(n, exponent - 1));
		}
		//if the exponent is zero (it will always return 1)
		else if (exponent == 0)
		{
			return 1;
		}
		//if exponent is 1 (it will always return n)
		else if (exponent == 1)
		{
			return n;
		}
		//all positive exponent values
		else
		{
			return n * power(n, exponent - 1);
		}
	}
	
	/*
	 * main method calling power, and demonstrating int and exponent values
	 */
	public static void main(String[] args)
	{
		System.out.println("Int = 2, Exponent = 4\nResult: " + power(2, 4));
		System.out.println("\nInt = 16, Exponent = 0\nResult: " + power(16, 0));
		System.out.println("\nInt = 5, Exponent = -2\nResult: " + power(5, -2));
	}
}
