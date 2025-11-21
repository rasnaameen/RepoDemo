package day1;

public class InterfaceChild extends ParentClass implements Shape,Shape2
{
	public void circle()
	{
		System.out.println("circle");
		
	}
	public void rectangle()
	{
		System.out.println("rectangle");
	}

	public static void main(String[] args)
	{
	InterfaceChild obj=new InterfaceChild();
		obj.circle();
		obj.rectangle();
		
		

	}

}
