/* ​3. The Constructor Overloader
​Task: Create a Book class with variables title and author.
​Goal: Create two constructors. One default constructor that assigns "Unknown Title" and "Unknown Author".
A second parameterized constructor that accepts and sets both values. Create two objects (one with each constructor) and print their details.*/

class Book
{
	String title;
	String author;
	public Book()
	{
		title = "UnKnown Title";
		author = "UnKnown Author";
	}
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	public void show()
	{
		System.out.println(title + " : " + author);
	}
}

public class ConstructorOverloader
{
	public static void main(String arg[])
	{
		Book obj1 = new Book();
		obj1.show();
		Book obj2 = new Book("Harry Potter", "J K Rowling");
		obj2.show();
	}
}
