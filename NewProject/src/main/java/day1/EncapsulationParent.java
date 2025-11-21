package day1;

public class EncapsulationParent 
{
	String name;
	int accountno;
	double amount;
	public void account(String name,int accountno,double amount)
	{
		this.name=name;
		this.accountno=accountno;
		this.amount=amount;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
