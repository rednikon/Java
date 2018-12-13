import java.util.Arrays;
/*
 * CCSF Homework 6B (Extra Credit)
 * Create an array sorting program for homework scores. Then add the top 8 scores to get the student's total.
 * 
 * @author veemac
 */

public class ClassScores 
{
	public static void sortScores(int[] scores)
	{
		Arrays.sort(scores);
		
		int sum = 0;
		
		for(int i : Arrays.copyOfRange(scores, 2, scores.length))
		{
			sum += i;
		}
		System.out.println("The student's homework score total is: " + sum);
		
	}
	
	public static void main(String[] args)
	{
		int[] scores = {1, 3, 5, 5, 10, 9, 9, 7, 9, 10};
		
		sortScores(scores);
	}
}
