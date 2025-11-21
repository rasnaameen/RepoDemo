package assignment;

public class FullTimeEmployee extends Employee
{
	public FullTimeEmployee(String name,int paymentPerHour) {
		super(name,paymentPerHour);
	}

	public static void main(String[] args) 
	{
		Contractor obj=new Contractor("Rasna",50,20);
		FullTimeEmployee obj1=new FullTimeEmployee("Ras",100);
		// TODO Auto-generated method stub
		System.out.println(obj.calculateSalary());
		System.out.println(obj1.calculateSalary());
	

	}

	@Override
	public int calculateSalary() 
	{
		return paymentPerHour*8;
		// TODO Auto-generated method stub
		
	}

}
