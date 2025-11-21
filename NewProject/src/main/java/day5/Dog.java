package day5;

public class Dog extends Animal
{
	public Dog()
	{
		super();
		//System.out.println("Hello");
	}
	public Dog(int b)
	{
		super(10);
		
		
		
		System.out.println(b);
	}
	

	public static void main(String[] args)
	{
		Dog obj=new Dog();
		Dog obj1=new Dog(10);
		
	}
	
}