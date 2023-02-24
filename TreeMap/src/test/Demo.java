package test;
import java.util.TreeMap;
public class Demo {

		public static void main(String[] args) {
			TreeMap<String, Integer> tm = new TreeMap<>();

			// Adding elements to the tree map
			tm.put("A", 1);
			tm.put("C", 3);
			tm.put("B", 2);
			System.out.println(tm);
			
			// Getting values from the tree map
			int valueA = tm.get("A");
			System.out.println("Value of A: " + valueA);

			// Removing elements from the tree map
			tm.remove("B");

			// Iterating over the elements of the tree map
			for (String key : tm.keySet()) 
			{
				System.out.println("Key: " + key + ", Value: " + tm.get(key));
			}
		}
	}