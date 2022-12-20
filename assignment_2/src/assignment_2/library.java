package assignment_2;
import java.util.*;
interface book1
{
	void show();
	void getbook1();
}
abstract class book2
{
	String name;
	int num;
	abstract void getbook2();
	void display()
	{
		System.out.println("Thanks for issuing book2");
	}
}
class a implements book1
{
	public void getbook1()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your phone number:");
		int num = sc.nextInt();
		show();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
	public void show()
	{
		System.out.println("Thanks for issuing book1");
	}
}
class b extends book2
{
	void getbook2()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your phone number:");
		int num = sc.nextInt();
		display();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
public class library {
	public static void main(String args[])
	{
		a obj1 = new a();
		b obj2 = new b();
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Book1");
		System.out.println("2.Book2");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:obj1.getbook1();
				break;
		case 2:obj2.getbook2();
				break;
		default: System.out.println("Wrong input");
		}
	}
}
