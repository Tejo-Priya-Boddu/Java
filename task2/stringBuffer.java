//5.StringBuffer Manipulator
//      Task: Create a StringBuffer object initialized with your first name (e.g., StringBuffer sb = new StringBuffer("John");).
//      Goal: Use inbuilt StringBuffer methods to:
//              .append() your last name to it.
//              .insert() a middle name at the correct index.
//              Print the final mutated string, along with its .length() and .capacity().

public class stringBuffer
{
	public static void main(String arg[])
	{
		StringBuffer sb = new StringBuffer("Tejo ");
		System.out.println(sb);
		sb.append("Boddu ");
		System.out.println(sb);
		sb.insert(5,"Priya ");
		System.out.println(sb);
		System.out.println("length : " + sb.length());
		System.out.println("capacity : " + sb.capacity());
	}
}