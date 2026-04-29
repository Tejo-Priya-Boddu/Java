// The Fibonacci Sequence
//    Task: Create a variable count = 10.
//    Goal: Print the first 10 numbers of the Fibonacci series.

public class fibanocci
{
	public static void main(String arg[])
	{
		int count =10;
		int a= 0;
		int b = 1;
		int sum = 0;
		System.out.println(b);
		for(int i =0; i<count; i++)
		{	
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
			
		}
		
	}
}
