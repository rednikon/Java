import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * CCSF Homework #4
 * Write a class VowelCounter that reads a file, and determines how many of the characters are vowels of each type. 
 * After reading the entire file, VowelCounter will print a count of characters that are of each vowel type (a, e, i, o, u) and how many characters are non-vowels.
 * 
 * @author veemac
 *
 */
public class VowelCounter 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//initializing vowel and consonant values to 0
		int consonants = 0;
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;

			
		//importing the file into the program
		FileInputStream file = new FileInputStream("VowelCounter.java");
		InputStream newStream = file; 
		Scanner scan = new Scanner(newStream);
		
		
		//creating a while loop for the length of the file
		while (scan.hasNextLine()) 
		{
			String line = scan.nextLine();
			
			for (int i =0; i < line.length(); i++)
			
			{
				//putting the letters into their respective buckets and counting them
				if (line.charAt(i) == 'a' || line.charAt(i) ==  'A')
				{
					aCount++;
				}
					
				else if (line.charAt(i) == 'e' || line.charAt(i) ==  'E')
				{
					eCount++;
				}
				
				else if (line.charAt(i) == 'i' || line.charAt(i) ==  'I')
				{
					iCount++;
				}

				else if (line.charAt(i) == 'o' || line.charAt(i) ==  'O')
				{
					oCount++;
				}
			
				else if (line.charAt(i) == 'u' || line.charAt(i) ==  'U')
				{
					uCount++;
				}
				
				else
				{
					consonants++;
				}
			}
		
		}
		//printing out the results
		System.out.println("For the file, the character counts are:");
		System.out.println("Consonants: " + consonants);
		System.out.println("A: " + aCount);
		System.out.println("E: " + eCount);
		System.out.println("I: " + iCount);
		System.out.println("O: " + oCount);
		System.out.println("U: " + uCount);
	
	}	
}
	
