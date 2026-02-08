package day_33;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) 
	{
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put("One", 1);
		ht.put("Two", 2);
//		ht.put(null, null);
//		ht.put(null, 3);
//		ht.put("Four", null);
		ht.put("Five", 1);
		ht.put("One", 6);
		
		System.out.println(ht);
		System.out.println(ht.size());
		
		
		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("Shubham", "Pawar");
		ht1.put("Komal", "Pawar");
		ht1.put("Shubham", "P");
		
		System.out.println(ht1);
		
		
	}

}
