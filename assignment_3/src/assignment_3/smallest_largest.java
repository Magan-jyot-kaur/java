package assignment_3;
public class smallest_largest 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,5,3,7,2};
		int n = arr.length;
		int min = arr[0],max = arr[0];
		try
		{
		for(int i=1;i<n;++i)
		{
			if(min>arr[i])
				min = arr[i];
			if(max<arr[i])
				max = arr[i];
		}
		System.out.println("Maximum:"+max+" Minimum:"+min);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
