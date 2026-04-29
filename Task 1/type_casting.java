// Type Casting Practice
//   Task: Create a double variable with a value like 9.99.
//   Goal: Cast it to an int and print the result. Observe how the decimal part is truncated (lost).

public class type_casting
{
	public static void main(String arg[])
	{
		double d = 8.6667;
		System.out.println("before type casting :" +d );
		int i = (int)d;
		System.out.println("after type casting :" +i );
	}
}
		