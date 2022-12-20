package assignment_1;

class test implements Cloneable
{
	int x,y;
	test(int x1,int y1)
	{
		x = x1;
		y = y1;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class cloning
{
	public static void main(String args[])
	{
		try
		{
		test t = new test(1,2);
		test t2 = (test)t.clone();
		System.out.println(t2.x+" "+t2.y);
		}
		catch(CloneNotSupportedException e) {}
	}
}
