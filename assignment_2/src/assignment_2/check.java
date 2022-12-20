package assignment_2;
import java.util.*;
public class check 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		try
		{
		do
		{
			if(word.charAt(0)==word.charAt(word.length()-1))
				System.out.println("Same");
			else
				System.out.println("Not same");
			word = sc.next();
		}while(!word.equals("done"));
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
