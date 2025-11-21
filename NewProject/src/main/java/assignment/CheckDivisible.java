package assignment;

public class CheckDivisible extends Addition

{
	public void checkDivisibleBy10(int a,int b)
	{
		int sum=super.addNumbers(a, b);
		System.out.println(sum);
		if(sum%10==0)
		{
			System.out.println("The addition result is divisible by 10.");
		
		}
	else
	{
		System.out.println("The addition result is not divisible by 10.");
	}
		
	}


	public static void main(String[] args) 
	{
		CheckDivisible obj=new CheckDivisible();
		obj.checkDivisibleBy10(25,15 );
		

	}

}
