package stringprogram;

public class BuffBuilderExample 
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		StringBuilder sbs=new StringBuilder("hi");
		System.out.println(sbs);
		
		//insert()-to add anew string based on index position
		
		System.out.println(sb.insert(0, sbs));
		System.out.println(sb.insert(1, "hello"));
		//append()- to add the new string atlast like attaching a new string
		System.out.println(sb.append("hello"));
		//replace()-to replace the new string based on index position
		System.out.println(sb.replace(5, 8,"world"));
		//reverse()-to reverse the string
		System.out.println(sb.reverse());
		//delete()-to delete a string based on index position
		System.out.println(sb.delete(1, 4));
		System.out.println(sbs.delete(0, 1));
		
		
		
		 
	
	}
}
