package org.berkeley.homework;
/*
 * First homework assignment for Berkeley Java class:
 * 1. Greets the instructor
 * 2. Uses the modulus operator to return the remainder of a division operation
 * 3. Uses escape sequences when printing strings
 * 4. Shows results of two command line arguments
 * 
 * To use this program: please enter your first and last name at the command line
 * 
 * @author veemac  (Vee McClure)
 */


public class Homework1 
{

	public static void main(String[] args) 
	{
		//Printing out a string using arguments and escape sequences
		System.out.println("Hello " + args[0] + " " + args[1]);
		System.out.println("\tPlease enjoy the following\n\t\t math operation");
		

		//Creating an int variable and string that uses the modulus operator 
		int remainder;
		remainder = 40 % 7;
		System.out.println("40 divided by 7 gives you a remainder of " + remainder);
		
	}

}
