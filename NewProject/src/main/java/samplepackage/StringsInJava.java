package samplepackage;

public class StringsInJava 
{
	public static void main(String[] args)
	{
		String s="welcome";
		//s.length()
		System.out.println(s.length());
		//concat()
		/*String s1="welcome";
		String s2="to java";
		String s3="to Selenium";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3));*/
		//charAt()
		System.out.println(s.charAt(3));
		//equals
		String r="welcome";
		String s5="Welcome";
		System.out.println(r.equals(s5));
		//equalsIgnoreCase()
		System.out.println(r.equalsIgnoreCase(s5));
		//to  UpperCase()
		 System.out.println(r.toUpperCase());
		 //to LowerCase()
		 System.out.println(r.toLowerCase());
		 //valueof()
		 int i=10;
		 System.out.println(String.valueOf(i));

}
}