//3-D Array

public class threeDarray
{
	public static void main(String arg[])
	{
		int nums[][][] = new int[2][3][2];
		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums[i].length; j++)
			{
				for(int k=0; k<nums[i][j].length; k++)
				{
					nums[i][j][k] = (int)(Math.random()*10);
				}
			}
		}
		
		for(int n[][]: nums)
		{
			for(int m[]: n)
			{
				for(int x: m)
				{
					System.out.print(x + " ");
				}
				System.out.print("  :  ");
			}		
			System.out.println();
		}
	}
}		