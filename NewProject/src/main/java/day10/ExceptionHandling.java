package day10;
import java.util.Scanner;

public class ExceptionHandling 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		try
		{
		 System.out.println(100/num);
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
		}
		finally
		{
			System.out.println("Entered into Final block");
		}
		
		
	
		
		
		
		
		
		
		
		System.out.println("Proogram is started");
		System.out.println("Program is continued");
		System.out.println("Program is exited");

	}

}
