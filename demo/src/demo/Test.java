package demo;

import java.util.ArrayList;

public class Test {
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
		//al.add();
		al.addAll(al);
	}

}
