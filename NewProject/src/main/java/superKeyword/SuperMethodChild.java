package superKeyword;

public class SuperMethodChild extends SuperMethodParent
{
	public void display()
	{
		System.out.println("Hello");
		super.show();
		super.sum(10, 10);
		this.show();
	}
	public void show()
	{
		System.out.println("This is  non parametrized");
	}

	public static void main(String[] args)
	{
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();
		//obj.show();
		

	}

}

