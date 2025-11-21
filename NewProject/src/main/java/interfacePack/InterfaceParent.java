package interfacePack;

public interface InterfaceParent 
{
	public static final int a=10;//variable declaration,final variables cannot be changed.
	
	int i=50;//this is also final without mentioning as final keyword
	
	public abstract void m1();//abstract method
	
	default void m2()
	{
	
		System.out.println("Welcome");
	}
	
	static void m3()
	{
		System.out.println("to java");
		
	}

}
