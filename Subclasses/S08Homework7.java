/**
 * Write a program in which you create a class, a subclass of that class, and a demo class with main.
 * The subclass must: override a method inherited from its immediate superclass and use the keywords this and super 
 * to make use of both versions of the overridden method.
 * 
 * The class with main should not be a subclass of any class. The main method must show the results of the method calls.
 * 
 * Bonus: Use this. and super. to reference fields or super() or super(args) to call a constructor.
 * Bonus: Use an abstract class.
 * 
 * @author veemac
 *
 */
class S08Homework7 
{
	//creating demos and showing results in the main, without having any subclasses
	public static void main(String[] args)
	{
		System.out.println("Welcome to the cars demo, demonstrating super and subclasses, an abstract class, and overrided methods.\n");

		//Toyota class demo
		ToyotaSedan demoToyota = new ToyotaSedan();
		demoToyota.showBrand();
		demoToyota.getMPG();
		demoToyota.getDoors(true);
	
		//Ford class demo
		FordSportsCar demoFord = new FordSportsCar();
		demoFord.showBrand();
		demoFord.getMPG();
		demoFord.getDoors(false);
	}	
		
}

//the abstract superclass
abstract class Vehicle
{
	String brand;
	int mpg = 20;
	boolean isFourDoor = true;
	
	abstract void showBrand();
	
	abstract void getMPG();
	
	abstract void getDoors(boolean isFourDoor);	
}

//extending the abstract class
class ToyotaSedan extends Vehicle
{
	String brand = "Toyota";
	int mpg = 30;
	
	
	void showBrand()
	{
		//Using this. to reference a field 
		System.out.println("The brand of this sedan is: " + this.brand);
	}
	
	void getMPG()
	{
		System.out.println("The standard Toyota sedan gets " + this.mpg + " per gallon.");
	}
	
	void getDoors(boolean isFourDoor)
	{
		//Using super. to reference a field in the superclass
		System.out.println("This sedan comes with 4 doors: " + super.isFourDoor + "\n");
	}
}

//extending to a subclass
class FordSportsCar extends ToyotaSedan
{
	//class fields
	String brand = "Ford";
	int mpg = 18;
	boolean isFourDoor = false;
	
	void showBrand(String brand)
	{
		System.out.println(this.brand + " makes a sports car called the RS.");
	}
	
	void useSuper()
	{
		super.getMPG();
	}
	//overriding a method
	void getDoors(boolean fourDoors)
	{
		
		System.out.println("This sports car comes with 4 doors: " + this.isFourDoor);
	}
}



