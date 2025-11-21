package samplepackage;

public class ThisInstanceMethod 
{
	public void display()
	{
		System.out.println("Hello");
		this.show();
		
	}
	public void show()
	{
		System.out.println("Hi");
		this.print();
	}
	public void print()
	{
		System.out.println("Welcome");
	}
	

	public static void main(String[] args)
	{
		ThisInstanceMethod obj=new ThisInstanceMethod();
		obj.display();
		//obj.show();
		

	}

}
