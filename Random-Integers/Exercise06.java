import java.util.Random;
/**
 * A program that generates random integer radius (r) and height (h) for a cylinder in the range of 1 to 20 (inclusive), then computes the volume and the surface area of the cylinder
 * @author veemac
 */
public class Exercise06 {

	public static void main(String[] args) 
	{
		//create a random number
		Random randomGenerator = new Random();
		
		System.out.println("Welcome to the Cylinder Prgram!");
		
		//creating the variables
		int radius, height;
		double volume, surfaceArea;
		
		//generating random numbers
		radius = randomGenerator.nextInt(20) + 1;
		height = randomGenerator.nextInt(20) + 1;
		
		//calculations
		volume = Math.PI * Math.pow(radius,  2) * height;
		surfaceArea = 2 * Math.PI * radius * height;
		
		//output for the user
		System.out.println("Radius = " + radius);
		System.out.println("Height = " + height);
		System.out.println("Cylinder Volume: " + volume);
		System.out.println("Cylinder Surface Area: " + surfaceArea);

	}

}
