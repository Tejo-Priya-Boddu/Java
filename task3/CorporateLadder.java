/* 1​2. The Corporate Ladder 
​The Scenario: You need to pass data securely up a multi-level inheritance chain without breaking encapsulation.
​The Challenge: You are not allowed to use default (empty) constructors.
 When you say new Manager("Alice", 101, 5);
 in your main method, you must use the super() keyword in the Manager constructor to pass the name and ID up to the Employee constructor,
 which must then use super() to pass the name up to the Person constructor. 
Write a printDetails() method in Manager to print all three variables
(you will need getters in the parent classes since the variables are private!). */

class  Person
{
	private String name;
	public Person(String name)
	{
		this.name = name;	
	}
	public String getName()
	{
		return name;
	}
}

class Employee extends Person
{
	private int ID;
	public Employee(String name, int ID)
	{	
		super(name);
		this.ID =ID;
	}
	public int getId()
	{
		return ID;
	}
	/*public String getName()
	{
		
		return super.getName();
	}
	*/

}
class  Manager extends Employee
{
	
	private int experience;
	public Manager(String name, int ID, int experience)
	{
		super(name,ID);
		
		this.experience = experience;
	}
	
	public void printDetails()
	{
		String n = super.getName();
		int id = super.getId();
		System.out.println( n+" : "+  id +" : "+ experience);
	}
	
}
public class CorporateLadder
{
	public static void main(String arg[])
	{
		Manager M = new Manager("tejo",13,1);
		//String n = M.getName();
		//int id = M.getId();
		M.printDetails();

	}
}
