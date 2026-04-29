// increment and decrement 
public class increment{
	public static void main(String a[])
	{
		int num =7;
		// num = num + 1;
		//num++;    // Post - increment
		//++num ;     // Pre - increment

		// num--; //post decrement
		//--num;  //pre decrement 


		// There will be no difference for normal statement
		// if we fetch the value then there is difference in post and pre increment

		//int result = ++num;  //pre increment  give  8 as o/p  [ increments value first and then fetch]
		int result = num++;  //post increment gives 7		[ fetches first and then increments ]

		System.out.println(result);
	}
}