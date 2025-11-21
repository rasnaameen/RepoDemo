package assignment;

import java.util.Scanner;

public class Basic 
{
	
	double basicpay;
    double deduction;
    double bonus;
    
    public void getInput()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the basic pay");
    	basicpay=sc.nextDouble();
    	System.out.println("Enter the deduction");
    	deduction=sc.nextDouble();
    	System.out.println("Enter the bonus");
    	bonus=sc.nextDouble();
    	
    }
			
			

}
