// Pass or Fail (Ternary Operator)
//   Task: Create a variable marks = 45;.
//   Goal: Use the Ternary Operator (? :) to verify if marks are greater than 40. If yes, assign "Pass" to a string variable, otherwise "Fail". Print the string.

public class pass_fail
{
	public static void main(String arg[])
	{
		int marks = 45;
		System.out.println("given marks :" + marks);
		String result = (marks > 40) ? "Pass" : "Fail" ;
		System.out.println(result);
	}
}