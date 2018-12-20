//first class with non-empty implementation of the interface
public class Cat implements Animal
{	
	public String speak(String typeOfSpeak) 
	{
		System.out.println("A cat " + typeOfSpeak);
		return typeOfSpeak;
	}
	
	public String eat(String typeOfFood) 
	{
		System.out.println("A cat eats " + typeOfFood);
		return typeOfFood;
	}
}
