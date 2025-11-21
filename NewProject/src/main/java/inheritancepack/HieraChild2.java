package inheritancepack;

public class HieraChild2 extends HieraParent
 {
	public void print()
	{
	System.out.println("This is the child2 class");
 }
 

	public static void main(String[] args)
	{
		HieraChild2 obj=new HieraChild2();
		obj.print();
		obj.show();
		

	}

}
