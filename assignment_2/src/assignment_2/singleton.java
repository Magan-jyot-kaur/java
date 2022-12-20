package assignment_2;
class test
{
	private static test t = null;
	int a;
	private test()
	{
		a = 3;
	}
	public static test get()
	{
		if(t==null)
			t = new test();
		return t;
	}
}
public class singleton
{
	public static void main(String args[])
	{
		try
		{
		test t = test.get();
		test t2 = test.get();
		if(t==t2)
			System.out.println("Stored in same memory");
		else
			System.out.println("Not stored in same memory");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
