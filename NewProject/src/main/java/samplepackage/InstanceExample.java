package samplepackage;

public class InstanceExample 
{
	public void display()
	{
		System.out.println("welcome");
	}
	public void sum(int a,int b)

	{
		int c=a+b;
		System.out.println(c);
	}
	public float product(int a,float f)
	{
		float c=a*f;
		return c;
	}
	public static void main(String[] args) 
	{
		InstanceExample obj=new InstanceExample();
		obj.display();
		obj.sum(10, 10);
		//System.out.println(obj.product(10, 10.5f));
		float h=obj.product(10, 10.5f);
		System.out.println(h);
				
		

	}

}
