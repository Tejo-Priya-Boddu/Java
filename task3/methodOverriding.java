/* ​6. Method Overriding Basics
​Task: Create a Shape class with a method draw() that prints "Drawing a generic shape".
​Goal: Create two subclasses: Circle and Triangle. Override the draw() method in both subclasses to print "Drawing a Circle" 
and "Drawing a Triangle" respectively. Call all three methods from main using their respective objects. */

class Shape
{
	public void draw()
	{
		System.out.println("Drawing a generic shape");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Triangle");
	}
}

public class methodOverriding
{
	public static void main(String agr[])
	{
		Shape obj1 = new Shape();
		Circle obj2 = new Circle();
		Triangle obj3 = new Triangle();
		obj1.draw();
		obj2.draw();
		obj3.draw();
	}
}