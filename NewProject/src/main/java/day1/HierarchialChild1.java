package day1;

public class HierarchialChild1 extends HierarchialParent
{
	public void show()
	{
		System.out.println("To Selenium");
	}
	
	

	public static void main(String[] args) 
	{
		HierarchialChild1 obj=new HierarchialChild1();
		obj.show();
		obj.display();
		

	}

}
