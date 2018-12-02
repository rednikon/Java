/**
 * CCSF first homework assignment
 * A simple program that reads back 3 numbers provided by the user.
 * @author veemac
 */
import java.util.Scanner;

public class Echoer {

	public static void main(String[] args) 
	{
		//creating Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//fields
		int num1, num2, num3;
		
		//user input
		System.out.println("Please enter 3 numbers");
		
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		num3 = keyboard.nextInt();

		System.out.println("Thanks. The numbers you entered are: " + num1 + ", " + num2 + ", and " + num3 + ".");
	}

}
