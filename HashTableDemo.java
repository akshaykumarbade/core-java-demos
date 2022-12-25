package demos;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Integer> h = new Hashtable<String, Integer>();
		h.put("Defender", 3);
		h.put("Dust", 1);
		h.put("Mercedez", 4);
		
		Enumeration<String> e= h.keys();
		
		while(e.hasMoreElements()) {
			String key= e.nextElement();
			System.out.println(key+" "+h.get(key));
		}

	}

}
