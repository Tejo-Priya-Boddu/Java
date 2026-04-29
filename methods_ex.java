// methods

class computer
{
	public void playmusic()
	{
		System.out.println("playing music....");
	}
	public String getMePen(int cost)
	{
		if(cost >= 10)
			return "PEN";
		return "NOTHING...";
	}
}

public class methods_ex
{
	public static void main(String arg[])
	{
		computer obj = new computer();
		obj.playmusic();
		String str = obj.getMePen(11);
		System.out.println(str);
	}
}