// static keyword

class mobile
{
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name );
	}
}

class staticKeyword
{
	public static void main(String arg[])
	{
		mobile obj1 = new mobile();
		obj1.brand ="Apple";
		obj1.price = 1500;
		mobile.name = "Smart Phone";
		
		mobile obj2 = new mobile();
		obj2.brand ="Samsung";
		obj2.price = 1700;
		mobile.name = "Smart Phone";
		
		mobile.name = "phone";

		obj1.show();
		obj2.show();
	}
}
		