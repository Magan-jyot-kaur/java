package assignment_5;

public class harsahd 
{
	public static void main(String args[])
	{
		int sum = 0;
		int num = 75,temp = num;
		for(int i=0;num!=0;++i)
		{
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		if(temp%sum==0)
			System.out.println("harshad");
		else
			System.out.println("not harshad");
	}
}
