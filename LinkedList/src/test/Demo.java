package test;
import java.util.LinkedList;

public class Demo {
	public static void main(String args[])
	{
		LinkedList<Integer> ll=new LinkedList<>();//It allow only integer type data
		ll.add(23);
		ll.add(43);
		ll.add(83);
		ll.add(56);
		ll.add(87);
		ll.add(83);
		
		ll.addFirst(67);
		System.out.println(ll);
	}
}
