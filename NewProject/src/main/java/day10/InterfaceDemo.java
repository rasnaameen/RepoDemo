package day10;
 interface Shape
 {
	 int length=20;
	 int width=10;
	default void triangle()
	 {
		 System.out.println("triangle");
	 }
	static void rectangle()
	{
		System.out.println("square");
	}
 public	void circle();
 }
 public class InterfaceDemo implements Shape
 {
	 public void circle()
	 {
		 System.out.println("Circle");
	 }
	 public void hexagon()
	 {
		 System.out.println("Hexagon");
	 }
	 public static void main(String[] args)
	 {
		 InterfaceDemo obj=new InterfaceDemo();
		 obj.circle();
		 Shape.rectangle();
		 obj.triangle();
		 obj.hexagon();
		/* Shape sh=new InterfaceDemo();
		 sh.circle();
		 sh.triangle();
		 Shape.rectangle();*/
		 
	 }
 }
