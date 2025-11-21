package interfacePack;

public class InterfaceClass implements InterfaceParent
{

	public static void main(String[] args) 
	{
		InterfaceClass obj1=new InterfaceClass();//childclass obj creation
		obj1.m1();
		InterfaceParent obj=new InterfaceClass();//parentclass reference creation
		obj.m1();
		obj.m2();
		obj1.m2();
		InterfaceParent.m3();//static method
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj.i);
		
		

	}

	@Override
	public void m1()
	{
		System.out.println("Hello");
		
		
	}

}
