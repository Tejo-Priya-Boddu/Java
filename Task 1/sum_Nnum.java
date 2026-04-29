// Sum of First N Numbers
//     Task: Create a variable n = 10.
//     Goal: Use a While Loop or For Loop to calculate the sum of numbers from 1 to n (1 + 2 + 3 + ... + 10) and print the total.

public class sum_Nnum
{
	public static void main(String arg[])
	{
		int n =10;
		int sum= 0;
		for(int i = 1; i<=n; i++)
		{
			sum = sum +i;
		}
		System.out.println(" the sum of " + n + " numbers is " + sum);
	}
}