package assignment_5;
public class profit 
{
	public static void main(String args[])
	{
		int max_profit=0;
		int pro=0;
		int[] arr = {5,4,3,2,1};
		int n = arr.length;
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				int temp = arr[j]-arr[i];
				if(temp>=0)
					pro = temp;
			}
			max_profit = Math.max(max_profit,pro);
			pro = 0;
		}
		System.out.println("Maximum profit made:"+max_profit);
	}
}
