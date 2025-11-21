package day1;

public class MultiLevelInheritIntermediate extends MultiLevelInheritParent
{
	public void print()
	{
		System.out.println("This is the intermediate class");
	}

	public static void main(String[] args) 
	{
		MultiLevelInheritIntermediate obj=new MultiLevelInheritIntermediate();
		
		obj.print();
		obj.show();
		
		
		

	}
}