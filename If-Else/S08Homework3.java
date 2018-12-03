import java.util.*;

/**
 * Berkeley Homework #3
 * Create a program of 120 lines or less that has all of the following:
 * if...else ladder, switch, while loop, do-while, for loop, for each loop
 * 
 * Optional features: a static method, a Scanner, relational or logical operators 
 * 
 * @author veemac
 */
public class S08Homework3 
{
	public static void main(String[] args)	
	{		
		//nested for loops to welcome the user
		for (int row = 5; row > 0; row--)
		{
			for (int star = row; star > 0; star--)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("\nWelcome to the numbers and letters game.\n");
		for (int row = 1; row <= 5; row++)
		{
			for (int star = 1; star <= row; star++)
				System.out.print("*");
			
			System.out.println();
		}
		System.out.println("\nPlease enter a number, and I will tell you: if it's even or odd, if it's one of my favorite numbers (or type 0 to exit): ");
		Scanner keyboard = new Scanner(System.in);
		int userNumber = keyboard.nextInt();
		
		//if else ladder to determine if the given number is even or odd
		if (userNumber == 0)
		{
			System.out.println("On to the next game.");
		}
		else if (userNumber % 2 == 0)
		{
			System.out.println("The number you have chosen is even.");
		}
		else
		{
			System.out.println("The number you have chosen is odd.");
		}
		//a for each loop with array
		int[] arrayOfInts =
			{ 3, 5, 6, 7, 9, 11, 23, 44, 55, 99 };
		boolean isFavorite = false;
		for(int i : arrayOfInts)
		{
			int counter = 1;
			if (i != userNumber)
			{
				counter++;
			}
			else
			{
				isFavorite = true;
				if(isFavorite)
				System.out.println(userNumber + " is one of my favorite numbers.");
				break;
			}
		}
		//do while loop
		System.out.println("\n\nEnter a letter from the word California, or end this program by typing the letter x: ");
		Scanner letter = new Scanner(System.in);
		char userLetter = letter.next().toLowerCase().charAt(0);
		char quit = 'x';
	         
	    do
	    {
			if(userLetter =='c') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='a') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='l') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='i') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='f') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='o') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='r') System.out.println(userLetter + " is a letter from the word California.");
			else if(userLetter =='n') System.out.println(userLetter + " is a letter from the word California.");
	        else System.out.println(userLetter + " is not a letter from California, or 'x': ");
	        break;
	        }
	    
	        while(userLetter != quit);
	        System.out.println("\n\nEnter a number out of the 415 or 650 area codes: ");
	        int swtichNumberTest = keyboard.nextInt();
	        switch(swtichNumberTest)
	        {
	            case 4:
	            System.out.println("You have entered the number: " + swtichNumberTest + " out of the 415 area code.");
	            break;
	            case 1:
	            System.out.println("You have entered the number: " + swtichNumberTest + " out of the 415 area code.");
	            break;
	            case 5:
	            System.out.println("You have entered the number: " + swtichNumberTest + " out of both the 415 and 650 area codes.");
	            break;
	            case 6:
	            System.out.println("You have entered the number: " + swtichNumberTest + " out of the 650 area code.");
	            break;
	            case 0:
	            System.out.println("You have entered the number: " + swtichNumberTest + " out of the 650 area code.");
	            break;
	            default:
	            System.out.println("You did not pick a number out of the San Francisco area codes.");
	        }
	        //while loop
	        System.out.println("\nDid you enjoy the game? Y / N");
	        char userFeedback = keyboard.next().toUpperCase().charAt(0);
	        while(userFeedback == 'Y')
	        {
	        	System.out.println("Thank you for your participation!");
	        	break;
	        }
	}
}
