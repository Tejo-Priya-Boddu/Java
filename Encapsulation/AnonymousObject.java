// Anonymous Object 

class A
{
	public A()
	{
		System.out.println("Object Created");
	}
	public void show()
	{
		System.out.println("in show method");
	}
}
public class AnonymousObject
{
	public static void main(String arg[])
	{
		new A().show();
	}
}