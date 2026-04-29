// Method Overriding

class A 
{
	public void show()
	{
		System.out.println("in A show");
	}
	public void config()
	{
		System.out.println("in A config");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

public class methodOverriding
{
	public static void main(String arg[])
	{
		B obj = new B();
		obj.show();
		obj.config();
	}
}