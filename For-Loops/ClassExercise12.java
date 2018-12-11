/**
 * For loop exercises
 * @author veemac
 *
 */
public class ClassExercise12 
{
	public static void main(String[] args)
	{
		//print out rows of stars in descending order starting with 5 and ending with 1 star in the row
		for (int row = 5; row > 0; row--)
		{
			for (int star = row; star > 0; star--)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		//print out two pound signs, with increasing spaces between them for each row
		for (int row = 0; row <= 4; row++)
		{
			System.out.print("#");
			for (int space = 0; space <= row - 1; space++)
				System.out.print(" ");
			
			System.out.print("#");
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
		//use multiple for loops to create spaces from the edge in descending order, while counting up from 1 to 4
		for (int row = 1; row <= 4; row++)
		{
			for (int space = 3; space >= row; space--)
				System.out.print(" ");
			
				for (int number = 1; number <= row; number++)
						System.out.print(row);
				System.out.println();
		}
		
		
	}
	
	
}
