/*
 * Write a simple game where the user tries to guess a random number. The program needs to tell the user if the guess is too high or too low.
 * First generate a random number, then prompt the user to make a guess.
 * Compare the guess to the selected number and provide appropriate output
 * 
 * @author veemac
 */
import java.util.Scanner;
import java.util.Random;


public class HiLo 
{
	public static void main(String[] args)
	{
		Random randomNumber = new Random();
		Scanner scan = new Scanner(System.in);
		int number;
		int guess;
		number = randomNumber.nextInt();
		
		System.out.println("Let's play a game. I will pipck a number, and you will guess it.\n\nOk, I've picked a number. What is your guess? ");
		guess = scan.nextInt();
		
		if (number > guess)
		{
			System.out.println("Too low, the number was: " + number);
		}
		
		else if
			(number < guess)
		{
			System.out.println("Too high, the number was: " + number);
		}

		else if
			(number == guess)
		{
			System.out.println("Great guess, you win!");
		}		
	}
	
}
