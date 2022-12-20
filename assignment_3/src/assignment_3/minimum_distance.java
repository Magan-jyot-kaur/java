package assignment_3;
import java.lang.*;
public class minimum_distance 
{
	public static void main(String args[])
	{
		int arr[] = {1,3,5,5,2,5,7,9};
		int n = arr.length;
		int a = 3,b = 2,dis = -1;
		try
		{
		for(int i=0;i<n;++i)
		{
			if(arr[i]==a) {
				for(int j=i+1;j<n;++j)
				{
					dis++;
					if(arr[j]==b)
					{
						break;
					}
				}
			}
		}
		System.out.println(dis);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
