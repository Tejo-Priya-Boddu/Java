/* ​5. The Super Call in Constructors
​Task: Create a Vehicle class with a parameterized constructor that takes a String brand and prints it.
​Goal: Create a Car class that extends Vehicle. Write a constructor for Car. 
Inside the Car constructor, use the super("Toyota") keyword as the very first line to trigger the parent class's constructor. */

class Vehicle
{
	public Vehicle(String brand)
	{
		System.out.println(brand);
	}
}
class Car extends Vehicle
{
	public Car()
	{
		super("Tayota");
		System.out.println("in Car constructor");
	}
}

public class SuperCall
{
	public static void main(String arg[])
	{
		Car obj = new Car();
	}
}
