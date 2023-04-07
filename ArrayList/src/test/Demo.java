package test;

import java.util.ArrayList;

public class Demo {
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(83);
		al.add(120);
		al.add(15);
		al.add(35);
		System.out.println(al);
		
		al.add(0, 30);
		
		al.addAll(al);
		
		System.out.println(al.contains(10));
		al.addAll(al);
		System.out.println(al.equals(al));
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.hashCode());
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println(al.set(3, 40));
		System.out.println(al);
		System.out.println(al.clone());
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
		
	}
}
