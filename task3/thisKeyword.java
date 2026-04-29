/* ​4. The this Keyword Shadowing
​Task: Create a Laptop class with an instance variable String model.
​Goal: Create a setter method public void setModel(String model). Use the exact same variable name model for the parameter.
 Inside the method, use the this keyword to resolve the naming conflict and assign the parameter value to the instance variable.*/

class Laptop
{
	String model;
	public void setModel(String model)
	{
		this.model = model;
	}
	public void show()
	{
		System.out.println(model);
	}
}

public class thisKeyword
{
	public static void main(String arg[])
	{
		Laptop obj = new Laptop();
		obj.setModel("apple");
		obj.show();
	}
}