package day1;

public class HierarchialChild2Ex extends HierarchialParentEx
{
	public void m1()
	{
		System.out.println("this the first child class");
	}

	public static void main(String[] args) 
	{
		HierarchialChild2Ex obj=new HierarchialChild2Ex();
		obj.m1();
		obj.display();
		

	}

}
