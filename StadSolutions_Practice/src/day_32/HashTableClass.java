package day_32;

import java.util.Hashtable;

//Is is same like HashMap but it will not take Null as Key and Value

public class HashTableClass 
{
	public static void main(String[] args) {
		
		Hashtable<String, String> map = new Hashtable<String, String>();
		map.put("Shubham", "Pawar");
//		map.put(null, "More");        showing null pointer exception
//		map.put("Komal", null);     showing null pointer exception
		
		map.put("Komal", "Pawar");
		map.put("Avir", "more");
		map.put("Sneha", "Pawar-More");
		
		System.out.println(map);
	}

}
