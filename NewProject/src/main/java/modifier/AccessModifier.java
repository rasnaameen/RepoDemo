package modifier;

public class AccessModifier 
{
	public void pubMethod()
	{
		System.out.println("This is a public method");
	}
	private void privMethod()
	{
		System.out.println("This is a private method");
		
	}
	protected void protectMethod()
	{
		System.out.println("This is a protected method");
	}
	void defaultMethod()
	{
		System.out.println("This is a default method");
	}
	

	public static void main(String[] args) 
	{
		AccessModifier obj=new AccessModifier();
		obj.pubMethod();
		obj.privMethod();
		obj.protectMethod();
		obj.defaultMethod();
		//public-access from everywhere
		//private-access only within the class
		//protected-outside the package only through the child class.
	

	}

}
