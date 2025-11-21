package day10;
 interface Test
{
	 abstract void m1();
	default void m2()
	{
		System.out.println("hello");
	}
	static void m3()
	{
		System.out.println("welcome");
	}
	 
	
}


public class Interface implements Test,Test2
{
	public void m1()
	{
		System.out.println("to java");
		
	}

	public static void main(String[] args) 
	{
		/*Interface obj=new Interface();
		obj.m1();
		obj.m2();
		Test.m3();*/
				
		Test obj1=new Interface();
		obj1.m1();
		obj1.m2();
		Test.m3();
		
		

	}

}
