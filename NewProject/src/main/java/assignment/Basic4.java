package assignment;

public class Basic4 extends Basic3
{
	public void salaryslip()
	{
		System.out.println("basicpay:" +basicpay);
		System.out.println("deduction:" +deduction);
		System.out.println("hra:" +hra);
		System.out.println("pf:" +pf);
		System.out.println("bonus:" +bonus);
		System.out.println("totalsalary:" +totalsalary);
		
		
		
	}

	public static void main(String[] args) 
	{
		Basic4 obj=new Basic4();
		obj.getInput();
		obj.calculate();
		obj.Total();
		obj.salaryslip();
		
		
		

	}

}
