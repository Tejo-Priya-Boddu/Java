/* 1​3. The Secure String Analyzer 
​The Scenario: You are building a utility tool that analyzes text, similar to the Math class, 
meaning you shouldn't need to create an object to use it.
​The Challenge: 1. Add a private static int usageCount = 0; to track how many times the tool is used.
2. Write a public static void analyze(String text) method. Inside this method, increment the usageCount.
3. The method must convert the string to a character array (using .toCharArray()), loop through it, and count exactly how many vowels (a, e, i, o, u) are in the string. Print the vowel count and the current usageCount.
4. Call this method directly from main using StringAnalyzer.analyze("Object Oriented Programming"); multiple times. */

class StringAnalyzer
{
	private static int usageCount = 0;
	public static void analyze(String text)
	{
		usageCount = usageCount + 1;
		System.out.println(text);
		char[] array = text.toCharArray();
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		int vowelCount = 0;
		for(int i=0; i < array.length; i++)
		{
			//System.out.println(array[i]);
			for(int j=0; j< vowels.length; j++)
			{
				if(array[i] == vowels[j])
				{
					vowelCount++;
				}
			}
		}
		System.out.println("no of vowels are : " + vowelCount);

	}
	public static int getUsageCount()
	{
		return usageCount;
	}
}
public class SecureStringAnalyzer
{
	public static void main(String arg[])
	{
		StringAnalyzer.analyze("Object Oriented Programming");
		StringAnalyzer.analyze("Tejo Priya Boddu");
		StringAnalyzer.analyze("Secure String Analyzer");
		int count = StringAnalyzer.getUsageCount();
		System.out.println("no of times tool used : " + count);

	}
}