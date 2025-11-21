package aggregation;

public class AggregationChild 
{
	String subject;
	int marks;
	AggregationParent ref;
	public AggregationChild(String subject,int marks,AggregationParent ref)
	{
		this.subject=subject;
		this.marks=marks;
		this.ref=ref;
		
	}
	public void display()
	{
		System.out.println(subject+" "+marks);
		System.out.println(ref.age);
		System.out.println(ref.name);
	}
	public static void main(String[] args) 
	{
		AggregationParent obj1=new AggregationParent("Rasna",26);
		AggregationChild obj=new AggregationChild("Maths",90,obj1);
		obj.display();
      

	}

}
