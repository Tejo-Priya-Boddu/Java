// Multidimensional Array

public class two_d_array
{
	public static void main(String arg[])
	{
		int num[][] = new int[3][4];
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<4; j++)
			{
				//nums[i][j] = (int)Math.random()*10;
			}
		}
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{	
				System.out.print(nums[i][j] +" ");
			}
			System.out.println();
		}
	}
}