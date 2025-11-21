package methodOverLoad;

public class Arguments 
{
	public void display()
	{
		System.out.println("Hello");
	}
	
	public void show()
	{
		System.out.println("Hi");
	}
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Arguments obj=new Arguments();
			obj.display();
		    obj.show();
		    obj.display(10,10);
		

	}

}
