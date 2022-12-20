package assignment_3;
import java.util.*;
public class array_insert 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		try
		{
			int arr[] = new int[n];
			for(int i=0;i<n;++i)
			{
				arr[i] = sc.nextInt();
			}
			System.out.println();
			for(int i=0;i<n;++i)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
