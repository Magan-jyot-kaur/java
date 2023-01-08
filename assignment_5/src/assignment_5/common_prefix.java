package assignment_5;

public class common_prefix 
{
	public static void main(String args[])
	{
		String res = "";
		String s1 = "flower";
		String s2 = "flow";
		String s3 = "flight";
		int n1 = s1.length();
		int n2 = s2.length();
		int n3 = s3.length();
		for(int i=0,j=0,k=0;i<n1-1 && j<n2-1 && k<n3-1;++i,++j,++k)
		{
			if((s1.charAt(i)==s2.charAt(j))&&(s2.charAt(j)==s3.charAt(k)))
				res = res + s1.charAt(i);
			else
				break;
		}
		System.out.println(res);
	}
}
