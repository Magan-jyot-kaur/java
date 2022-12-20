package assignment_3;

public class second 
{
	public static void main(String args[])
	{
		int arr[] = {1,4,2,7,8,3};
		int n = arr.length;
		try
		{
		for(int i=0;i<n;++i)
		{
			for(int j=i+1;j<n;++j)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second max:"+arr[n-2]+" Second min:"+arr[1]);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
