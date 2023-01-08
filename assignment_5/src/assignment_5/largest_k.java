package assignment_5;

public class largest_k 
{
	public static void main(String args[])
	{
		int pos = 0;
		int[] arr = {1,3,4,2,6,3,6,7};
		int n = arr.length;
		int num = 4;
		for(int i=0;i<n;++i)
		{
			for(int j=i;j<n;++j)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i=0;i<n;++i)
		{
			if(arr[i]==num)
				pos = i;
		}
		System.out.println("kth largest element:"+(n-pos+1));
	}
}
