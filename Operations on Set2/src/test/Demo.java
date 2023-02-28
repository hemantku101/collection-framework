package test;
import java.util.Scanner;
import java.util.Set;
import java.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
        
        Set<BankCustomer> ob = null;
        String name=null;
        try(Scanner s = new Scanner(System.in);){
       	 try {
       		 while(true) {
       			 System.out.println("****Choice****");
       			 System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet\n4.exit");
       			 System.out.println("Enter the Choice:");
       			 switch(Integer.parseInt(s.nextLine())) {
       			 case 1:
       				 ob = new HashSet<BankCustomer>();
       				 name="HashSet<E>";
       				 break;
       			 case 2:
       				 ob = new LinkedHashSet<BankCustomer>();
       				 name="LinkedHashSet<E>";
       				 break;
       			 case 3:
       				 ob = new TreeSet<BankCustomer>();
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
       				System.out.println(" 1.add(E)\n 2.remove(Object)\n 3.display\n 4.exit");
       				System.out.println("Enter the Choice:");
       				switch(Integer.parseInt(s.nextLine())) {
       				case 1:
       				    System.out.println("Enter the AccNo:");
       				    long accNo = Long.parseLong(s.nextLine());
       				    System.out.println("Enter the CustName:");
       				    String cName = s.nextLine();
       				    System.out.println("Enter the balance:");
       				    float bal = Float.parseFloat(s.nextLine());
       				    System.out.println("Enter the accType:");
       				    String accType = s.nextLine();
       				    ob.add(new BankCustomer(accNo,cName,bal,accType));
       				    System.out.println("details added Successfully...");
       					break;
       				case 2:
       					if(ob.isEmpty()) {
       						System.out.println(name+" is empty..");
       					}else {
       						System.out.println("Enter the accNo:");
       						long aNo = Long.parseLong(s.nextLine());
       						boolean v=false;
       						
       						Iterator<BankCustomer> it3 = ob.iterator();
       						while(it3.hasNext()) {
       							BankCustomer bc = (BankCustomer)it3.next();
       							if(bc.accNo==aNo) {
       							ob.remove(bc);
       							System.out.println("details deleted Successfully..");
       							v=true;
       							break;
       							}
       						}//end of loop
       						if(!v) {
       							System.out.println("Customer details not available...");
       						}
       					}
       					break;
       				case 3:
       					System.out.println("-----Iterator<E>------");
       					Iterator<BankCustomer> it1 = ob.iterator();
       					while(it1.hasNext()) {
       						BankCustomer bc = (BankCustomer)it1.next();
       						System.out.println(bc.toString());
       					}//end of loop
       					System.out.println("-----Iterator<E>(Java8)-----");
       					Iterator<BankCustomer> it2 = ob.iterator();
       					it2.forEachRemaining((p)->
       					{
       						System.out.println(p.toString());
       					});
       					System.out.println("----Spliterator<T>(Java8)----");
       					Spliterator<BankCustomer> sp = ob.spliterator();
       					sp.forEachRemaining((q)->
       					{
       						System.out.println(q.toString());
       					});
       					System.out.println("----forEach()(Java8)-----");
       					ob.forEach((r)->
       					{
       						System.out.println(r.toString());
       					});
       					break;
       				case 4:
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