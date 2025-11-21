package day1;

public class ThisKeyWord

{
	String name;
	int marks;
	public ThisKeyWord(String s,int i )
	{
	 this.name=s;
	this.marks=i;

	
	}
	public void sum()
	{
		
		System.out.println(name+" "+marks);
	}
	/*public void display()
	{
		System.out.println("welcome");
		this.show();
		this.print();
	}
	public void show()
	{
		System.out.println("Hai");
	}
	public void print()
	{
		System.out.println("Hello");
	}*/
	public static void main(String[] args)
	{
		ThisKeyWord obj=new ThisKeyWord("Rasna",90);
		//obj.display();
		obj.sum();

}
}

