/**
 * Berkeley Homework #5
 * Write a program with 2 classes. A StringDemo class with a main method that calls the methods of the second class.
 * Create a second class called StringManipulator that has two methods: the first method calls String methods 
 * on an array of type String with at least three(3) different String methods calls INSIDE a for-each loop.
 * The second method calls at least three (3) different String methods on individual Strings that are not in a String array.
 * 
 * @author S08, veemac
 *
 */

//a main method that calls the methods of the second class
public class StringDemo 
{
	public static void main(String[] args)
	{
		//calling the static methods from the StringManipulator class
		StringManipulator.listMotorcycles();
		StringManipulator.modifyIndividuals();
		
	
		
	}
}


//two methods: the first method calls String methods on an array of type String with at least three(3) different String
//methods calls INSIDE a for-each loop.
//The second method calls at least three (3) different String methods on individual Strings that are not in a String array.
//Write two STATIC methods for your StringManipulator class, one for its for-each loop, and the other for its Strings that are not in
//a for-each loop. Make sure that the StringDemo class calls static methods of the StringManipulator class by using the class name rather than an object name.
class StringManipulator
{
	//first static method
	public static void listMotorcycles()
	{
		//string array
		String[] motorcycleBrands = {"KTM ", "Yamaha", "Honda	", "Triumph  ", "Ducati			"};
			
		//for-each loop with 3 string methods
		for (String s: motorcycleBrands)
		{
			System.out.println("The first character in this brand is: " + s.charAt(0));
			
			System.out.println("Does this brand name contain the letter 'a'? " + s.endsWith("a"));
			
			System.out.println("Can you guess the motorcycle brand?\nThis brand name with white space trimmed: " + s.trim());
			
			System.out.println();
		}

	}

	//second static method
	public static void modifyIndividuals()
	{
		//3 different string methods on 3 separate strings
		String beemer = "BMW";
		System.out.println("BMW put through the toLowerCase method is: " + beemer.toLowerCase());
		
		String kawi = "Kawasaki";
		System.out.println("Kawasaki's letters switched makes: " + kawi.replace('a', 'i'));
		
		System.out.println("Let's concatonate 'motor' and 'cycle' and see what we get.... " + "motor".concat("cycle"));
		
		
		
	}
	
}
