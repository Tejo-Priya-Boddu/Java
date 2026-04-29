// abstract keyword
// abstract method should be inside an abstract class on;y..
// no need of abstract method in abstract class

abstract class Car
{
	public abstract void drive();
	public abstract void fly();

	public void playMusic()
	{
		System.out.println("playing music");
	}
}

abstract class WagonR extends Car
{
	public void drive()
	{
		System.out.println("driving..");
	}

}
class UpdatedWagonR extends WagonR
{
	public void fly()
	{
		System.out.println("flying..");
	}

}
public class AbstractKeyword
{
	public static void main(String arg[])
	{
	 	Car obj = new UpdatedWagonR();
		obj.drive();
		obj.playMusic();
		obj.fly();

	}
}