package stringprogram;

public class StringExample {

	public static void main(String[] args)
	{
		String s="Hello";
		System.out.println(s);
		
		String s1=new String("Hello");
		System.out.println(s1);
		//length
		System.out.println(s.length());
		//concate-to add two strings.
		System.out.println(s.concat(s1));
		System.out.println(s);
		//charAt()-used to return the character based on index
		System.out.println(s.charAt(2));
		//contains()-to check whether a character or word is present-returns a boolean value
		String a="how are you";
		
		System.out.println(a.contains("how"));
		System.out.println(s.contains(s1));
		String c="java";
		String d="java";
		String e="Java";
		String f="selenium";
		//equals()-to check whether two strings are equal or not-returns boolean value
		System.out.println(c.equals(d));
		System.out.println(c.equals(e));
		System.out.println(e.equals(f));
		//equalsIgnoreCase()-compare two strings and ignore the case letter.
		System.out.println(c.equalsIgnoreCase(e));
		//toUpperCase()-to convert small letters to capital letters.
		System.out.println(c.toUpperCase());
		//toLowerCase()-to convert capital letters to small letters
		System.out.println(c.toLowerCase());
		//isEmpty()
		
		//-to check whether a String is empty or not-returns a boolean value
		String h="";
		System.out.println(h.isEmpty());
		
		//System.out.println(c.isEmpty());
		//valueOf()-to convert any data type to string
	    int g=10;
.out.println(String.valueOf(g));
	    String j="manual";
	    String k="manual";
	    String l=new String("manual");
	    System.out.println(j.equals(k));
	    System.out.println(j==k);
	    System.out.println(j.equals(l));
	    System.out.println(j==l);
		
		 

	}

}
