package collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetOperations 
{

	public static void main(String[] args)
	{
		Set<String>s=new HashSet<String>();
		s.add("blue");
		s.add("green");
		s.add("yellow");
		
	  System.out.println(s);
	  
	  Set<String>a=new HashSet<String>();
	  
	  a.add("car");
	  a.add("bus");
	  a.add("bike");
	  a.add("bike");
	  
	  System.out.println(a);
	  
	  
	  //addAll()
	  
	  System.out.println(a.addAll(s));
	  
	  //contains()
	  
	  System.out.println(s.contains("blue"));
	  
	  //containsAll()
	  
	  System.out.println(s.containsAll(a));
	  
	  //isEmpty()
	  
	 System.out.println(s.isEmpty());
	  
	  //size
	  
	 System.out.println(s.size());
	 
	 //clear
	 
	 a.clear();
	 System.out.println(a);
	  
	  
	  
		

	}

}
