/**
 * Write a program to tell the number of rows and columns in an array. 
 * Write a method to print the array, one row per line (using for loops). 
 * Write another method to print the array, one row per line, using the other kind of for loops.
 * 
 * 
 * 
 * @author veemac
 *
 */
public class ClassExercise16 
{
	//the arrays being examined
	static int[][] nums2D = 
		{ 
			{3, 4, 5, 6},
	        {2, 4, 3, 8},
	        {3, 5, 4, 1},
	    };
	
	static int[][] secondArray =
		{
				{29, 80},
				{45, 70},
		};
	
	//printing the amount of rows and columns 
	static String printRowsColumns(int[][] nums)
	{
		System.out.println("Number of Rows = " + nums.length);
		System.out.println("Number of Columns = " + nums[0].length);
		return "";
		
	}
	
	//printing the array, version 1
	public static String printArray(int[][] nums)
	{
		String output = "";
		for (int x = 0; x < nums.length; x++)
		{
			for (int y = 0; y < nums[x].length; y++)
			{
				output += nums[x][y] + ", ";
			}
			output += "\n";
		}
		return output;
	}

	//printing the array, version 2
	public static String printArray2(int[][] nums)
	{
		String output = "";
		for (int[] row : nums)
		{
			for(int number : row)
			{
				output += number + ", ";
			}
			output += "\n";
		}
		return output;
	
	}
	
	//finding the sum of the 2D array
	public static int sum(int[][] nums)
	{
		int sum = 0;
		for (int[] row : nums)
		{
			for (int number : row)
			{
				sum += number;
			}
		}
		return sum;
		
	}
	
	//sum the rows using a method
	public static int[] sumRows(int[][] numbers)
	{
		int[] sum = new int[numbers.length];
		int rowSum;
		
		for (int row = 0; row < numbers.length; row++)
		{
			rowSum = 0;
			for (int column = 0; column < numbers[row].length; column++)
			{
				rowSum += numbers[row][column];
			}	
		sum[row] = rowSum;
		System.out.println("Row " + row + ": " + rowSum);
		}
		return sum; //I know this is returning the hashcode of the array, haven't figured out how to eliminate that yet. 
	
		
	}
	//sum the columns using a method
	public static int[] sumColumns(int[][] numbers)
	{
		int[] sum = new int[numbers[0].length];
		int columnSum;
		for (int column = 0; column < numbers[0].length; column++)
		{
			columnSum = 0;
			for (int row = 0; row < numbers.length; row++)
			{
				columnSum += numbers[row][column];
			}
		sum[column] = columnSum;
		System.out.println("Column " + column + ": " + columnSum);
		}
		return sum;
		 
	}
	

	//calling and printing all methods / array values in the main
	public static void main(String[] args)
	{
		System.out.println(printRowsColumns(nums2D));
		System.out.println(printArray(nums2D));
		System.out.println(printArray2(nums2D));
		System.out.println(sum(nums2D));
		System.out.println(sumRows(nums2D));
		System.out.println(sumColumns(nums2D));
		System.out.println();
		System.out.println(printRowsColumns(secondArray));
		System.out.println(printArray(secondArray));
		System.out.println(printArray2(secondArray));
		System.out.println(sum(secondArray));
		System.out.println(sumRows(secondArray));
		System.out.println(sumColumns(secondArray));
		
	}

}
