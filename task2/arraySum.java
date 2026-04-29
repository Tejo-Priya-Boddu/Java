// 6.Array Sum and Average
//       Task: Create an array of integers representing student marks: int marks[] = {55, 78, 92, 45, 88};.
//       Goal: Use a standard for loop to calculate the total sum of all the marks in the array. Once you have the sum, calculate the average (sum / length of array) and print both the total sum and the average.

public class arraySum
{
	public static void main(String arg[])
	{
		int marks[] = {55, 78, 92, 45, 88};
		double sum = 0;
		for(int i=0; i<marks.length; i++)
		{
			sum = sum + marks[i];
		}	
		System.out.println("sum of array : " + sum );
		double avg = sum / marks.length ;
		System.out.println("average of array : " + avg);
	}
}