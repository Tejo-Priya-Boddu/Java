// String and its methods

public class stringMethods
{
	public static void main(String arg[])
	{
		String txt = "Tejo";
		System.out.println("length of string -- " + ( txt.length()));
		System.out.println("Uppercase of string -- " + (txt.toUpperCase()));
		System.out.println("Lowercase of string -- " + (txt.toLowerCase()));
		System.out.println("index of 'j' in string -- " + (txt.indexOf('j')));
		System.out.println("character at index '3' of string -- " + (txt.charAt(3)));
		System.out.println("concatenated string -- " + txt.concat(" Priya"));
		
		String txt1 = "Tejo";
		String txt2 = "Priya";
		
		System.out.println(txt.equals(txt1));
		System.out.println(txt.equals(txt2));
	}
}