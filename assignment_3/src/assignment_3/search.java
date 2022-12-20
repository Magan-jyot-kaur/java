package assignment_3;
import java.util.*;
public class search 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try
		{
		for(int i=0;i<n;++i)
		{
			if(arr[i]==a)
			{
				System.out.println("Index:"+(i+1));
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println("element not found");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
