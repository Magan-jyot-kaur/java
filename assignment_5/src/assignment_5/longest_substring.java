package assignment_5;
import java.util.*;
import java.math.*;
public class longest_substring 
{
	public static void main(String args[])
	{
		String s = "hellohey";
		int len = s.length();
		int res = 0;
		for(int i=0;i<len;++i)
		{
			boolean[] visited = new boolean[256];
			for(int j=i;j<len;++j)
			{
				if(visited[s.charAt(j)]==true)
				{
					break;
				}
				else
				{
					res = Math.max(res,j-i+1);
					visited[s.charAt(j)]=true;
				}
			}
			visited[s.charAt(i)]=false;
		}
		System.out.println(res);
	}
}
