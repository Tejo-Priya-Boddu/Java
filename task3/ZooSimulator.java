/* ​10. The Zoo Simulator
​Task: 1. Create a base class Animal with a method makeSound().
2. Create subclasses Dog and Cat that override makeSound().
3. Create a separate Zoo class. Inside Zoo, write a method public void feedAnimal(Animal a) that accepts the parent reference. 
Inside this method, call a.makeSound().
​Goal: In your main method, pass a new Dog() object and a new Cat() object into the feedAnimal() method. 
Watch how the single feedAnimal method adapts to whatever specific animal you pass it. */

class Animal
{
	public void makeSound()
	{
		System.out.println("in Animal class makeSound");
	}
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("in Dog class makeSound");
	}
}
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("in Cat class makeSound");
	}
}
class Zoo
{
	public void feedAnimal(Animal a)
	{
		a.makeSound();
	}
}
public class ZooSimulator
{
	public static void main(String arg[])
	{
		Animal d = new Dog();
		Animal c = new Cat();
		Zoo obj = new Zoo();
		obj.feedAnimal(d);// passing dog object with animal reference
		obj.feedAnimal(c);// passing cat object with animal referece.....
		
	}
}