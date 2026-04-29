// enums

enum Status{
	Running, Failed, Pending, Success;
}
public class Enums
{
	public static void main(String arg[])
	{
		int i = 5;
		Status s = Status.Failed;
		System.out.println(s);
		System.out.println(s.ordinal());
		
	}
}