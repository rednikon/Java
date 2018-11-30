package org.ccsf.homework.money;
/**
 * prompt the user for a double value representing a monetary amount. Return what that equals in the fewest number of bills and coins possible.
 * @author veemac
 */


import java.util.Scanner;

public class Money {

	//creating double fields
	public static void main(String[] args) {
		double amount;
		double twenty, ten, five, one;
		double quarter, dime, nickel, penny;
		
		Scanner scan = new Scanner(System.in);
		
		//asking user for input
		System.out.println("What amount would you like to calculate? ");
		amount = scan.nextDouble();
		
		//creating breakdown method of cash amount using division and modulo operators
		System.out.println();
		
		twenty = amount / 20;
		amount = amount % 20;
		
		ten = amount / 10;
		amount = amount % 10;
		
		five = amount / 5;
		amount = amount % 5;
		
		one = amount / 1;
		amount = amount % 1;
		
		quarter = amount / .25;
		amount = amount % .25;
		
		dime = amount / .10;
		amount = amount % .10;
		
		nickel = amount / .05;
		amount = amount % .05;
		
		penny = amount / .01;
		amount = amount % .01;
		
		//printing out cash amount to user
		System.out.println((int)twenty + " twenty dollar bills");
		System.out.println((int)ten + " ten dollar bills");
		System.out.println((int)five + " five dollar bills");
		System.out.println((int)one + " one dollar bills");
		System.out.println((int)quarter + " quarters");
		System.out.println((int)dime + " dimes");
		System.out.println((int)nickel + " nickels");
		System.out.println((int)penny + " pennies");

	}

}
