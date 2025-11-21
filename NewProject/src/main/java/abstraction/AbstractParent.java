package abstraction;

public abstract class AbstractParent 
{
	public abstract void sum();
	public abstract int diff();
	public void display()
	{
		System.out.println("Hai");
		
	}
	public AbstractParent()
	{
		System.out.println("Hello");
	}
	public AbstractParent(int a,int b)
	{
		System.out.println(a+b);
	}


}

