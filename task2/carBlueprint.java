// 3.Your First Blueprint 
//     Task: Create a new class named Car outside your main class. Give it two instance variables: String brand and int price.
//     Goal: Inside your main method, create an Object of the Car class using the new keyword. Assign values to its variables (e.g., brand = "Tesla", price = 50000) and print them out.

class car
{
	String brand;
	int price;
}

public class carBlueprint
{
	public static void main(String arg[])
	{
		car c1 = new car();
		c1.brand = "Tesla";
		c1.price = 50000;
		System.out.println(c1.brand + " ----> " + c1.price);
	}
}