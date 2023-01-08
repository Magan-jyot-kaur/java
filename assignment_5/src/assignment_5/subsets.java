package assignment_5;
import java.util.ArrayList;
public class subsets {
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4};
		int n = arr.length;
		ArrayList<String> subset = new ArrayList<String>();
		int counter,j;
		long size = (long)Math.pow(2, n);
		for(counter = 0;counter<size;++counter)
		{
			String temp = " ";
			for(j=0;j<size;++j)
			{
				if((counter&(1<<j))>0)
					temp = temp+(Integer.toString(arr[j])+'$');
				if(!subset.contains(temp)&&temp.length()>0)
					subset.add(temp);
			}
		}
		for(String s:subset)
		{
			s = s.replace('$', ' ');
			System.out.println(s);
		}
	}
}
