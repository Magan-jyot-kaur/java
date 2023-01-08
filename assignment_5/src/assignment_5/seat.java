package assignment_5;

class chapter
{
	private String name;
	private int num;
	public chapter(String name,int num)
	{
		this.name = name;
		this.num = num;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public int getnum()
	{
		return num;
	}
	public void setnum(int num)
	{
		this.num = num;
	}
}

public class seat 
{
	public static void main(String args[])
	{
		String s = nearestChapter(new chapter[] {
				new chapter("Chapter 1",1),
				new chapter("Chapter 2",15),
				new chapter("Chaoter 3",37)
		},20);
	}
	public static String nearestChapter(chapter[] chapter,int num)
	{
		
		return null;
	}
}
