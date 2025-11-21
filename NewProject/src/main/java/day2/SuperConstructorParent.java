package day2;

public class SuperConstructorParent 
{
	public SuperConstructorParent()
	{
		System.out.println("This is a default parent constructor");
	}
	public SuperConstructorParent(int a)
	{
		System.out.println("This is a int constructor");
		
	}
	public SuperConstructorParent(String name)
	{
		System.out.println(name);
	}
	
	public SuperConstructorParent(String name,int b)
	{
		System.out.println(name+b);
	}

}
