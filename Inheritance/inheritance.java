// inheritance 

public class inheritance
{
	public static void main(String arg[])
	{
		VeryAdvCalc obj = new VeryAdvCalc();
		int r1 = obj.add(3,5);
		int r2 = obj.sub(8,4);
		int r3 = obj.mul(3,5);
		int r4 = obj.div(8,4);
		double r5 = obj.power(2,4);
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

	}
}