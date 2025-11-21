package interfacePack;

public class MultipleInheritClass implements MultipleInheritParent1,MultipleInheritParent2
{
	



	public static void main(String[] args) 
	{
		MultipleInheritClass obj=new MultipleInheritClass();
		obj.sum();
		obj.difference();
		

	}


	@Override
	public void difference() 
	{
		int a=10;
		int b=10;
		
		System.out.println(a-b);
		
	}


	@Override
	public void sum() 
	{
		int a=20;
		int b=10;
		System.out.println(a+b);
		
	}

}