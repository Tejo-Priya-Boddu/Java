//10.Array of Objects
//          Task: Create a Student class with instance variables rollNo, name, and marks.
//          Goal: 1. In main, create 3 different Student objects and assign data to them.
//                     2. Create an Array of Students: Student students[] = new Student[3];
//                     3. Put your 3 objects inside this array.
//                     4. Loop through the students array and print the name of only the students who scored more than 50 marks.

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
		s1.name = " Tejo ";
		s1.marks = 76;
		
		student s2 = new student();
		s2.rollno = 2;
		s2.name = " Nani ";
		s2.marks = 84;

		student s3 = new student();
		s3.rollno = 3;
		s3.name = " priya ";
		s3.marks = 96;

		student students[] = new student[3];

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for(student stud : students )
		{
			if(stud.marks > 80)
			{
				System.out.println(stud.name + " --> " + stud.marks);
			}
		}
	}
}

