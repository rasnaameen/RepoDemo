package day1;

public class SuperChild extends SuperParent
{
	int a=200;
	public void display()
	{
		//System.out.println("Welcome");
		super.display();
		System.out.println(super.a);
		
	}

	public static void main(String[] args) 
	{
		SuperChild obj=new SuperChild();
		obj.display();
		
		

	}

}
