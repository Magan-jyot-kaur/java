package assignment_2;
interface rating
{
	void stress();
	void fire();
}
class metalchair implements rating
{
	public void stress()
	{
		System.out.println("Rating is:"+8);
	}
	public void fire()
	{
		System.out.println("Rating is:"+8);
	}
}
class woodenchair implements rating
{
	public void stress()
	{
		System.out.println("Rating is:"+5);
	}
	public void fire()
	{
		System.out.println("Rating is:"+5);
	}
}
class metaltable implements rating
{
	public void stress()
	{
		System.out.println("Rating is:"+8);
	}
	public void fire()
	{
		System.out.println("Rating is:"+8);
	}
}
class woodentable implements rating
{
	public void stress()
	{
		System.out.println("Rating is:"+6);
	}
	public void fire()
	{
		System.out.println("Rating is:"+6);
	}
}
public class furniture 
{
	public static void main(String args[])
	{
		try
		{
		metalchair mc = new metalchair();
		woodenchair wc = new woodenchair();
		metaltable mt = new metaltable();
		woodentable wt = new woodentable();
		System.out.println("For metal chair:");
		mc.stress();
		mc.fire();
		System.out.println("For wooden chair:");
		wc.stress();
		wc.fire();
		System.out.println("For metal table:");
		mt.stress();
		mt.fire();
		System.out.println("For wooden table:");
		wt.stress();
		wt.fire();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
