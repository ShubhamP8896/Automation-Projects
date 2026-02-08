package day_33;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Shubham");
		hs.add("Pawar");
		hs.add("Shubham");             // duplicate values are not print, print only one Shubham
		hs.add("RST");	
		hs.add(null);        // able to add null values
		
		System.out.println(hs);
		System.out.println(hs.size());   // size showing 3 becasue duplicate value at index 0 and 2
		System.out.println(hs.getClass());     // print the class name which import from java.util
		
		
	}
}
