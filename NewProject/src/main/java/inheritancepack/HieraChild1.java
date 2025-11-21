package inheritancepack;

public class HieraChild1 extends HieraParent
{
  public void display()
  {
	 System.out.println("This the child1 class");
  }

	public static void main(String[] args)
	{
		HieraChild1 obj=new HieraChild1();
		obj.display();
		obj.show();
		
		

	}

}
