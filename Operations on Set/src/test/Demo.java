package test;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Demo {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
         
         Set<Integer> ob = null;
         String name=null;
         try(Scanner s = new Scanner(System.in)){
        	 try {
        		 while(true) {
        			 System.out.println("****Choice****");
        			 System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet\n4.exit");
        			 System.out.println("Enter the Choice:");
        			 switch(s.nextInt()) {
        			 case 1:
        				 ob = new HashSet<Integer>();
        				 name="HashSet<E>";
        				 break;
        			 case 2:
        				 ob = new LinkedHashSet<Integer>();
        				 name="LinkedHashSet<E>";
        				 break;
        			 case 3:
        				 ob = new TreeSet<Integer>();
        				 name="TreeSet<E>";
        				 break;
        			 case 4:
        				 System.out.println("Operations Stopped on Set<E>...");
        				 System.exit(0);
        			default:
        				System.out.println("Invalid Choice...");
        			 }//end of switch
        			 System.out.println("Perform operations on "+name);
        			 xyz:
        			 while(true) {
        				System.out.println("====Choice====");
        				System.out.println(" 1.add(E)\n 2.remove(Object)\n 3.exit");
        				System.out.println("Enter the Choice:");
        				switch(s.nextInt()) {
        				case 1:
        					System.out.println("Enter the Element:");
        					ob.add(new Integer(s.nextInt()));//Adding element to Set
        					System.out.println(ob.toString());
        					break;
        				case 2:
        					if(ob.isEmpty()) {//it is check set is empty or not
        						System.out.println("Set<E> is empty...");
        					}else {
        						System.out.println("Enter the element to be removed:");
        						Integer ele = new Integer(s.nextInt());
        						if(ob.remove(ele)) {
        							System.out.println("Element removed Successfully...");
        							System.out.println(ob.toString());
        						}else {
        							System.out.println("Element not available....");
        						}
        					}
        					break;
        				case 3:
        					System.out.println("Operations Stopped on "+name);
        					break xyz;
        				default: System.out.println("Invalid Choice...");
        					System.out.println("Invalid Choice...");
        				}//end of switch
        			 }//end of loop
        		 }//end of loop
        	 }catch(Exception e) {e.printStackTrace();}
         }//end of try
	}
}
