package day1;

public class MultiLevelInheritChild extends MultiLevelInheritIntermediate
{
	public void m1()
	{
		System.out.println("This is the multilevel inherit child class");
	}

	public static void main(String[] args) 
	{
		MultiLevelInheritChild obj1=new MultiLevelInheritChild();
		obj1.m1();
		obj1.show();
		obj1.print();
		

	}

}
