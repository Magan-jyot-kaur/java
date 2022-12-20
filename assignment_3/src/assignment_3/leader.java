package assignment_3;
public class leader 
{
	public static void main(String args[])
	{
		int arr[] = {12,13,2,5,2};
		int n = arr.length;
		try
		{
		for(int i=0;i<n;++i)
		{
			int j;
			for(j=i+1;j<n;++j)
			{
				if(arr[i]<=arr[j])
					break;
			}
			if(n==j)
				System.out.println(arr[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println("Array index out of bounds");
		}
	}
}
