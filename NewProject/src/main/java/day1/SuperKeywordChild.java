package day1;

public class SuperKeywordChild extends SuperKeyword
{
	int a=200;
	
	public void display()
	{
		
		System.out.println(super.a);
	}
	public static void main (String[] args)
	{
		SuperKeywordChild obj=new SuperKeywordChild();
		obj.display();
		
		
		
	}

}



