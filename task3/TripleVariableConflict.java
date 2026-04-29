/* ​9. The Triple Variable Conflict
​Task: Create a Parent class with an instance variable int x = 10;. 
Create a Child class that extends Parent and has its own instance variable int x = 20;.
​Goal: Inside the Child class, create a method showValues(). Inside this method, create a local variable int x = 30;. 
Print all three values of x strictly from within this method:
​Print the local x (should be 30).
​Print the child instance x (should be 20) using this.
​Print the parent instance x (should be 10) using super. */

class Parent
{
	int x = 10;
	public Parent()
	{
		System.out.println("parent class : " + x);
	}
}
class Child extends Parent
{
	int x = 20;
	public Child()
	{
		
		this(20);
	}
	public Child(int x)
	{
		super();
		System.out.println("Child class : " + this.x);
		
	}
	public void showValues()
	{
		
		int x = 30;
		System.out.println( "local variable : " + x);
	}

}
public class TripleVariableConflict
{
	public static void main(String arg[])
	{
		Child obj = new Child();
		obj.showValues();
	}
}


