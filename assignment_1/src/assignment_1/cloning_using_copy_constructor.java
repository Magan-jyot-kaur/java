package assignment_1;

class test4
{
	int x;
	int y;
	test4(int x1,int y1)
	{
		x = x1;
		y = y1;
	}
	test4(test4 t)
	{
		this.x = t.x;
		this.y = t.y;
	}
	int showx()
	{
		return x;
	}
	int showy()
	{
		return y;
	}
}

public class cloning_using_copy_constructor 
{
	public static void main(String args[])
	{
		try
		{
		test4 t = new test4(1,2);
		test4 t2 = new test4(t);
		System.out.println(t2.showx()+" "+t2.showy());
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}