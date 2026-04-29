//static block

class mobile
{
	String brand;
	int price;
	static String name;
	
	static
	{
		name = "phone";
		System.out.println("in static block");
	}

	public mobile()
	{
		brand = " ";
		price = 1300;
		System.out.println("in constructor block");
	}

	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name );
	}

}

public class staticBlock
{
	public static void main(String arg[])throws ClassNotFoundException
	{

		Class.forName("mobile");

		/* mobile obj1 = new mobile();
		obj1.brand ="Apple";
		obj1.price = 1500;
		mobile.name = "Smart Phone";
		
		mobile obj2 = new mobile();
		obj2.brand ="Samsung";
		obj2.price = 1700;
		mobile.name = "Smart Phone";
		
		mobile.name = "phone";

		obj1.show();
		obj2.show(); */
	}
}
		