package abstraction;

public class AbstractChild extends AbstractParent
{
	
	
		

	

	public static void main(String[] args) 
	{
		/*AbstractChild obj=new AbstractChild();
		obj.sum();
		System.out.println(obj.diff());
		obj.display();
		obj.show();
		//reference created for parent class
		//Child class method will not get in the reference.
		
		/*AbstractParent ab =new AbstractChild();
		System.out.println(ab.diff());
		ab.sum();
		ab.display();*/
		AbstractChild con=new AbstractChild(5,5);
	
		
		
		
		

	}
public AbstractChild(int a,int b)
{
	super(5,5);
	System.out.println(a*b);
}

	
	public void sum() {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		System.out.println(a+b);
		
	}


	
	public int diff() {
	   int a=20;
	   int b=10;
	   int c=a-b;
		return c;
	}
	public void show()
	{
		System.out.println("welcome");
	}

}
