package day_32;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(101, "Shubham");			//this is duplicate
		map.put(102, "Komal");
		map.put(null, null);				//this is duplicate
		map.put(103, "Shubham");            // print this latest value  
		map.put(null, "SBP");				// print this latest value 
		map.put(101, "SP");					// print this latest value 
		map.put(105, null);
		
//		get() method used to get the value from given key 
		System.out.println(map.get(101));       // if duplicate available then print latest occurrence
		
//		For print directly
		System.out.println(map.size());
		System.out.println(map);
		
//		for print using for each 
		for(String S : map.values())    // we used Integer for key so we used Integer here
		{
			System.out.println(S);
		}
		
		
	}
}
