//String Buffer

public class stringBuffer
{
	public static void main(String arg[])
	{
		StringBuffer sb = new StringBuffer("Tejo");
		System.out.println("capacity -- " + sb.capacity());
		System.out.println("length -- " + sb.length());
		sb.append(" Boddu");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.insert(4, "priyaluuu ");
		System.out.println(sb);
	}
}