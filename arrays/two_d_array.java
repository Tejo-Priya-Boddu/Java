// Multidimensional Array

public class two_d_array
{
	public static void main(String arg[])
	{
		int nums[][] = new int[3][4];
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<4; j++)
			{
				nums[i][j] = (int)(Math.random()*10);
				//System.out.print(nums[i][j] +" ");
			}
		}
		
		System.out.println("Using normal for loop");

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{	
				System.out.print(nums[i][j] +" ");
			}
			System.out.println();
		}

		System.out.println("Using Enhanced for loop");

		//Enhanced for loop
		for(int n[] : nums)
		{
			for(int m : n)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}
}