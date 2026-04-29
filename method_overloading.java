//method overloading

class calculator
{
	public int add(int n1, int n2, int n3)//method 1
	{
		return n1 + n2 + n3;
	}
	public int add(int n1,int n2)//method 2
	{
		return n1 + n2;
	}
	public double add(double n1, int n2)//method 3
	{
		return n1 + n2;
	}
}

public class method_overloading
{
	public static void main(String arg[])
	{
		calculator obj = new calculator();
		int r1 = obj.add(2,3,4);// method 1 executes as we are passing 3 parameters
		int r2 = obj.add(13,4);// method 2 executes as we are passing 2 parameters
		double r3 = obj.add(1.222,4);// method 3 exectes as we are passing a double and int parameters
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
