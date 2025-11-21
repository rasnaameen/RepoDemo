package assignment;

	public abstract class Employee
	{
	String name;
	int paymentPerHour;
	public Employee(String name,int paymentPerHour) 
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
		public abstract int calculateSalary();
		
	

}
	
