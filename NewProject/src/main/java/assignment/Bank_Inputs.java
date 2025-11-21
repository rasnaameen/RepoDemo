package assignment;

public class Bank_Inputs 
{
 private int Pin;
 public void setpin(int Pin)
 {
	 this.Pin=Pin;
 }
 public int getpin()
 {
	 return Pin;
	 
 }
 public void validate()
 {
	 if(Pin==1001||Pin==1234||Pin==1212)
	 {
		 System.out.println("Validate");
	 }
	 else
	 {
		 System.out.println("Not Valid");
	 }
 }
 
}
