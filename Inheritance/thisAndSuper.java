//This and Super methods

class A
{
	public A()
	{
		super();
		System.out.println("in A");
	}
	public A(int a)
	{
		super();
		System.out.println("in A int");
	} 
}
class B extends A
{
	public B()
	{
		super();//even if you do not mention super, every construct will have super() method defaultly.
		System.out.println("in B");
	}
	public B(int a)
	{
		//super(a);
		this();// executes the constructor of the same class.
		System.out.println("in B int");
	} 
}

public class thisAndSuper
{
	public static void main(String arg[])
	{
		B obj = new B(2);
	}
}
