package inheritancepack;

public class MultiChild extends MultiInter
{
 public void print()
 {
	 System.out.println("This is the child class method");
 }
	public static void main(String[] args) 
	{
		MultiChild obj=new MultiChild();
		obj.print();
		obj.show();
		obj.print();
		

	}

}

