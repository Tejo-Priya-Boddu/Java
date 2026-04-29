//The Diamond Pattern
//    Task: Create a variable size = 5 (this represents the number of rows for the top half).
//    Goal: Print a diamond shape using stars (*).

public class diamond_pattern
{
	public static void main(String arg[])
	{
		int n=5;
		for(int i=5; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(" ");
				
				
			}
			for(int k=5; k>=i; k--)
				{
					System.out.print("* ");
				}
			System.out.println("");
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
				
				
			}
			for(int k=4; k>=i; k--)
				{
					System.out.print("* ");
				}
			System.out.println("");
		}
		
		
	}
}