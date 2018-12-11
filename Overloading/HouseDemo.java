/**
 * Berkeley Homework #6
 * Demonstrate overloading with both constructors and methods. 
 * Make sure you: start with a parameterless non-default constructor, overload a constructor that you define, overload a method that you define,
 * and the class main must call both a constructor and the methods.
 * 
 * @author S08vm, veemac
 *
 */

class House 
{
	//basic requirements of a house
	boolean hasKitchen;
	boolean hasLivingRoom;
	boolean hasBathroom;
	boolean hasBedroom;
	boolean hasSecondStory;
	boolean hasBackYard;
	boolean hasGarage;
	
	//first constructor, parameterless. this is the foundation <-- pun intended ;), for all Houses we "build" in this program
	House()
	{
		hasKitchen = true;
		hasLivingRoom = true;
		hasBathroom = true;
		hasBedroom = true;
		System.out.println("The house constructor has been called. We start with a house that has a Kitchen, Living Room, Bathroom, and Bedroom.");
	}
	
	//parameterized constructor
	House(boolean withSecondStory)
	{
		this();
		this.hasSecondStory = true;
		System.out.println("This house is being built with a second story.");
	}
	
	House(boolean withBackYard, boolean withGarage)
	{
		//making if...else ladder to give options for back yard and garage.
		this(true);
		this.hasBackYard = true;
		System.out.println("This property has a back yard.");
		this.hasGarage = true;
		System.out.println("This house also has a garage.");
	}	
	
}

class HousePainting
{
	String paintHouse(String chosenColor)
	{
		System.out.println("Once finished, this house will be " + chosenColor + ".");
		return chosenColor;
	}
	
	String paintHouse(String trimColor, int numberOfOpenings)
	{
		System.out.println("Its " + numberOfOpenings + " doors and windows will be painted " + trimColor + ".");
		return trimColor;
	}
}

//building a demo house
public class HouseDemo
{
	 public static void main(String[] args)
	 {
		 System.out.println("Welcome to the house construction program.\n");
		 
		 //instantiating a new House object to call its constructors
		 House myHouseDemo = new House(true, true);
		 
		 //calling the parameterized, overloaded methods
		 HousePainting paintedHouse = new HousePainting();
		 paintedHouse.paintHouse("Brown");
		 paintedHouse.paintHouse("Green", 17);
		 
	 }
}







