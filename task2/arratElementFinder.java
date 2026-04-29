// 7.Array Element Finder
//        Task: Create an array of Strings containing 5 names. Create another String variable target = "Alice";.
//        Goal: Write a loop to search through the array. If the target name is found, print "Name found at index: [index number]" and use the break keyword to stop the loop.


public class arrayElementFinder
{
	public static void main(String arg[])
	{
		String names[] = new String[5];
		names[0] = "Tejo";
		names[1] = "Priya";
		names[2] = "Nani";
		names[3] = "Mahi";
		names[4] = "Yashna";
		
		String target = "Nani";
		for(int i=0; i<names.length; i++)
		{
			if(target == names[i])
			{
				System.out.println("name found at index : " + i);
				break;
			}
		}		
	}	
}
		