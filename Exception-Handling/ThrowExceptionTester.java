import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * CCSF Exercise #22
 * 
 * Write a main method that will create a Scanner, and use the method getIntegers() to get a bunch of integers from the user. 
 * Once the list is returned, just print out the list in the main method.
 * Don't include any exception handling--just throw the exception in the main method.
 * Now try running it and see what happens if you have an out of bounds value.
 * Now, rewrite the main method using try-catch block to prompt the user to re-enter any number that is out of bounds.
 * 
 * @author Taiyi, Kelly, Vee
 */
public class ThrowExceptionTester 
{
	public List getIntegers(Scanner scanner, int min, int max) throws OutOfRangeException
	{
		List list = new ArrayList<>();
		while (scanner.hasNext())
		{
			int val = scanner.nextInt();
			if (val == -1)
			{
				break;
			}
			if (val < min || val > max)
			{
				throw new OutOfRangeException(Integer.toString(val) + "is out of range.");
			}
			list.add(val);
		}
		return list;

	}
	
	public static void main(String[] args) throws OutOfRangeException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 5 numbers between 0 - 10: ");
		
		ThrowExceptionTester test = new ThrowExceptionTester();
		List<Integer> list = null;
		
		try
		{
			list = test.getIntegers(scanner , 0, 10);
		}
		catch(OutOfRangeException e)
		{
			System.out.println("Sorry, there is a number out of range. The list must be between 0 - 10.");
		}
		finally 
		{
			System.out.println("Thank you for playing.");
		}
		
	}
}

