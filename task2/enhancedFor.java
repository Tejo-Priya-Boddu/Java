// 1.The Enhanced For-Loop Array
//    Task: Create an integer array numbers with 5 random values already assigned (e.g., {12, 45, 7, 89, 23}).
//    Goal: Use the Enhanced For-Loop (For-Each loop) to iterate through the array and print every number on a new line.

public class enhancedFor
{
	public static void main(String arg[])
	{
		int array[] = {12, 45, 7, 89, 23};
		for(int n: array)	
		{
			System.out.println(n);
		}
	}
}