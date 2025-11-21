package samplepackage;

public class ThisConstructor 
{
	public ThisConstructor()
	{
		this("Rasna",95);
		this(10,10);
		System.out.println("Welcome");
		
	}
	public ThisConstructor(int a,int b)
	{
		//this("Rasna", 95);
		int c=a+b;
		System.out.println(c);
	}
	public ThisConstructor(String name,int marks)
	{
		System.out.println(name+" "+marks);
	}
	

	public static void main(String[] args) 
	{
		ThisConstructor obj=new ThisConstructor();
		//ThisConstructor obj1=new ThisConstructor(10,10);
		

	}

}
