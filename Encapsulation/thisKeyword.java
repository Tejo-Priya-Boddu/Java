// 'this' keyword

class Human
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

public class thisKeyword
{
	public static void main(String arg[])
	{
		Human obj = new Human();
		obj.setName("tejo");
		obj.setAge(19);
		System.out.println(obj.getName() + " : " + obj.getAge());
	}
}