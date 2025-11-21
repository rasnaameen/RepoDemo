package day1;

import java.util.HashMap;

public class CollectionHashMap 
{

	public static void main(String[] args) 
	{
		HashMap hp=new HashMap();
		//add
		hp.put(101, "Rasna");
		hp.put(102, "Ameen");
		hp.put(103, "hyfa");
		
		//to get the value by using key
		
		System.out.println(hp.get(101));
		
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		System.out.println(hp.entrySet());
		
		
				

	}

}
