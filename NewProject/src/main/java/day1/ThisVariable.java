package day1;

public class ThisVariable
{
	public ThisVariable()
	{
		this(50);
		System.out.println("Hai");
	}
	public ThisVariable(int a)
	{
		this("Rasna");
		System.out.println(a);
		
	}
	public ThisVariable(String name)
	{
		System.out.println(name);
	}

	
	
	public static void main(String[] args) 
	{
		ThisVariable obj=new ThisVariable();
		
		

	}

}
