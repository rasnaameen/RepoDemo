package samplepackage;

public class BuffBuilderDemo

{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		//insert
		System.out.println(sb.insert(1, "hi"));
		//append()
		System.out.println(sb.append("Welcome"));
		//replace
		System.out.println(sb.replace(0, 01, "java"));
		//delete()
		System.out.println(sb.delete(0, 1));

	}

}
