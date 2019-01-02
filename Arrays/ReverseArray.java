/**
 * Write a class that gets a set of Strings from the command line. Store the Strings in an array.
 * Implement a method reverse() that will reverse the elements of an array, and use it to show the reversed array.
 * @author veemac
 *
 */
public class ReverseArray 
{
	//reverse method to flip the order of the array
	static void reverse(String[] strings)
	{
		int left = 0;
		int right = strings.length - 1;
		
		while(left < right)
		{
			String stringArray = strings[left];
			strings[left] = strings[right];
			strings[right] = stringArray;
			
			left ++;
			right --;
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		//arguments used to test the array: {"JP", "Vee", "Henry", "Kelly"};
		
		//calling the reverse method and printing out each element of the array in reverse order
		reverse(args);
		for(String str : args)
		{
			System.out.println(str);
		}
		
	}
}
