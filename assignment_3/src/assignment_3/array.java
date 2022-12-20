package assignment_3;
public class array 
{
	public static void main(String args[])
	{
		try
		{
		test t = new test();
		t.fun();
		}
		catch(Exception e)
		{
			System.out.println("Not able to create object of test class");
		}
	}
}

class test
{
	void fun()
	{
	int arr[] = {1,0,1,0,0,1,1};
	int n = arr.length;
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
	for(int i=0;i<n;++i)
		System.out.println(arr[i]+" ");
	}
	
}
