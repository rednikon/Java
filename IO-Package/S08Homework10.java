import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
 * Write a program that makes use of the functionality that the java.io package provides.
 * Have you program read a file, modify that file, and save the newly-modified file to the file system
 * 
 * @author veemac
 */
public class S08Homework10 
{
	//method to access our file and read it. Prints the contents to the user
	static void readFile()
	{
		try 
		{
			Scanner textFile = new Scanner(new File("Homework10.txt"));
			while(textFile.hasNextLine())
			{
				String fileString = textFile.nextLine();
				
				System.out.println(fileString);
			}
		}
		//A catch in case we can't find the file / it's in the wrong directory.
		catch(FileNotFoundException e)
		{
			System.out.println("Whoops. I couldn't find your file.");
		}
	}
	//Using the FileWriter method to edit the file.
	static void editFile()
	{

		try
		{
			FileWriter fw = new FileWriter("Homework10.txt", true);
			System.out.println("\nPlease write some text to add to this file.");
			Scanner userInput = new Scanner(System.in);
			String fileName = "Homework10.txt";

			while(true)
			{
				String input = userInput.nextLine();
				fw.write(input);
				fw.close();
			}
		}
		catch (IOException ioe)
		{
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
	//The main method calls our other class methods.
	public static void main(String[] args)
	{
		readFile();
		editFile();
	}
}
