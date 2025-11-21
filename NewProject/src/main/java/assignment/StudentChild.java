package assignment;

public class StudentChild 
{
	String address;
	StudentParent ref;
	public StudentChild(String address,StudentParent ref )
	{
		this.address=address;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(address+" "+ref);
		System.out.println(ref.name+" "+ref.roll);
		
	}

	public static void main(String[] args) 
	{
		StudentParent obj=new StudentParent("Rasna",10);
		StudentChild obj1=new StudentChild("Elysium",obj);
		obj1.display();
	
	

	}

}
