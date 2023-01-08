package assignment_5;

public class rain 
{
	public static void main(String args[])
	{
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int sum = 0,n = height.length;
		for(int i=0;i<n-1;++i)
		{
			if(height[i+1]-height[i]>0)
			{
				sum = sum + height[i+1] - height[i];
			}
		}
		System.out.println(sum);
	}
}
