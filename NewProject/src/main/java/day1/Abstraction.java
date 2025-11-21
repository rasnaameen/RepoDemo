package day1;
  abstract class Vehicle
 {
	  public abstract void sound();
	  public void m1()
	  {
		  System.out.println("hai");
	  }
	  public void m2()
	  {
		  System.out.println("hello");
	  }
	  public abstract void start();
	 
 }
  public class Abstraction extends Vehicle
  {

	@Override
	public void sound() {
		System.out.println("beep");
		
	}

	@Override
	public void start() {
		System.out.println("Starting");
		
	}
	public static void main(String[] args)
	{
		Abstraction obj=new Abstraction();
		obj.m1();
		obj.m2();
		obj.sound();
		obj.start();
	}
	  
  }
		
	



  