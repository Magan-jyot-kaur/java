package assignment_1;
public class nested 
{
	public static void main(String args[])
	{
		int s=0,i=0,j;
		int t=1;
		try
		{
		while(i<10)
		{
			s=s+1;
			j=i;
			while(j>0)
			{
				t=t*(j-1);
				--j;
			}
			s=s*t;
			System.out.println("T is:"+t);
			++i;
		}
		System.out.println("S is:"+s);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
