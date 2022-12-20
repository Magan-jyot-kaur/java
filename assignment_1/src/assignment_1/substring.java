package assignment_1;
import java.util.*;
public class substring 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		String s = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start;i<end;++i)
		{
			System.out.print(s.charAt(i));
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
