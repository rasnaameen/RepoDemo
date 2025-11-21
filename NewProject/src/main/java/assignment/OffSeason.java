package assignment;

public class OffSeason 
{
	public void discount(double price)
	{
		double discountAmount=price*0.15;
		double finalPrice=price-discountAmount;
		System.out.println("OffSeason Purchase");
		System.out.println(price);
		System.out.println(discountAmount);
		System.out.println(finalPrice);
	}

	public static void main(String[] args) 
	{
		double price=2000;
		OnSeason on=new OnSeason();
		on.discount(price);
		System.out.println();
		OffSeason off=new OffSeason();
		off.discount(price);

	}

}
