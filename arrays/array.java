// Arrays

public class array
{
	public static void main(String arg[])
	{
		 int num[] = {2,3,5,7};  //normal array if you know the elements 
		 for(int i = 0; i<4; i++)
		{
			System.out.println(num[i]);
		}

		System.out.println("Dynamic array ");
		//Dynamic array if you don't know the values before
		int nums[] = new int[4];
		nums[0] = 3;
		nums[1] = 6;
		nums[2] = 8;
		nums[3] = 9;
		for(int i = 0; i<4; i++)
		{
			System.out.println(nums[i]);
		}

	}
}