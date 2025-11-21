package day2;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super("Rasna");
		
		System.out.println("This is a default child constructor");
	}
	public SuperConstructorChild(String name)
	{
		super(10);
		
		System.out.println(name);
	}
	
	
	public SuperConstructorChild(int name)
	{
		super("Rasna",name);
		
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		SuperConstructorChild obj=new SuperConstructorChild(10);
		
		

	}

}
