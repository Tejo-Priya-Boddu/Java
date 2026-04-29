//9.The Jagged Array Structure
//         Task: Create a Jagged Array (a 2D array where the rows have different numbers of columns).
//                 Row 0: 3 columns
//                 Row 1: 4 columns
//                 Row 2: 2 columns
//          Goal: Populate it with random numbers (you can use (int)(Math.random() * 10) to generate them like Telusko did, or hardcode them). Print the jagged array using a nested Enhanced For-Loop.

public class jaggedArray
{
	public static void main(String arg[])
	{
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{	
				arr[i][j] = (int)(Math.random()*10);
			}
		}
		for(int n[] : arr)
		{
			for(int m : n) 
			{
				System.out.print(m + "  ");
			}
			System.out.println();
		}
	}
}
		