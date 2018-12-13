package org.ccsf.homework;


/*
 * A class creating two objects that test the methods in the Counter class
 * @author veemac
 */

public class CounterTest 
{
	public static void main(String[] args)
	{
		//first counter for the test run
		Counter firstCounter = new Counter();
		
		//print out initialize the count value, which is 0
		System.out.println(firstCounter.getCount());
		firstCounter.click();
		firstCounter.click();
		firstCounter.click();
		
		//printing out the value after 3 clicks
		System.out.println(firstCounter.getCount());
		
		//resetting the counter to 0
		firstCounter.reset();
		
		//printing out the new reset value
		System.out.println(firstCounter.getCount());
		
		
		
		//the second test
		Counter secondCounter = new Counter();
		
		//printing out initial value again
		System.out.println(secondCounter.getCount());
		
		//making 2 clicks of the counter
		secondCounter.click();
		secondCounter.click();
		
		//printing out the value after 2 clicks
		System.out.println(secondCounter.getCount());

	
	}
	
	
	
}
