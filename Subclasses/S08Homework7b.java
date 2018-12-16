/**
 * Write a program in which you create a class, a subclass of that class, and a demo class with main.
 * The subclass must: override a method inherited from its immediate superclass and use the keywords this and super 
 * to make use of both versions of the overridden method.
 * 
 * The class with main should not be a subclass of any class. The main method must show the results of the method calls.
 * 
 * Bonus: Use this. and super. to reference fields or super() or super(arg) to call a constructor.
 * Bonus: Use an abstract class.
 * 
 * @author veemac
 *
 */
public class S08Homework7b 
{
	public static void main(String[] args)
	{
		BlueConvertible carDemo = new BlueConvertible();
		carDemo.paintingCar();
	}
	
}

//building the superclass
class BaseVehicle
{
	String typeOfVehicle;
	boolean hasFourWheels;
	boolean hasFourDoors;
	String paintColor;
	
	void build()
	{
		typeOfVehicle = "car";
		hasFourWheels = true;
		hasFourDoors = true;
		System.out.println("The base vehicle that we're building is a " + typeOfVehicle);
	}
	
	void paintingCar()
	{
		paintColor = "Red";
		System.out.println("The " + typeOfVehicle + " will be painted " + paintColor);
	}
}
//building subclass	
class BlueConvertible extends BaseVehicle
{
	void build()
	{
		//referencing a field using super.
		System.out.println("This " + super.typeOfVehicle + " comes as a convertible.");
	}
	
	void paintingCar()
	{
		//overriding the build method, using super and this
		super.build();
		this.build();
		paintColor = "Blue";
		System.out.println("This convertible comes in " + paintColor + ".");
	}
}
