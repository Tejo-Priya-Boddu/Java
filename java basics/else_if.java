//if - else if 

public class else_if
{
	public static void main(String arg[])
	{
		int x = 46;
		int y = 17;
		int z = 9;
		if( x>y && x>z)
		{
			System.out.println("max is :" + x);
		}
		else if( y>x && y>z)
		{
			System.out.println("max is :" + y);
		}
		else {
			System.out.println("max is :" + z);
		}
	}
}