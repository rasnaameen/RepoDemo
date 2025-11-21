package samplepackage;

public class ThisVariable 
{
	String name;
	int marks;
	
	public ThisVariable(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	
	public void display()
	{
		
		
		System.out.println(name+" "+marks);
	}

	public static void main(String[] args) 
	{
		ThisVariable obj=new ThisVariable("Rasna",95);
		obj.display();
		
		
		
		

	}

}
