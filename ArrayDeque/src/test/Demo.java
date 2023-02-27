package test;
import java.util.ArrayDeque;
public class Demo {
	public static void main(String args[])
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(83);
		ad.addFirst(71);
		ad.addLast(78);
		ad.addLast(73);
		ad.addFirst(73);
		ad.addLast(99);
		
		System.out.println(ad);
		System.out.println(ad.peek());
		
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.remove());
		System.out.println(ad);
	}
}
