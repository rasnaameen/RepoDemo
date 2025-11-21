package day1;

public class MultiLevelChild extends MultiLevelParent
{
	public void sum(int a)
	{
		System.out.println(a);
	}
	
	
	

	public static void main(String[] args) 
	{
		MultiLevelChild obj=new MultiLevelChild();
		obj.sum(10);
		obj.show();
		obj.print();
		
		
		
		

	}

}
