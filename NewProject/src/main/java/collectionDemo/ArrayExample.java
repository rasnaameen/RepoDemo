package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample 
{

	public static void main(String[] args) 
	{
		ArrayList<String>a=new ArrayList<String>();
		a.add("Hyundai");
		a.add("Toyota");
		a.add("Mahindra");
		a.add("BMW");
		System.out.println(a);
		
		ArrayList<String>s=new ArrayList<String>();
		s.add("Apple");
		s.add("Banana");
		s.add("Orange");
		s.add("Grapes");
		System.out.println(s);
		
		//addAll-to add the elements of one list to another list
		
		System.out.println(a.addAll(s));//Here,elements of (s) will get added to (a)
		
		System.out.println(a);
		
		//containsAll-to check one list contains another list-gives boolean value
		System.out.println(a.containsAll(s));
		System.out.println(a);
		System.out.println(s.containsAll(a));
		
		//isEmpty-to check whether the list is empty or not
		System.out.println(a.isEmpty());
		System.out.println(s.isEmpty());
		
		//size-to check the length of the list
		
		System.out.println(a.size());
		
		Iterator<String>it=a.iterator();//Iterator interface
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
          it.remove();
		
		

		
				

	}

}
