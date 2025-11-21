package day1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		ArrayList ai=new ArrayList();
		
		//Adding
		ai.add(100);
		ai.add("welcome");
		ai.add('A');
		
		//size
		System.out.println(ai.size());
		//Printing
		
		System.out.println(ai);
		
		//insert
		
		ai.add(1, "java");
		System.out.println(ai);
		
		//remove
		ai.remove(1);
		System.out.println(ai);
		
		//specific element
		
		System.out.println(ai.get(1));
		
		//to read all the elements
		
		for(int i=0;i<2;i++)
		{
			System.out.println(i);
		}
		for(Object x:ai)
		{
			System.out.println(x);
		}
		
		Iterator it= ai.iterator();
		{
			while(it.hasNext())
		
			
				System.out.println(it.next());
		}
		
		//remove all()
		
		ai.add(100);
		ai.add("welcome");
		ai.removeAll(ai);
		System.out.println(ai);
		
		//modify
		
		ai.set(2, "java");
	
		
		
		
		
		
		

	}

}
