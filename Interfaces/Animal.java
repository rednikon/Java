/**
 * Berkeley Homework #8
 * Write an application with four (4) separate .java files and a manifest .txt file:
 * 1. An interface, such as Returnable, with two methods.
 * 2. Two classes that have non-empty implementations of the interface
 * 3. A class with main that exercises the implemented methods on both kinds of objects, such as InterfaceImplementationDemo.java
 * 4. a manifest.txt file that tells the command-line jar utility which class has the main method
 * 
 * Submit it as a .jar file
 * 
 * @author veemac
 *
 */

//building the interface with two methods
public interface Animal 
{	
	String speak(String typeOfSpeak);
	
	String eat(String typeOfFood);
}
