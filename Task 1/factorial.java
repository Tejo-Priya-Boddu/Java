// Factorial Finder
//    Task: Create a variable num = 5.
//    Goal: Calculate the factorial of num using a For Loop. (Factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120).

public class factorial
{
	public static void main(String arg[])
	{
		int num = 5;
		int factorial=1;
		for(int i=1; i<=num; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("factorial of " + num + " is " + factorial);
	}
}