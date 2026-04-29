//downcasting and upcasting 

class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("in B show");
	}
}
public class UpcastingDowncasting
{
	public static void main(String arg[])
	{
		A obj = new B(); // it is implicitly (A) new B()
		obj.show1();// up casting as B object os having A reference 
		
		B obj1 = (B) obj;
		obj1.show2();// down casting  chaning A ref to B reference

	}
}

		
			