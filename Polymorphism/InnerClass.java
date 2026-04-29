//inner class : a class inside a class

class A
{
	int age;
	public void show()
	{
		System.out.println("in show");
	}
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}
public class InnerClass
{
	public static void main(String arg[])
	{
		A obj = new A();
		obj.show();
		
		//A.B obj1 = obj.new B();
		//obj1.config();

		A.B obj2 = new A.B(); // only if innerclass is static 
		obj2.config();

	}
}