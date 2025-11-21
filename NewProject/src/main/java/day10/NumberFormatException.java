package day10;

public class NumberFormatException 
{

	public static void main(String[] args) 
	{
		String s="welcome";
		try
		{
	    int num=Integer.parseInt(s);
	    System.out.println("num");
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
			
		}
		finally
		{
			System.out.println("Entered into final block");
		}

	}

}
