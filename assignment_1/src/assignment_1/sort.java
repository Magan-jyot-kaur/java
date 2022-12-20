package assignment_1;

public class sort 
{
	public static void main(String args[])
	{
		String s = "hello";
		int n = s.length();
		char ch[] = s.toCharArray();
		try
		{
		for(int i=0;i<n;++i)
		{
			for(int j=i+1;j<n;++j)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
