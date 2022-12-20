package assignment_2;
import java.util.*;
class customer
{
	static int token = 1;
	int payment()
	{
		System.out.println("Thank you for your payment!");
		++token;
		System.out.println("Your token number is:"+token);
		return token;
	}
	void getscoffee()
	{
		System.out.println("Coffee for token number "+ token +" is ready");
	}
}
class cashier extends customer
{
	String s;
	void order()
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter order:");
		String s = sc.next();
		token = payment();
	}
}
class barista extends cashier
{
	void order_making()
	{
		getscoffee();
	}
}
public class coffee_shop 
{
	public static void main(String args[])
	{
		try
		{
			barista b = new barista();
			b.order();
			b.order_making();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
