package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ExampleCollection 
{

	public static void main(String[] args) 
	{
		List<String>li=new ArrayList<String>();
		System.out.println(li);
		//add-to add elements into the collection.
		li.add("blue");
		li.add("yellow");
		li.add("blue");
		li.add("green");
		System.out.println(li);
		//indexOf-to return the index of the given element.
		System.out.println(li.indexOf("yellow"));
		System.out.println(li.indexOf("green"));
		System.out.println(li.indexOf("blue"));//if repeated elements is there first index of that element will shown.
		//LastIndexOf-return the last occurence if there is a repetetion.
		System.out.println(li.lastIndexOf("blue"));
		System.out.println(li.indexOf("red"));//if not element is there it will shown in negative
		//contains-to check whether the element is there-gives boolean value
		System.out.println(li.contains("green"));
		System.out.println(li.contains("red"));
		//remove
		System.out.println(li.remove(3));
		System.out.println(li);
		System.out.println(li.remove("yellow"));
		//get()-to get the object based on index position.
		System.out.println(li.get(0));
		for(int i=0;i<2;i++)//for loop used
		{
			System.out.println(li.get(i));
			
		}
		for(String s:li)//for each loop used
		{
			System.out.println(s);
		}
	
	
	
	
	
	
	
	
	
}	
	
}


