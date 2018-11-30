/**
 * A Mad Libs game that takes input from the user to create a funny sentence. 
 * @author veemac
 */
import java.util.Scanner;
public class MadLib {

	public static void main(String[] args) {
		
		//creating Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//fields and asking for user input
		System.out.println("Please answer each question to create a funny story!");
		
		int number;
		System.out.println("Enter a number: ");
		number = keyboard.nextInt();
		
		String adjective1;
		System.out.println("Enter an adjective: ");
		adjective1 = keyboard.next();
		
		String past;
		System.out.println("Enter a verb in past tense: ");
		past = keyboard.next();
		
		String adjective2;
		System.out.println("Enter another adjective: ");
		adjective2 = keyboard.next();
		
		String ing;
		System.out.println("Enter a verb ending in - ing: ");
		ing = keyboard.next();
		
		String noun;
		System.out.println("Enter a plural noun: ");
		noun = keyboard.next();
		
		String famous;
		System.out.println("Enter the name of a famous person: ");
		famous = keyboard.next();
		
		//full printout of the fun story
		System.out.println("One day a " + adjective1 + " ghost " + past + " across the street while carrying " + adjective2 + " bucket full of dynamite. Then it came across " + number + " " + noun + " that were " + ing + " at a child.");
		System.out.println("This story was written by " + famous + ".");
	}

}
