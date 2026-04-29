// Operators
public class operators{
	public static void main(String arg[])
	{
		int a = 10;
		int b = 3;

		//Relational operators
		System.out.println(a +"and " + b);
		System.out.println("Relational Operators");
		System.out.println("a > b :" + (a>b));
		System.out.println("a < b :" + (a<b));
		System.out.println("a <= b :" + (a<=b));
		System.out.println("a >= b :" + (a>=b));
		System.out.println("a != b :" + (a!=b));
		System.out.println("a == b :" + (a==b));


		//Logical Operators 
		boolean x=true;
		boolean y = false;

		System.out.println("Logical Operators");
		System.out.println("x && y : " + (x&&y));
		System.out.println("x || y : " + (x||y));

		//ternary operators

		System.out.println("Ternary Operators");
		int max = (a>b)? a:b;
		System.out.println("maximum : "+max);
	}
}
