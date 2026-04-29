// Max of Three Numbers
//   Task: Create three variables x, y, and z with different values.
//   Goal: Use if-else-if statements to find and print the largest of the three numbers.

public class max_num
{
	public static void main(String arg[])
	{
		int x =20;
		int y= 99;
		int z = 13;
		System.out.println("the numbers are : " +x +" and "+y+" and "+z);
		if(x>y && x>z)
		{
			System.out.println("maximun number of three is :" +x);
		}
		else if(y>x && y>z)
		{
			System.out.println("maximun number of three is :" +y);
		}
		else
		{
			System.out.println("maximun number of three is :" +z);
		}
	}
}
		