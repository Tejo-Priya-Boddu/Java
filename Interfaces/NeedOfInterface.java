// Need of an Interface

interface Computer
{
	void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compiler, run");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run, Faster");
	}
}

class Developer
{
	public void devApp(Computer lap)
	{
		lap.code();
	}
}
public class NeedOfInterface
{
	public static void main(String arg[])
	{
		Computer lap = new Laptop();
		Computer desk = new Desktop();
		
		Developer obj = new Developer();
		obj.devApp(desk);
	}
}