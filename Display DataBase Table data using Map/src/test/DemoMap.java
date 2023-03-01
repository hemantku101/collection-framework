package test;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DemoMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Map<String,ProductValues> ob=null;
        String name=null;
        try (s;){
        	try {
        		while(true) {
        			System.out.println("=====Choice======");
        			System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable\n5.exit");
        			System.out.println("Enter the Choice:");
        			switch(Integer.parseInt(s.nextLine())) {
        			case 1:
        				HashMap<String,ProductValues> ob1 = new HashMap<String,ProductValues>();
        				name = "HashMap";
        				ob = new RetriveDAO().retrive(ob1);
        				break;
        			case 2:
        				LinkedHashMap<String,ProductValues> ob2 = new LinkedHashMap<String,ProductValues>();
        				name = "LinkedHashMap";
        				ob = new RetriveDAO().retrive(ob2);
        				break;
        			case 3:
        				TreeMap<String,ProductValues> ob3 = new TreeMap<String,ProductValues>();
        				name = "TreeMap";
        				ob = new RetriveDAO().retrive(ob3);
        				break;
        			case 4:
        				Hashtable<String,ProductValues> ob4 = new Hashtable<String,ProductValues>();
        				name = "Hashtable";
        				ob = new RetriveDAO().retrive(ob4);
        				break;
        			case 5:
        				System.out.println("Map Operation Stopped...");
        				System.exit(0);
        			default:
        				System.out.println("Invalid Choice....");
        			}//end of switch
        			System.out.println("****Display using "+name+"*****");
        			ob.forEach((x,y)->{
        				System.out.println(x.toString()+"\t"+y.toString());
        			});
         		 }//end of loop

        	}catch(Exception e) {e.printStackTrace();}
        }//end of try
      }//end of main method
	}
