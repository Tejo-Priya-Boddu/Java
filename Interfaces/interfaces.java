// Interfaces

interface A
{
	int age = 19; // variables in interfaces are final and static 
	String name = "tejo";
	
	void show();
	void config();
}
interface X
{
	void run();
}
interface Y extends X
{

}

class B implements A,Y
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in config");
	}
	public void run()
	{
		System.out.println("running..");
	}
}
public class interfaces
{
	public static void main(String arg[])
	{
		A obj;
		obj = new B();
		obj.show();
		obj.config();
		System.out.println(A.name + " : " + A.age);
		X obj1 = new B(); // (X) obj -- we can typecast the object 
		obj1.run();


	}
}