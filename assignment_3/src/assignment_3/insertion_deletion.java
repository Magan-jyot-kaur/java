package assignment_3;
import java.util.*;
public class insertion_deletion 
{
	public static void main(String args[])
	{
		int arr[] = new int[10];
		int n = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elemtents:");
		for(int i=0;i<n;++i)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be inserted:");
		int a = sc.nextInt();
		try
		{
			arr[n] = a;
			n = n+1;
		}
		catch(Exception e)
		{
			System.out.println("Overflow");
		}
		for(int i=0;i<n;++i)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nDeletion:");
		--n;
		for(int i=0;i<n;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
