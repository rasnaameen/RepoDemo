package day1;

public class EncapsulationChild extends EncapsulationParent
{

	public static void main(String[] args) 
	{
		EncapsulationChild obj=new EncapsulationChild();
		obj.setAccountno(1234566);
		obj.setAmount(1800);
		obj.setName("Rasna");
	
		
		
		System.out.println(obj.getName());
	System.out.println(obj.getAmount());
	System.out.println(obj.getAccountno());
	
		
		
		

	}

}
