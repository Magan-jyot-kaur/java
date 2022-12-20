package assignment_3;
public class missing 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,4,5,7};
		int n = arr.length;
		try
		{
		for(int i=0;i<n-1;++i)
		{
			if(arr[i]+1!=arr[i+1])
				System.out.println(arr[i]+1);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
