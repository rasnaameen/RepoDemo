package day1;

public class ConstructorOverLoad 
{
	int number,marks,points;
	public  ConstructorOverLoad()
	{
		number=10;
		marks=20;
		points=30;
	}
	public ConstructorOverLoad(int i,int y,int z)
	{
		number=i;
		marks=y;
		points=z;
	}
		
	 public void display()
	  {
		System.out.println(number+marks+points);
	   }
	
	public static void main(String[] args)
	{
		ConstructorOverLoad obj=new ConstructorOverLoad();
		obj.display();
		ConstructorOverLoad obj1=new ConstructorOverLoad(10,20,30);
		obj1.display();
		
	}
	

}
