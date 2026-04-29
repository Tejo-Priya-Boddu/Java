// Simple Swapper
//   Task: Create two integer variables, a = 10 and b = 20.
//   Goal: Swap their values so that a becomes 20 and b becomes 10. Print the values before and after swapping.

public class swapper
{
	public static void main(String arg[])
	{
		int a = 9;
		int b = 80;
		int temp;
		System.out.println("before swapping " +a + "and" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping " +a + "and" + b);
	}
}
