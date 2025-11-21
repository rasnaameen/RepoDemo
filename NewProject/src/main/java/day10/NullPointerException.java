package day10;

public class NullPointerException 

{

	public static void main(String[] args) 
	{
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
		}
		finally
		{
			System.out.println("Entered into final block");
		}
		System.out.println("program is exited");

	}

}
