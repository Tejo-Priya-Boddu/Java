//The Diamond Pattern
//    Task: Create a variable size = 5 (this represents the number of rows for the top half).
//    Goal: Print a diamond shape using stars (*).

public class diamond_pattern
{
	public static void main(String arg[])
	{
		int n=5;
		int nsp = n-1;
		int nst = 1;
		for(int i=1; i<=2*n-1;i++)
		{
			for(int j=1; j<=nsp; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=nst; k++)
			{
				System.out.print("* ");
			}	
			if(i<n)
			{
				nsp--;
				nst += 1;
			}
			else
			{
				nsp++;
				nst -=1;
			}
			System.out.println("");
		}		
		
	}
}