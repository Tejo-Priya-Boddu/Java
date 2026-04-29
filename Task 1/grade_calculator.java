// Grade Calculator (Switch Case)
//   Task: Create a char variable grade (e.g., 'A', 'B', 'C', 'F').
//   Goal: Use a Switch Statement to print a remark based on the grade:

public class grade_calculator
{
	public static void main(String arg[])
	{
		char grade='F';
		System.out.println("the given grade is : " + grade);
		switch(grade){
			case 'A':
				System.out.println("GOOD Keep going...");
				break;
			case 'B':
				System.out.println("You need to focus more...");
				break;
			case 'C':
				System.out.println("You need to practice more...");
				break;
			case 'D':
				System.out.println("Study Hard...");
				break;
			case 'F':
				System.out.println("Sorry you are failed...");
				break;
			default:
				System.out.println("Enter valid grade please....");
		}
	}
}
