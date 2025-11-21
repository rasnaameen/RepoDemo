package assignment;

public class OnSeason 
{
	public void discount (double price)
	{
		double discountAmount=price*0.40;
		double finalPrice=price-discountAmount;
		System.out.println("On Season Purchase:");
		System.out.println(price);
		System.out.println(discountAmount);
		System.out.println(finalPrice);
	}

}
