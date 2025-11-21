package encapsulation;

public class encapMain {

	public static void main(String[] args) 
	{
		EncapExample obj=new EncapExample();
		System.out.println(obj.getName());
		System.out.println(obj.getAccno());
		System.out.println(obj.getAmount());
		obj.setName("Rasna");
		obj.setAccno(123456);
		obj.setAmount(1000);
		

	}

}
