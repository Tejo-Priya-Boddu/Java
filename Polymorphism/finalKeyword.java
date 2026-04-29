//final keyword 
// can be used with variable, method, class.

//final class Calc
class Calc
{
	public final void show()
	{
		System.out.println("in Calc show");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

// class AdvCalc extends Calc --- final class cannot be inherited

class AdvCalc extends Calc
{
	public void show()// we cannot override the final show method in Calc class.. it gives error
	{
		System.out.prinltn("in AdvCalc");
	}
}
public class finalKeyword
{
	public static void main(String arg[])
	{
		/* final int num = 8;
		// num = 9; you can't change value of final variable
		System.out.println(num);*/
		
		AdvCalc obj = new AdvCalc();
		obj.show();
		obj.add(3,4);


	}
}
