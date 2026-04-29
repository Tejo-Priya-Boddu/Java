// Encapsulation

class Human
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int a)
	{
		age = a;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String n)
	{
		name = n;
	}

}

public class encapsulation
{
	public static void main(String arg[])
	{
		Human obj = new Human();
		obj.setName("tejo");
		obj.setAge(19);
		System.out.println(obj.getName() + " : " + obj.getAge());
	}
}