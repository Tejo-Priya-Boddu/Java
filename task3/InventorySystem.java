/*1​1. The RPG Inventory System 
​The Scenario: You are building a simple inventory system for a role-playing game.
​The Challenge: In your main method, create an Array of Items: Item[] inventory = new Item[3];.
Fill this array with one of each subclass object (Upcasting). 
Finally, write a for loop that iterates through the inventory array and calls useItem() on each one. */
class Inventory
{
	public void show()
	{
		System.out.println("inside the inventory");
	}
	public void useItem()
	{
		System.out.println("using the item in row1");
	}
	
}
class Row1 extends Inventory
{
	public void useItem()
	{
		System.out.println("using the item in row1");
	}
}
class Row2 extends Inventory
{
	public void useItem()
	{
		System.out.println("using the item in row2");
	}
}	
class Row3 extends Inventory
{
	public void useItem()
	{
		System.out.println("using the item in row3");
	}
}
public class InventorySystem
{
	public static void main(String arg[])
	{
		Inventory obj = new Inventory();
		obj.show();
		
		Inventory Item[] = new Inventory[3];

		Item[0] = (Inventory) new Row1();
		Item[1] = (Inventory) new Row2();
		Item[2] = (Inventory) new Row3();
	
		//Item[0].useItem();

		for(int i = 0; i < 3; i++)
		{
			Item[i].useItem();
		}

	}
}
