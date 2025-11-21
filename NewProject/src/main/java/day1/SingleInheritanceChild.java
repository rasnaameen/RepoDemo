package day1;

public class SingleInheritanceChild extends SingleInheritanceParent
{
 int b=500;
 public void show()
 {
	 System.out.println(b);
 }
	public static void main(String[] args)
	{
		SingleInheritanceChild obj=new SingleInheritanceChild();
		obj.show();
		obj.display();
		System.out.println(obj.b);
		System.out.println(obj.a);
		

	}

}
