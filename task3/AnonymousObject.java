/* ​7. Anonymous Object Execution
​Task: Create a TaskRunner class with a method executeTask() that prints "Task is running...".
​Goal: In your main method, call executeTask() without creating a reference variable. 
Use an Anonymous Object directly (e.g., new TaskRunner()...). */

class TaskRunner
{
	public void executeTask()
	{
		System.out.println("Task is Running...");
	}

}
public class AnonymousObject
{
	public static void main(String arg[])
	{
		new TaskRunner().executeTask();
	}
}
