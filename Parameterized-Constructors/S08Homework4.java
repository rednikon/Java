/**
 * A Java file that has 3 classes, parameterized constructors, and parameterized methods. Instance variables, as well as class variables.
 * This file compares road and dirt motorcycles: their fuel range and their ability to go off-road.
 * 
 * @author S08 (veemac)
 *
 */


class RoadMotorcycle
{
	//class variables, including 1 static variable
	String typeOfMotorcycle;
	int mpg;
	int tankSize;
	int range;
	boolean offRoad;
	static boolean isStreetLegal = true;
	
	//parameterized constructor
	RoadMotorcycle(String classification, int mpg, int tankSize, boolean roadOnly)
	{
		//instance variables, and creating a print line of information for the user
		typeOfMotorcycle = classification;	
		this.mpg = mpg;
		range = mpg * tankSize;
		System.out.println("The fuel range for a road bike is: ");
		if(roadOnly) offRoad = true;
		
	}
	
	//parameterized method, and an if-else ladder
	public void canGoOffRoad(RoadMotorcycle road)
	{
		if(road.offRoad)
		{
			System.out.println("The bike cannot go off-road.");
		}
		else
		{
			System.out.println("This bike can be used off-road.");
		}
	}	
	
}

//second class
class DirtMotorcycle
{
	//class variables
	String typeOfMotorcycle;
	int mpg;
	int tankSize;
	int range;
	boolean offRoad;
	static boolean isStreetLegal = false;
	
	
	//parameterized constructor for a dirt bike
	DirtMotorcycle(String classification, int mpg, int tankSize, boolean roadOnly)
	{
		//instance variables, including a boolean
		typeOfMotorcycle = classification;
		if(!roadOnly) offRoad = true;
		this.mpg = mpg;
		this.tankSize = tankSize;
		range = mpg * tankSize;
		
		//print statement for the user about the bike's range
		System.out.println("The fuel range for a dirt bike is: ");
	}
	
	//parameterized method
	public void canGoOffRoad(DirtMotorcycle dirt)
	{
		if(dirt.offRoad)
		{
			System.out.println("The bike can go off-road.");
		}
		else
		{
			System.out.println("This bike cannot be used off-road.");
		}
	}	
	
}


//third class with the main method, shows the results of the method calls for both road and dirt motorcycles
public class S08Homework4 
{

	public static void main(String[] args) 
	{	
	//calling RoadMotorcycle's static variable
	System.out.println("Is the road bike street legal? " + RoadMotorcycle.isStreetLegal);
	
	//instantiating a new RoadMotorcycle object, with parameters
	RoadMotorcycle testRoadMotorcycle = new RoadMotorcycle("Road", 40, 4, true);
	
	//showing results of RoadMotorcycle method calls
	System.out.println(testRoadMotorcycle.range);
	testRoadMotorcycle.canGoOffRoad(testRoadMotorcycle);
	
	//A new line for readability
	System.out.println();
	
	//calling DirtMotorcycle's static variable
	System.out.println("Is the dirt bike street legal? " + DirtMotorcycle.isStreetLegal);

	//instantiating a new DirtMotorcycle object, with parameters. Printing method calls
	DirtMotorcycle testDirtMotorcycle = new DirtMotorcycle("Dirt", 25, 3, false);
	System.out.println(testDirtMotorcycle.range);
	testDirtMotorcycle.canGoOffRoad(testDirtMotorcycle);
	}
	
}
