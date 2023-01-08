package assignment_5;
import java.util.*;
public class linked_list 
{
	public static void main(String args[])
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(4);
		l1.add(5);
		l2.add(1);
		l2.add(3);
		l2.add(4);
		l3.add(2);
		l3.add(6);
		Iterator<Integer> i2 = l2.iterator();
		while(i2.hasNext())
		{
			l1.add(i2.next());
		}
		Iterator<Integer> i3 = l3.iterator();
		while(i3.hasNext())
		{
			l1.add(i3.next());
		}
		Collections.sort(l1);
		System.out.println(l1);
	}
}
