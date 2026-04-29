// Class and Object

class calculator
{
	int a;  //variable  or data member
	public int add(int n1, int n2)
	{
		int r = n1 + n2;
		return r;
	}
}

public class object_class
{
	public static void main(String arg[])
	{
		int num1 =13;
		int num2 = 4;
		
		calculator calc = new calculator();
		int result = calc.add(num1, num2);
		System.out.println(result);
	}
}