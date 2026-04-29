/* ​8. Dynamic Method Dispatch 
​Task: Use the Shape, Circle, and Triangle classes from Task 6.
​Goal: In your main method, create a reference variable of the parent class: Shape s;.
​Assign it a circle object: s = new Circle(); and call s.draw().
​Reassign the exact same reference to a triangle object: s = new Triangle(); and call s.draw().
This perfectly demonstrates how the same reference changes behavior at runtime depending on the object it holds. */

class Shape
{
	public void draw()
	{
		System.out.println("drawing generic shape");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("drawing a circle");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("drawing a Triangle");
	}
}
public class DynamicMethodDispatch
{
	public static void main(String arg[])
	{
		Shape obj = new Shape();
		obj.draw();
		
		obj = new Circle();
		obj.draw();
	
		obj = new Triangle();
		obj.draw();
	}
}
