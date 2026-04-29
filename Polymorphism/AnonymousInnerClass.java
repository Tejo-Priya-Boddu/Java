//Anonymous Inner Class
class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

public class AnonymousInnerClass
{
	public static void main(String arg[])
	{
		A obj = new A() 
		{		
			public void show()
			{
				System.out.println("in new show");
			}
		};
		obj.show();
	}
}