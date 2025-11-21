package day1;

public class HierarchialChild3Ex extends HierarchialParentEx
{
	public void m2()
	{
		System.out.println("thsi the second child");
	}

	public static void main(String[] args) 
	{
		HierarchialChild3Ex obj2=new HierarchialChild3Ex();
		obj2.m2();
		obj2.display();
		

	}

}
