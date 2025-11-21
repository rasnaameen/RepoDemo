package polymorphism;

public class MethodOverRideChild extends MethodOverRideParent
{
	public void sum(int a,int b)
	{
		int c=	a-b;
		System.out.println(c);
		super.sum(50, 50);
		
	}
	
	public int product(int a,int b)
	{
		System.out.println(super.product(20, 20));
		int i=a*b;
		return i;
		
	}

	public static void main(String[] args) 
	{
		MethodOverRideChild obj=new MethodOverRideChild();
		obj.sum(50, 50);
		System.out.println(obj.product(20, 20));

		

	}

}
