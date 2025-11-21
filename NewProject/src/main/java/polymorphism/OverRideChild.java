package polymorphism;

public class OverRideChild extends OverRideParent
{

	public static void main(String[] args) 
	{
		OverRideChild obj=new OverRideChild();
		obj.display("Rasna", 50);
		

	}

	@Override
	public void display(String name, int i) 
	{
	   System.out.println(name+" "+i);
		super.display("Hello",100 );
	}

}
