package day1;

public class SingleInheritChild extends SingleInheritParent
{
	public void print()
	{
		System.out.println("This is the child class");
	}

	public static void main(String[] args) 
	{
		SingleInheritChild obj=new SingleInheritChild();
		obj.print();
		obj.show();
		obj.display();
		

	}

}
