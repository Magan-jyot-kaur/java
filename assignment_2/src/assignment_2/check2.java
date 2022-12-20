package assignment_2;
import java.util.*;
public class check2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		try
		{
		while(!word.equals("done"))
		{
			if(word.charAt(0)==word.charAt(word.length()-1))
				System.out.println("Same");
			else
				System.out.println("Not same");
			word = sc.next();
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
