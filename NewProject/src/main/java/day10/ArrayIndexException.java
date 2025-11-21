package day10;
import java.util.Scanner;

public class ArrayIndexException 
{

	public static void main(String[] args) 
	{
		System.out.println("program is started");

		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		try
		{
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
		}
		finally
		{
			System.out.println("Entered into final block");
		}
		
		
		
		System.out.println("Program is exited");
		

	}

}

