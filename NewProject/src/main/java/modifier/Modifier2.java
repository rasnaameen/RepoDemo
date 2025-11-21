package modifier;

public class Modifier2 extends AccessModifier
{

	public static void main(String[] args) 
	{
		Modifier2 obj1=new Modifier2();
		obj1.defaultMethod();
		obj1.protectMethod();
		obj1.pubMethod();
		//private method is not visible from outside the class.
		

	}

}
