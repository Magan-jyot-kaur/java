package assignment_1;
import java.util.*;
public class input 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		int a = sc.nextInt();
		double b = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("Int:"+a);
		System.out.println("Double:"+b);
		System.out.println("String:"+s);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
