package day1;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo2 
{

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		
	
		
		//add
		hs.add(100);
		hs.add("welcome");
		hs.add('A');
		hs.add("Rasna");
		//size
		System.out.println(hs.size());
		//printing
		System.out.println(hs);
		
		//remove
		hs.remove("welcome");
		System.out.println(hs);
		//specific element
		
		ArrayList ai=new ArrayList(hs);
		ai.add("welcome");
		ai.add(100);
		ai.add("Rasna");
		System.out.println(ai);
		System.out.println(ai.get(2));
		
		
		
		
		
		

	}

}
