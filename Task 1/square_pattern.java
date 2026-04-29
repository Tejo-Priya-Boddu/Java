// Pattern Printing (Nested Loops)
//     Task: Use Nested Loops (a loop inside a loop) to print a box of stars.
//     Goal: Print the following pattern for a size of 4x4

public class square_pattern
{
	public static void main(String arg[])
	{
		for(int i =1; i<=4; i++)
		{
			for(int j =1; j<=4; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}