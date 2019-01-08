//second class with non-empty implementation of the interface
public class Dog implements Animal
{
	
	public String speak(String typeOfSpeak) 
	{
		System.out.println("A dog " + typeOfSpeak);
		return typeOfSpeak;
	}
	
	public String eat(String typeOfFood) 
	{
		System.out.println("A dog eats " + typeOfFood);
		return typeOfFood;
	}
}
