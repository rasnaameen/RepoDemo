package assignment;

public class Contractor extends Employee
{
	int workingHours;
	public Contractor(String name,int paymentPerHour,int workingHours)
	{
	super(name,paymentPerHour);
	this.workingHours=workingHours;

}
	@Override
	public int calculateSalary() 
	{
		return paymentPerHour*workingHours;
		
		
		// TODO Auto-generated method stub
		
	}
	}
