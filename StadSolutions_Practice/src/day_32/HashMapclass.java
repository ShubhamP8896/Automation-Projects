package day_32;

import java.util.HashMap;

public class HashMapclass 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
//		we used put () method to add key and value in hashmap
		
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
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(500, "Great");
		map1.put(400, "Good");
		map1.put(300, "Avarage");
		
//		remove method used to remove specific key and value pair from given key value
		map1.remove(500);
		System.out.println(map1);     
		
//		clear(); used to remove all the elements.
		map1.clear();
		
		
		
	}

}
