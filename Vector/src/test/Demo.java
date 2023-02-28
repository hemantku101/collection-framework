package test;
import java.util.Vector;
public class Demo {
	@SuppressWarnings("removal")
	public static void main(String args[])
	{
		Vector<Integer> v= new Vector<Integer>();
		v.addElement(new Integer(11));
		v.addElement(12);
		v.addElement(new Integer(13));
		v.addElement(new Integer(14));
		
		System.out.println(v.toString());
		System.out.println("First element : "+v.firstElement());
		System.out.println("Last element : "+v.lastElement());
		System.out.println("Element at index 2 : "+v.elementAt(2));
		v.setElementAt(new Integer(500), 2);
		System.out.println(v.toString());
		v.removeElementAt(2);
		System.out.println(v.toString());
		v.removeElement(new Integer(11));
        System.out.println(v.toString());
        v.insertElementAt(new Integer(700), 1);
        System.out.println(v.toString());
        System.out.println("size : "+v.size());
        v.removeAllElements();
        System.out.println("size : "+v.size());
        System.out.println(v.toString());

	}
}
