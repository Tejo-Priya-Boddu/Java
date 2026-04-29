//11.The Palindrome Array Filter
//         Task: Create an array of Strings containing a mix of random words and palindromes: String[] words = {"radar", "java", "level", "programming", "civic"};
//         Goal: Loop through this array. For each word, use StringBuffer to reverse it. If the original word is equal to the reversed word, print: "[word] is a Palindrome".


public class palindromeArrayFilter
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