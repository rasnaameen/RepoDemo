package encapsulation;

public class EncapExample
{
	private int accno;
	private String name;
	private double amount;
	public int getAccno() 
	{
		return accno;
	}
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getAmount() 
	{
		return amount;
	}
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	public static void main(String[] args)
	{
	EncapExample obj=new EncapExample();
	obj.setName("Rasna");
	obj.setAccno(123456);
	obj.setAmount(1000);
	
	System.out.println(obj.getName());
	System.out.println(obj.getAccno());
	System.out.println(obj.getAmount());
	
	
	
}
}