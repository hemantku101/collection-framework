package test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;
public class Demo {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
         
         List<Integer> ob = null;
         String name=null;
         try(Scanner s = new Scanner(System.in);){
        	 try {
        		 while(true) {
        			 System.out.println("****Choice****");
        			 System.out.println("1.ArrayList\n2.LinkedList\n3.Vector\n4.exit");
        			 System.out.println("Enter the Choice:");
        			 switch(s.nextInt()) {
        			 case 1:
        				 ob = new ArrayList<Integer>();
        				 name="ArrayList<E>";
        				 break;
        			 case 2:
        				 ob = new LinkedList<Integer>();
        				 name="LinkedList<E>";
        				 break;
        			 case 3:
        				 ob = new Vector<Integer>();
        				 name="Vector<E>";
        				 break;
        			 case 4:
        				 System.out.println("Operations Stopped on "+name);
        				 System.exit(0);
        			default:
        				System.out.println("Invalid Choice...");
        			 }//end of switch
        			 System.out.println("Perform operations on "+name);
        			 xyz:
        			 while(true) {
        				System.out.println("====Choice====");
        				System.out.println(" 1.add(E)\n 2.remove(Object)\n 3.add(index,E)\n 4.remove(index)\n 5.get(index)\n 6.set(index,E)\n 7.exit");
        				System.out.println("Enter the Choice:");
        				switch(s.nextInt()) {
        				case 1:
        					System.out.println("Enter the element:");
        					ob.add(new Integer(s.nextInt()));//Adding element to List
        					System.out.println(ob.toString());
        					break;
        				case 2:
        					if(ob.isEmpty()) {
        						System.out.println("List<E> is empty...");
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
        					if(ob.isEmpty()) {
        						System.out.println("List<E> is empty...");
        					}else {
        						System.out.println("Enter the index:");
        						int index1 = s.nextInt();
        						if(index1>=0 && index1<ob.size()) {
        							System.out.println("Enter the element:");
        							ob.add(index1, new Integer(s.nextInt()));
        							System.out.println(ob.toString());
        						}else {
        							System.out.println("Invalid Index...");
        						}
        					}
        					break;
        				case 4:
        					if(ob.isEmpty()) {
        						System.out.println("List<E> is empty...");
        					}else {
        						System.out.println("Enter the index:");
        						int index2 = s.nextInt();
        						if(index2>=0 && index2<ob.size()) {
        							ob.remove(index2);
        							System.out.println("Element removed from list...");
        							System.out.println(ob.toString());
        						}else {
        							System.out.println("Invalid index...");
        						}
        					}
        					break;
        				case 5:
        					if(ob.isEmpty()) {
        						System.out.println("List is empty...");
        					}else {
        						System.out.println("Enter the index:");
        						int index3 = s.nextInt();
        						if(index3>=0 && index3<ob.size()) {
        							System.out.println("Element : "+ob.get(index3));
        							System.out.println(ob.toString());
        						}else {
        							System.out.println("Invalid index...");
        						}
        					}
        					break;
        				case 6:
        					if(ob.isEmpty()) {
        						System.out.println("List is empty...");
        					}else {
        						System.out.println("Enter the index:");
        						int index4 = s.nextInt();
        						if(index4>=0 && index4<ob.size()) {
        							System.out.println("Enter the element to be setted:");
        							ob.set(index4, new Integer(s.nextInt()));
        							System.out.println(ob.toString());
        						}else {
        							System.out.println("Invalid index...");
        						}
        					}
        					break;
        				case 7:
        					System.out.println("Operations Stopped on "+name);
        					break xyz;
        				default:
        					System.out.println("Invalid Choice...");
        				}//end of switch
        			 }//end of loop
        		 }//end of loop
        	 }catch(Exception e) {e.printStackTrace();}
         }//end of try
	}

}
