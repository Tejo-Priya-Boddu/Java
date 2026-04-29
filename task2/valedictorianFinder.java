/* 13.The Valedictorian Finder
             Task: Create a Student class. Give it two instance variables: String name and an integer array int[] marks (to hold marks for 3 subjects).
              Goal: 1. Inside the Student class, create a method public int calculateTotal() that loops through the student's marks array, adds them up, and returns the total.
                      2. Inside your main class, create an Array of 3 Students.
                      3. Initialize each student with a name and an array of 3 random marks.
                     4. Loop through the array of students, call calculateTotal() for each, and find the student with the highest total score. 
			Print the name and total score of that top student. */

class student
{
	String name;
	int marks[] = new int[3];
	public int calculateTotal(int arr[])
	{
		//int arr = new int[3];
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
}
public class valedictorianFinder
{
	public static void main(String arg[])
	{
		student s1 = new student();
		s1.name = "tejo";
		s1.marks[0] = 88;
		s1.marks[1] = 78;
		s1.marks[2] = 91;
		//s1.marks[] ={88,78,91};
		
		student s2 = new student();
		s2.name = "priya";
		s2.marks[0] = 88;
		s2.marks[1] = 98;
		s2.marks[2] = 91;
		//s2.marks[] ={88,98,91};
		
		student s3 = new student();
		s3.name = "nani";
		s3.marks[0] = 98;
		s3.marks[1] = 97;
		s3.marks[2] = 91;
		//s3.marks[] ={98,97,91};
		
		student students[] = new student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		for(student stud : students)
		{
			System.out.println(stud.name + " : " + stud.marks);
		}
		
		

		int total[] = new int[3];
		total[0] = students[0].calculateTotal(s1.marks);
		total[1] = students[1].calculateTotal(s2.marks);
		total[2] = students[2].calculateTotal(s3.marks);
		System.out.println(total[0]);
		System.out.println(total[1]);
		System.out.println(total[2]);
		
		if((total[0] > total[1]) && (total[0] > total[2]))
		{
			System.out.println(students[0].name + " --> " + total[0] );
		}
		else if((total[1] > total[0]) && (total[1] > total[2]))
		{
			System.out.println(students[1].name + " --> " + total[1] );
		}
		else
		{
			System.out.println(students[2].name + " --> " + total[2] );
		}
		
	}
}










