/*
 * Write a method called isIsosceles that accepts 3 integer parameters that represent the lengths of the side of a triangle.
 * The method returns true if the triangle is isosceles, but not equilateral, i.e., if exactly 2 of the sides have equal length, and false otherwise. 
 * Test it out with some sample inputs in main.
 * @author veemac 
 */


public class ClassExercise09b 
{
	public void isIsosceles(int x, int y, int z)
	{
		if (x == y && x!= z)
		{
			System.out.println("True");
		}
		
		else if
			(x == z && x!= y)
		{
			System.out.println("True");
		}
		
		else if
			(y == z && y!=x)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
public static void main(String[] args)
	{
	ClassExercise09b test = new ClassExercise09b();
	test.isIsosceles(4, 4, 4);
	test.isIsosceles(9, 9, 3);
	test.isIsosceles(2, 8, 8);
	test.isIsosceles(11, 3, 11);
	}
}
