//max num of 3 numbers

public class max_num_of3
{
	public static void main(String arg[])
	{
		int a = 4;
		int b = 19;
		int c = 13;
		if(a > b)
		{
			if(a > c)
			System.out.println("max is " + a);
		}
		else if(b > c)
			System.out.println("max is :" +b);
		else
			System.out.println("max is :" +c);
	}
}