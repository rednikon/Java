package org.ccsf.homework;
/* CCSF Homework #3
 * Creating a counter class, and operations to enable counting and resetting the count
 * 
 * @author veemac
 */

public class Counter
{
	//creating a private count variable
	private int count;
	
	
	public Counter()
	{
		//establishing the count at zero
		count = 0;
	}
	
	
	public void click()
	{
		//the count increases by one each time the counter is clicked
		count +=1;
	}
	
	
	public int getCount()
	{
		//enabling the display of the count
		return count;
	}
	
	
	public void reset()
	{
		//putting the count back to zero if it's reset
		count = 0;
	}
	
	
	
		
	

}
