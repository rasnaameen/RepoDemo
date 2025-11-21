package inheritancepack;

public class ChildClass extends SingleParent
{
	public void sum(int a,int b)
	{
		int c=a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.sum(10,10);
		obj.display();
		obj.name();
		SingleParent obj1=new SingleParent();
		obj1.display();
		obj.sum(10,10);//we cannot access child class property by creating the parent class object.
		
		
		
		
		
		}
		

	}


