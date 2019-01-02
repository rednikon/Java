/**
 * Write a class Summer that gets a list of floating point numbers as its command line arguments.
 * The class will read the numbers and print their sum.
 * The class should implement and use a method double sum(double[] values)
 * Note that the method sum should not do any printing. 
 * 
 * @author veemac
 *
 */
public class Summer 
{

	//add up the values of the array using the sum method provided
	static double sum(double[] values)
	{
		double total = 0.0;
		for(int i = 0; i < values.length; i++)
		{
			total += values[i];
		}	
		return total;
	}
	
	//cast the args to doubles, and run though the array to add up the values, calling the sum method
	public static void main(String[] args)
	{			
		double[] argValues = new double[args.length];
		
		
		for(int i =0; i<args.length; i++)
		{
			argValues[i] = Double.parseDouble(args[i]);
		}
		
		System.out.println(sum(argValues));
		
	}
}
