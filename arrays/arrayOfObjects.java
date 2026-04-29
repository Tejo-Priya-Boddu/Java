//Array of Objects

class student
{
	int rollno;
	String name;
	int marks;
}
public class arrayOfObjects
{
	public static void main(String arg[])
	{
		student s1 = new student();
		s1.rollno = 1;
		s1.name = "tejo";	
		s1.marks = 88;

		student s2 = new student();
		s2.rollno = 2;
		s2.name = "priya";	
		s2.marks = 90;

		student s3 = new student();
		s3.rollno = 3;
		s3.name = "riya";	
		s3.marks = 96;
		
		
		student students[] = new student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(student stud : students)
		{
			System.out.println(stud.name + " --->  " + stud.marks);
		}
	}
}
		