package day_31;

import java.util.Arrays;
import java.util.List;

public class GenerecArrayTopCasting2 {
	public static void main(String[] args) {
		
//		How to convert the static array into dynamic array		
		
		String sa [] = {"Shubham", "Balaji", "Pawar"}; 
			
		
		List<String> da = Arrays.asList(sa);
		System.out.println(da);
		
		da.add("Nanded");
		da.add("India");
		
		System.out.println(da.size());
		System.out.println(da);
		
	}
}
