package day1;

public class MultiLevelChild2 extends MultiLevelChild
{
	public void product()
	{
		System.out.println("Rasna");
	}
	

	public static void main(String[] args) 
	{
		MultiLevelChild2 obj2=new MultiLevelChild2();
		obj2.product();
		obj2.sum(50);
		

	}

}
