/*
 * A class with a main method that calls the implemented methods
 */
public class AnimalDemo 
{
	public static void main(String[] args)
	{
		Dog dogDemo = new Dog();
		dogDemo.speak("barks.");
		dogDemo.eat("Alpo.");
		System.out.println();
		Cat catDemo = new Cat();
		catDemo.speak("meows.");
		catDemo.eat("Fancy Feast.");
	}
}
