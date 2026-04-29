/* ​1. The Static Object Counter
​Task: Create a class named Player. Give it a static int playerCount = 0;. Inside the constructor of Player, increment playerCount by 1.
​Goal: In your main method, create 3 different Player objects. Print the playerCount using the class name (Player.playerCount).
 This proves that static variables are shared across all objects.*/

class Player
{
	static int playerCount = 0;
	public Player()
	{
		playerCount = playerCount + 1;
	}
}

public class StaticObjectCounter
{
	public static void main(String arg[])
	{
					   // playerCount = 0
		Player obj1 = new Player();// playerCount = 1
		Player obj2 = new Player();// playerCount = 2
		Player obj3 = new Player();// playerCount = 3
		System.out.println(Player.playerCount);// output is 3 
		//
	}
}