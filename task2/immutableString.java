// 2.Proving String Immutability
//    Task: Create a String variable name = "Java";. Try to concatenate it by simply writing name.concat(" Programming"); on the next line without reassigning it to a variable.
//    Goal: Print name. Observe that it still prints "Java". Next, fix it by reassigning the result (name = name + " Programming";) and print it again to prove that Strings are immutable and require a new object for changes.

public class immutableString
{
	public static void main(String arg[])
	{
		String name = "Java";
		name.concat("Programming");
		
		System.out.println( name);
		
		name = name + " Programming" ;
		System.out.println(name);
	}
}