package day1;

public class HierarchialChild2 extends HierarchialParent
{
	public void print()
	{
		System.out.println("How");
	}
	

	public static void main(String[] args) 
	{
		HierarchialChild2 obj2=new HierarchialChild2();
		obj2.print();
		obj2.display();
	}
}
		
		

	