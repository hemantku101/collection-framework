package test;
import java.util.Iterator;
import java.util.ArrayList;
public class Demo {
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(78);
		al.add(74);
		al.add(46);
		al.add(78);
		al.add(66);
		
		System.out.println(al);
		Iterator<Integer> i=al.iterator();
		
		while(i.hasNext())
		{
			int x=i.next();
			System.out.println(x+5);
		}
	}
}