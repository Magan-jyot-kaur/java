package assignment_1;
import java.util.*;
public class formatting 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		for(int i=0;i<3;++i)
		{
			String s = sc.next();
			int a = sc.nextInt();
			System.out.printf("%-15s%03d",s,a);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
