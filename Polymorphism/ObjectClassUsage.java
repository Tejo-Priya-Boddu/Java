class Laptop
{
	String model;
	int price;
	
	public String toString()
	{
		return model + " : " + price;
	}
	public boolean equals(Laptop that)
	{
		return this.model.equals(that.model) && this.price == that.price ;
	}

}

public class ObjectClassUsage
{
	public static void main(String arg[])
	{
		Laptop obj1 = new Laptop();
		obj1.model = "Lenovo Yoga";
		obj1.price = 1000;

		Laptop obj2 = new Laptop();
		obj2.model = "Lenovo Yoga";
		obj2.price = 1000;
		
		boolean result = obj1.equals(obj2);

		System.out.println(result);// gives false 
		//System.out.println(obj);// this gives hashcode : Laptop@7344699f
		//System.out.println(obj.toString()); //everytime we class an object it will call toString() even if we do not mention it 
	}
} 