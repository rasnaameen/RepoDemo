package superKeyword;

public class InstanceChild extends InstanceParent
{
	String colour="Yellow";
	public void display()
	{
	System.out.println(super.colour);
		System.out.println(colour);
	}
	
	
		
	

	public static void main(String[] args) 
	{
		InstanceChild obj=new InstanceChild();
		//System.out.println(obj.colour);
		obj.display();
		

	}

}
