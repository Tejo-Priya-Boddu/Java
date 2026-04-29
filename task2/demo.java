public class demo
{
	public static void main(String arg[])
	{
		String words[] = {"radar", "java", "level", "programming", "civic"};
		//String target[] ={"radar","avaj","level","gnimmargorp","civic"};
		String rev[] = new String[5];
		for(int i=0; i<words.length; i++)
		{
			StringBuffer sb1 = new StringBuffer(words[i]);
			rev[i] = sb1.reverse().toString();
			//System.out.println(rev[i]);
			boolean result = words[i].equals(rev[i]);
			if(result == true)
			{	
				System.out.println(words[i] + " is a palindrome");
			}

		}
	}
}