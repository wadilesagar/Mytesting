package inheritance;

public class Animal 
{
   public void eat() 
	{
	System.out.println("eating");	
	}
   public class Dog extends Animal{
	public void bark ()
	{
		System.out.println("bark");
	}
   }
}