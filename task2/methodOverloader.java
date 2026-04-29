// 4.The Method Overloader
//     Task: Create a Calculator class with three methods, all named add.
//            Method 1: Takes two int parameters and returns their sum.
//            Method 2: Takes three int parameters and returns their sum.
//            Method 3: Takes two double parameters and returns their sum.
//      Goal: Create an object of Calculator in main and call all three methods, storing and printing their returned results.


class calculator
{
	public int add(int n1, int n2)
	{
		return n1 + n2;
	}
	public int add(int n1, int n2, int n3)
	{
		return n1 + n2 + n3;
	}
	public double add(double n1, double n2)
	{
		return n1 + n2;
	}
}

public class methodOverloader
{
	public static void main(String arg[])
	{
		calculator obj = new calculator();
		int op1 = obj.add(3,4);
		int op2 = obj.add(3,4,9);
		double op3 = obj.add(13.5555,4.1111);
		System.out.println("two int inputs " + op1 );
		System.out.println("three int inputs " + op2);
		System.out.println("two double inputs " + op3);
	}
}