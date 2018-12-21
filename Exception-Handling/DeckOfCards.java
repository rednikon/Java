import java.util.Scanner;

/**
 * Berkeley Homework #9
 * Write a program with exception handling that uses try, catch, and finally.
 * Catch both a standard exception and a custom exception.
 * 
 * @author S08vm (veemac)
 *
 */

public class DeckOfCards 
{

	
	public static void main(String[] args)
	{
		String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
		int deck = 52;
		int userDeck;
		String favoriteSuit;
		
		//Prompting the user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tell me how many cards are in a deck. ");
		userDeck = keyboard.nextInt();
		
		System.out.println("What's your favorite suit of cards? ");
		favoriteSuit = keyboard.next();
		
		try
		{
			for (int i = 0; i <= suits.length; i++)
			{
				if(favoriteSuit != suits[i])
				{
					throw new SuitException();
				}
			}	
		}	
		//catching/throwing custom exception
		catch(SuitException e)
		{
			System.out.println("Oops, that isn't a standard card suit.");
		}
		
		try
		{
			if(deck != userDeck)
			{
				throw new ArithmeticException();
			}
		}
		//Java standard exception
		catch(ArithmeticException ae)
		{
			System.out.println("I'm sorry, that is not the correct amount of cards in a deck.");
		}
	}
}
//creating custom exception	
class SuitException extends Exception 
{
	public SuitException() {}
}

