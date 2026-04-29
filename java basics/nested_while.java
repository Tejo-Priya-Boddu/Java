// nested while loop
// loop inside a loop
public class nested_while
{
	public static void main(String arg[])
	{
		int i = 1;
		while(i<=4)
		{
			System.out.println("inside main loop ");
			System.out.println("hiii  " + i);
			int j=1;
			while(j<=3)
			{
				System.out.println("inside loop -- heloo " + j);
				j++;
			}
			i++;
			System.out.println("out side the nested loop");
		}
		System.out.println("out side the main while loop");
	}
}