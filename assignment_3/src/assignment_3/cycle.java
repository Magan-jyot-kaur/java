package assignment_3;

public class cycle 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int temp = arr[0],i;
		try
		{
		for(i=0;i<n-1;++i)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		}
		catch(Exception e)
		{
			System.out.println("Array out of bounds");
		}
		
		for(i=0;i<n;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
