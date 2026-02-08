package day_31;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {
	public static void main(String[] args) {
		
		ArrayList<String> Ar = new ArrayList<String>();
		
		Ar.add("Shubham");
		Ar.add("Pawar");
		Ar.add("Komal");
		Ar.add("Avir");
		Ar.add("Golu");
		
//		Sorting method of collections class
		
		Collections.sort(Ar);
		System.out.println(Ar);
		
//		Reverse method
		Collections.reverse(Ar);
		System.out.println(Ar);
		
//		Swapping index values
		Collections.swap(Ar, 1, 0);
		System.out.println(Ar);
		
		
	}
}
