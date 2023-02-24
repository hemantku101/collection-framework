package test;
import java.util.HashMap;
public class Demo {
	public static void main(String[] args) {
		HashMap<String,Float> hm=new HashMap<>();
		hm.put("James gosling", 50000.00f);
		hm.put("Ed frank", 23000.00f);
		hm.put("Patrick naughton", 450000.00f);
		hm.put("chris warth", 290000.00f);
		hm.put("mike sheridan", 44000.00f);
		
		System.out.println(hm);
	}
}
