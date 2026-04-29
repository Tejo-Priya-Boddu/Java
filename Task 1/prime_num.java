// Prime Numbers in a Range
//    Task: Create two variables, start = 10 and end = 50.
//    Goal: Print all the Prime Numbers between this range.

public class prime_num
{
	public static void main(String arg[])
	{
		int a=10;
		int b=50;
		//int count = 0;
		for(int num=a; num<=b; num++)
		{	
			int count = 0;
			for(int i=1; i<=num; i++)
			{	
			
				if(num%i == 0)
				{
					//System.out.println(i);
					count = count + 1;
				}
				
			}
			if(count <=2)
			{
				System.out.println(num);
			}
			
			
		}

	}
}
		
